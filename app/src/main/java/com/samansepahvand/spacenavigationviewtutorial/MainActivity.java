package com.samansepahvand.spacenavigationviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.luseen.spacenavigation.SpaceOnLongClickListener;

public class MainActivity extends AppCompatActivity implements SpaceOnClickListener, SpaceOnLongClickListener {

    private static final String TAG="tags";


    SpaceNavigationView spaceNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initSpaceNavigationView();



    }


    private  void initSpaceCustomStyle(){

        spaceNavigationView.setSpaceBackgroundColor(ContextCompat.getColor(this,R.color.colorWhite));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_person_24);
        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this,R.color.colorAccent));

        spaceNavigationView.setActiveSpaceItemColor(ContextCompat.getColor(this,R.color.colorPrimary));
        spaceNavigationView.setInActiveSpaceItemColor(ContextCompat.getColor(this,R.color.colorDark));

        spaceNavigationView.setSpaceItemIconSize((int) getResources().getDimension(R.dimen.spaceIconSize));
        //
        //spaceNavigationView.setSpaceItemIconSizeInOnlyIconMode((int) getResources().getDimension(R.dimen.spaceIconSize));

        spaceNavigationView.setSpaceItemTextSize((int) getResources().getDimension(R.dimen.spaceTextSize));

      //  spaceNavigationView.showIconOnly();
        spaceNavigationView.showTextOnly();




    }
    private void initSpaceNavigationView() {

        spaceNavigationView.addSpaceItem(new SpaceItem("e",R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("P",R.drawable.ic_baseline_person_24));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_home_24);
        spaceNavigationView.addSpaceItem(new SpaceItem("s",R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("m",R.drawable.ic_baseline_person_24));

        initSpaceCustomStyle();


        spaceNavigationView.setSpaceOnClickListener(this);
        spaceNavigationView.setSpaceOnLongClickListener(this);
    }
    private void initView() {
        spaceNavigationView=findViewById(R.id.space);
    }

    @Override
    public void onCentreButtonClick() {
        Log.e(TAG, "onCentreButtonClick: "+"OK!" );
    }
    @Override
    public void onItemClick(int itemIndex, String itemName) {
        Log.e(TAG, "onItemClick: "+"itemIndex:"+itemIndex+" itemName:"+itemName);
    }
    @Override
    public void onItemReselected(int itemIndex, String itemName) {
        Log.e(TAG, "onItemReselected: "+"itemIndex:"+itemIndex+" itemName:"+itemName);
    }
    @Override
    public void onCentreButtonLongClick() {
        Toast.makeText(MainActivity.this, "Home Selected !", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onItemLongClick(int itemIndex, String itemName) {
        Toast.makeText(MainActivity.this,  itemIndex+"="+itemName+" Selected !", Toast.LENGTH_SHORT).show();
    }
}