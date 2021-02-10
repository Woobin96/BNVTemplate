package com.wooeun18.bnvtemplate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Tab02PageAdapter extends FragmentPagerAdapter {

    Fragment[] pages= new Fragment[2];
    String[] titles= new String[] {"AA" , "BB"};

    public Tab02PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        pages[0]= new AAFragment();
        pages[1]= new BBFragment();

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    //뷰페이저의 갯수대로 보여줄 탭 레이아웃의 제목글씨를 리턴해주는 메소드 .
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
