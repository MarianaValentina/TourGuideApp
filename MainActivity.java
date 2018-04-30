package com.example.marry.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter (this, getSupportFragmentManager());

        // Set the adapter onto the view pager - link them together
        viewPager.setAdapter(categoryAdapter);

        //find the id of the tab that will display the fragments
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        //set the tab to display the fragments, this is the link between the tab and the viewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}
