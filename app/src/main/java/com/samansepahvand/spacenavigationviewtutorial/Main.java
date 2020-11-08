package com.samansepahvand.spacenavigationviewtutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.samansepahvand.spacenavigationviewtutorial.fragment.CategoryFragment;
import com.samansepahvand.spacenavigationviewtutorial.fragment.HelpFragment;
import com.samansepahvand.spacenavigationviewtutorial.fragment.HomeFragment;
import com.samansepahvand.spacenavigationviewtutorial.fragment.ProfileFragment;
import com.samansepahvand.spacenavigationviewtutorial.fragment.SettingFragment;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Main extends AppCompatActivity implements SpaceOnClickListener {

    SpaceNavigationView spaceNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
        setSpaceNavigationData();

      //  spaceNavigationView.initWithSaveInstanceState(savedInstanceState);

        configRotate();
        loadFragment(new HomeFragment());
        spaceNavigationView.changeCurrentItem(-1);

    }

    private  void configRotate(){
        int orientation=this.getResources().getConfiguration().orientation;
        if (orientation== Configuration.ORIENTATION_PORTRAIT){
            spaceNavigationView.showIconOnly();
        }else if (orientation== Configuration.ORIENTATION_LANDSCAPE){

            ////
        }

    }
    private  void setSpaceNavigationData(){

        spaceNavigationView.addSpaceItem(new SpaceItem("تنظبمات", R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("پروفایل", R.drawable.ic_baseline_person_24));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_home_24);
        spaceNavigationView.addSpaceItem(new SpaceItem("راهنمایی", R.drawable.ic_baseline_help_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("دسته بندی", R.drawable.ic_baseline_menu_book_24));
        initSpaceCustomStyle();
        spaceNavigationView.setSpaceOnClickListener(this);


    }
    private void initSpaceCustomStyle() {

        spaceNavigationView.setSpaceBackgroundColor(ContextCompat.getColor(this, R.color.colorWhite));
        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this, R.color.colorAccent));

        spaceNavigationView.setActiveSpaceItemColor(ContextCompat.getColor(this, R.color.colorPrimary));
        spaceNavigationView.setInActiveSpaceItemColor(ContextCompat.getColor(this, R.color.colorAccent));

        spaceNavigationView.setSpaceItemIconSize((int) getResources().getDimension(R.dimen.spaceIconSize));
        //
        //spaceNavigationView.setSpaceItemIconSizeInOnlyIconMode((int) getResources().getDimension(R.dimen.spaceIconSize));

        spaceNavigationView.setSpaceItemTextSize((int) getResources().getDimension(R.dimen.spaceTextSize));




       Typeface myFont= Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf");
        spaceNavigationView.setFont(myFont);
        // spaceNavigationView.setFont(Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf"));

        spaceNavigationView.setCentreButtonRippleColor(ContextCompat.getColor(this,R.color.colorDark));



    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
      //  spaceNavigationView.onSaveInstanceState(outState);
    }
    private  void initView(){
        spaceNavigationView=findViewById(R.id.space);

    }

    private void loadFragment(Fragment fragment){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.frame_container,fragment);
        transaction.commit();

    }


    @Override
    public void onCentreButtonClick() {
        loadFragment(new HomeFragment());
    }

    @Override
    public void onItemClick(int itemIndex, String itemName) {

        switch (itemIndex){
            case 0:
                loadFragment(new SettingFragment());
                break;
            case 1:
                loadFragment(new ProfileFragment());
                break;
            case 2:
                loadFragment(new HelpFragment());
                break;
            case 3:
                loadFragment(new CategoryFragment());
                break;

        }

    }

    @Override
    public void onItemReselected(int itemIndex, String itemName) {

    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


}