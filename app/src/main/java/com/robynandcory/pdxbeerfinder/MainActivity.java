package com.robynandcory.pdxbeerfinder;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Point the ViewPager to the viewpager in the activity_main xml file
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        //create an adapter to show the pub fragments
        SimpleFragmentPagerAdapter pubAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        //set our pubAdapter on our new viewPager
        viewPager.setAdapter(pubAdapter);



    }
}
