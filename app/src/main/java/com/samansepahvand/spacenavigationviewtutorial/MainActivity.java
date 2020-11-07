package com.samansepahvand.spacenavigationviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

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

        spaceNavigationView=findViewById(R.id.space);

        spaceNavigationView.addSpaceItem(new SpaceItem("e",R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("P",R.drawable.ic_baseline_person_24));
       // spaceNavigationView.addSpaceItem(new SpaceItem("Home",R.drawable.ic_baseline_home_24));

        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_baseline_home_24);

        spaceNavigationView.addSpaceItem(new SpaceItem("s",R.drawable.ic_baseline_settings_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("m",R.drawable.ic_baseline_person_24));


        spaceNavigationView.setSpaceOnClickListener(this);
        spaceNavigationView.setSpaceOnLongClickListener(this);

//        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
//            @Override
//            public void onCentreButtonClick() {
//                Log.e(TAG, "onCentreButtonClick: "+"OK!" );
//            }
//
//            @Override
//            public void onItemClick(int itemIndex, String itemName) {
//                Log.e(TAG, "onItemClick: "+"itemIndex:"+itemIndex+" itemName:"+itemName);
//            }
//
//            @Override
//            public void onItemReselected(int itemIndex, String itemName) {
//                Log.e(TAG, "onItemReselected: "+"itemIndex:"+itemIndex+" itemName:"+itemName);
//            }
//        });



//        spaceNavigationView.setSpaceOnLongClickListener(new SpaceOnLongClickListener() {
//            @Override
//            public void onCentreButtonLongClick() {
//                Toast.makeText(MainActivity.this, "Home Selected !", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onItemLongClick(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this,  itemIndex+"="+itemName+" Selected !", Toast.LENGTH_SHORT).show();
//            }
//        });

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