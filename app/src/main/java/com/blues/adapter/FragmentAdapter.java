package com.blues.adapter;


import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int arg0) {
        return mFragments.get(arg0);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
