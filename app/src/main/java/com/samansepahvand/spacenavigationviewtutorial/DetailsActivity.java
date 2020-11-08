package com.samansepahvand.spacenavigationviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;

public class DetailsActivity extends AppCompatActivity {


    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initView();
    }

    private void initView() {
        spaceNavigationView = findViewById(R.id.space);
        spaceNavigationView.addSpaceItem(new SpaceItem("تنظبمات", R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("پروفایل", R.drawable.ic_baseline_person_24));
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_home_24);
        spaceNavigationView.addSpaceItem(new SpaceItem("راهنمایی", R.drawable.ic_baseline_help_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("دسته بندی", R.drawable.ic_baseline_menu_book_24));
    }
}