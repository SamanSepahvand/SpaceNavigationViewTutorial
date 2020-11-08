package com.samansepahvand.spacenavigationviewtutorial.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.samansepahvand.spacenavigationviewtutorial.R;

public class CategoryFragment extends Fragment {

    ListView listView;
    String[] listItem ;


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_category, container, false);
        listView = (ListView) view.findViewById(R.id.listview);
        initListview();
        return view;


    }


    private void initListview() {
        listItem = getResources().getStringArray(R.array.array_technology);
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                 android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);
    }
}