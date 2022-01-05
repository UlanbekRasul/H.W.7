package com.example.hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.databinding.FragmentBlankBinding;

import java.util.ArrayList;

public class BlankFragment extends Fragment {

    private AdapterJust adapter;
    private FragmentBlankBinding binding;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initView() {
        adapter = new AdapterJust();
        binding.recycler2.setAdapter(adapter);
        adapter.setList(createList());
    }

    private ArrayList<Integer> createList() {
        for (int i = 0; i < 100; i++) {
            list.add(R.drawable.ic_favorite);
        }
        return list;
    }
}