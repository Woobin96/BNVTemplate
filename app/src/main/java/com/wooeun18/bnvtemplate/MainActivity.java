package com.wooeun18.bnvtemplate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    Fragment[] fragments= new Fragment[3];
    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager= getSupportFragmentManager();

        //tab01 이 기본 선택된 상태이므로
        //tab01Fragment 부터 화면데 붙이기
        FragmentTransaction tran= fragmentManager.beginTransaction();
        fragments[0]= new Tab01Fragment();
        tran.add(R.id.container, fragments[0]);
        tran.commit();


        bnv= findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //기존 프레그먼트를 다른 프레그먼트로 변경 [replace -> show/hide]
                FragmentTransaction tran= fragmentManager.beginTransaction();
                if (fragments[0] != null) tran.hide(fragments[0]);
                if (fragments[1] != null) tran.hide(fragments[1]);
                if (fragments[2] != null) tran.hide(fragments[2]);

                switch (item.getItemId()){
                    case R.id.bnv_tab01:
                        tran.show(fragments[0]);
                        break;

                    case R.id.bnv_tab02:
                        if (fragments[1] ==null){
                            fragments[1]= new Tab02Fragment();
                            tran.add(R.id.container,fragments[1]);
                        }
                        tran.show(fragments[1]);
                        break;

                    case R.id.bnv_tab03:
                        if (fragments[2] ==null){
                            fragments[2]= new Tab03Fragment();
                            tran.add(R.id.container,fragments[2]);
                        }
                        tran.show(fragments[2]);
                        break;
                }

                tran.commit();

                return true;
            }
        });

    }
}












