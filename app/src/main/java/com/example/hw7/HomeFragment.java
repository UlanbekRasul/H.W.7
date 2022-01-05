package com.example.hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private final ArrayList<Posts> list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
        initView();
        createList();
    }

    private ArrayList<Posts> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(new Posts(R.drawable.img, "Good morning"));
            list.add(new Posts(R.drawable.img, "Good day"));
            list.add(new Posts(R.drawable.img, "Good afternoon"));
            list.add(new Posts(R.drawable.img, "Good evening"));
            list.add(new Posts(R.drawable.img, "Good night"));
        }
        return list;
    }

    private void initView() {
        PostAdapter adapter = new PostAdapter();
        binding.recycler.setAdapter(adapter);
        adapter.setList(createList());
    }
}