package com.robynandcory.pdxbeerfinder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{AppContext.getContext().getString(R.string.restaurants), AppContext.getContext().getString(R.string.breweries), AppContext.getContext().getString(R.string.bars), AppContext.getContext().getString(R.string.stores)};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //returns the number of fragment pages
    @Override
    public int getCount() {
        //update with the number of fragment pages
        return 4;
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