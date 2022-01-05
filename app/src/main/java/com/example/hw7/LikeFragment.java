package com.example.hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class LikeFragment extends Fragment {

    private ActivityAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Posts> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_like, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        adapter = new ActivityAdapter();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        adapter.setList(createList());
    }

    private ArrayList<Posts> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(new Posts(R.drawable.img, "@turtle liked your post", R.drawable.img));
        }
        return list;
    }
}