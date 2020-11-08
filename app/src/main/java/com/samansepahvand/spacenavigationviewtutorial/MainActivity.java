package com.samansepahvand.spacenavigationviewtutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.luseen.spacenavigation.SpaceOnLongClickListener;

public class MainActivity extends AppCompatActivity implements SpaceOnClickListener, SpaceOnLongClickListener {

    private static final String TAG = "tags";


    SpaceNavigationView spaceNavigationView;


    Button showBadge;

    Typeface myFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         myFont=Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf");

        initView();
        initSpaceNavigationView();

        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);

        showBadge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBadge();
            }
        });
        showBadge.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Change();
                return false;
            }
        });



    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        spaceNavigationView.onSaveInstanceState(outState);
    }

    private  void Change(){

        spaceNavigationView.changeCenterButtonIcon(R.drawable.ic_baseline_home_24);

        spaceNavigationView.changeItemIconAtPosition(0,R.drawable.ic_baseline_home_24);
        spaceNavigationView.changeItemTextAtPosition(3,"news");

        spaceNavigationView.changeSpaceBackgroundColor(ContextCompat.getColor(this,R.color.colorDark));


        spaceNavigationView.changeBadgeTextAtIndex(3,20);

    }
    private void initBadge() {
        //show badge
        spaceNavigationView.shouldShowFullBadgeText(false);
        spaceNavigationView.showBadgeAtIndex(0, 9, Color.RED);
        spaceNavigationView.showBadgeAtIndex(1, 32, Color.BLUE);
        spaceNavigationView.showBadgeAtIndex(2, 10, Color.BLACK);
        spaceNavigationView.showBadgeAtIndex(3, 80, Color.GREEN);

    }

    private void initSpaceCustomStyle() {

        spaceNavigationView.setSpaceBackgroundColor(ContextCompat.getColor(this, R.color.colorWhite));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_person_24);
        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this, R.color.colorAccent));

        spaceNavigationView.setActiveSpaceItemColor(ContextCompat.getColor(this, R.color.colorPrimary));
        spaceNavigationView.setInActiveSpaceItemColor(ContextCompat.getColor(this, R.color.colorDark));

        spaceNavigationView.setSpaceItemIconSize((int) getResources().getDimension(R.dimen.spaceIconSize));
        //
        //spaceNavigationView.setSpaceItemIconSizeInOnlyIconMode((int) getResources().getDimension(R.dimen.spaceIconSize));

        spaceNavigationView.setSpaceItemTextSize((int) getResources().getDimension(R.dimen.spaceTextSize));

        // spaceNavigationView.showIconOnly();
        //  spaceNavigationView.showTextOnly();


        spaceNavigationView.setFont(myFont);
     // spaceNavigationView.setFont(Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf"));

spaceNavigationView.setCentreButtonRippleColor(ContextCompat.getColor(this,R.color.colorDark));



    }

    private void initSpaceNavigationView() {

        spaceNavigationView.addSpaceItem(new SpaceItem("تنظبمات", R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("پروفایل", R.drawable.ic_baseline_person_24));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_home_24);
        spaceNavigationView.addSpaceItem(new SpaceItem("راهنمایی", R.drawable.ic_baseline_help_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("دسته بندی", R.drawable.ic_baseline_menu_book_24));

        initSpaceCustomStyle();


        spaceNavigationView.setSpaceOnClickListener(this);
        spaceNavigationView.setSpaceOnLongClickListener(this);


    }

    private void initView() {
        spaceNavigationView = findViewById(R.id.space);
        showBadge = findViewById(R.id.show_badge);
    }

    @Override
    public void onCentreButtonClick() {
        Log.e(TAG, "onCentreButtonClick: " + "OK!");



        startActivity(new Intent(MainActivity.this,DetailsActivity.class));

    }

    @Override
    public void onItemClick(int itemIndex, String itemName) {
        Log.e(TAG, "onItemClick: " + "itemIndex:" + itemIndex + " itemName:" + itemName);
        //spaceNavigationView.hideAllBadges();
        spaceNavigationView.hideBadgeAtIndex(itemIndex);
    }

    @Override
    public void onItemReselected(int itemIndex, String itemName) {
        Log.e(TAG, "onItemReselected: " + "itemIndex:" + itemIndex + " itemName:" + itemName);
    }

    @Override
    public void onCentreButtonLongClick() {
        Toast.makeText(MainActivity.this, "Home Selected !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemLongClick(int itemIndex, String itemName) {
        Toast.makeText(MainActivity.this, itemIndex + "=" + itemName + " Selected !", Toast.LENGTH_SHORT).show();
    }
}