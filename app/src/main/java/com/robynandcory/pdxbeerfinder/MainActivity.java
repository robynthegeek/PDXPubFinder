package com.robynandcory.pdxbeerfinder;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


/**
 * https://www.youtube.com/watch?v=6yMYcluvqbs
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //find the Toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable/backgroundpdx);

        //Point the ViewPager to the viewpager in the activity_main xml file
        ViewPager viewPager = findViewById(R.id.viewpager);

        //create an adapter to show the pub fragments
        SimpleFragmentPagerAdapter pubAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        //set our pubAdapter on our new viewPager
        viewPager.setAdapter(pubAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager, true);


    }
}
