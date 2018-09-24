package com.example.jiangzhiguo.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jiangzhiguo on 17/7/27.
 */
public class PagerAdapter extends FragmentPagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return position==0?new MyFragment():new AnotherFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
