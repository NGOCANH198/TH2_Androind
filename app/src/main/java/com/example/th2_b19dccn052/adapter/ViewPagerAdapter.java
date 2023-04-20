package com.example.th2_b19dccn052.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.th2_b19dccn052.fragment.FragmentHistory;
import com.example.th2_b19dccn052.fragment.FragmentSearch;
import com.example.th2_b19dccn052.fragment.FragmentToday;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private int numPage ;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        numPage=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new FragmentToday();
            case 1 : return new FragmentHistory();
            case 2 : return new FragmentSearch();
        }
        return new FragmentToday();
    }

    @Override
    public int getCount() {
        return numPage;
    }
}
