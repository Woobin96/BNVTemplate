package com.wooeun18.bnvtemplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Tab02Fragment extends Fragment {

    TabLayout tabLayout;
    ViewPager pager;
    Tab02PageAdapter pageAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab02, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //여기서 xml의 뷰들에 대한 find 작업
        tabLayout= view.findViewById(R.id.layout_tab);
        pager= view.findViewById(R.id.pager);
        pageAdapter= new Tab02PageAdapter(getFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pager.setAdapter(pageAdapter);

        //탭 레이아웃과 뷰페이저를 연동 .
        tabLayout.setupWithViewPager(pager);

    }
}
