package com.wooeun18.bnvtemplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Tab03Fragment extends Fragment {

    ArrayList<Tab03RecyclerItem> items = new ArrayList<>();
    RecyclerView recyclerView;
    Tab03Adapter adapter;

    ArrayList<Tab03RecyclerItem> items2 = new ArrayList<>();
    RecyclerView recyclerView2;
    Tab03Adapter adapter2;

    ArrayList<Tab03RecyclerItem> items3 = new ArrayList<>();
    RecyclerView recyclerView3;
    Tab03Adapter adapter3;

    //프레그먼트가 처음 만들어잘때
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData(); //서버에서 데이터 불러오는 작업
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab03, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //여기서 xml의 뷰들에 대한 find 작업
        recyclerView=view.findViewById(R.id.recycler);
        adapter= new Tab03Adapter(getActivity(),items);
        recyclerView.setAdapter(adapter);

        recyclerView2=view.findViewById(R.id.recycler2);
        adapter2= new Tab03Adapter(getActivity(),items2);
        recyclerView2.setAdapter(adapter2);

        recyclerView3= view.findViewById(R.id.recycler3);
        adapter3= new Tab03Adapter(getActivity(),items3);
        recyclerView3.setAdapter(adapter3);
    }
    //서버에서 데이터를 불러들이는 메소드
    void loadData() {
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());
        items.add(new Tab03RecyclerItem());

        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());
        items2.add(new Tab03RecyclerItem());

        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
        items3.add(new Tab03RecyclerItem());
    }

}














