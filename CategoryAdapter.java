package com.example.marry.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //variable to use for getting the name of the Fragment
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * set the Fragments
     * @param position tehe position of each fragment
     * @return the Fragments
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StartFragment();
        } else if (position == 1) {
            return new SightsToVisitFragment() ;
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new OutdoorFragment();
        }
    }

    /**
     * set the title of all the fragments
     * @param position - the position of each fragment
     * @return the string with the name of each fragment
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.StartFragment);
        } else if (position == 1) {
            return mContext.getString(R.string.SightsToVisitFragment );
        } else if (position == 2) {
            return mContext.getString(R.string.RestaurantsFragment);
        } else {
            return mContext.getString(R.string.EventsFragment);
        }
    }

    /**
     * function to return the number of fragments
     * @return - the number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }
}
