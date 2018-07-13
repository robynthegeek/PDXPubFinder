package com.robynandcory.pdxbeerfinder;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * PDX Beerfinder displays 4 lists of locations in Portland Oregon
 * to sample the City's famous Beer.
 *
 * Reference credits to:
 * https://github.com/udacity/ud839_Miwok
 * https://www.youtube.com/watch?v=6yMYcluvqbs
 * https://stackoverflow.com/questions/4391720/how-can-i-get-a-resource-content-from-a-static-context/4391811#4391811
 * https://github.com/TheBaileyBrew/Angry_Nerds_Demo_Recycler
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
