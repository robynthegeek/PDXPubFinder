package com.robynandcory.pdxbeerfinder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int ITEM_COUNT = 4;
    private String tabTitles[] = new String[] { "Restaurants", "Breweries", "Bars", "Stores" };

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //returns number of pages
    @Override
    public int getCount() {
        return ITEM_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new BreweriesFragment();
        } else if (position == 2) {
            return new BarsFragment();
        } else {
            return new StoresFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}