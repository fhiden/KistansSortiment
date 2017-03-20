package org.filip.hiden.sortement.kistan.sortement.model.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.filip.hiden.sortement.kistan.sortement.model.FragmentManagers.SortementFragment;

import java.util.ArrayList;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    ArrayList<String> categories;
    public SectionsPagerAdapter(FragmentManager fm, ArrayList<String> categories) {
        super(fm);
        this.categories =  categories;
    }

    @Override
    public Fragment getItem(int position) {
        return new SortementFragment((String) getPageTitle(position));
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
       return categories.get(position);
    }
}