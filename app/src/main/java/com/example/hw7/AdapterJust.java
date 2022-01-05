package com.example.hw7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7.databinding.ItemListBinding;

import java.util.ArrayList;

public class AdapterJust extends RecyclerView.Adapter<AdapterJust.ViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void setList(ArrayList<Integer> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemListBinding binding;

        public ViewHolder(ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Integer integer) {
            binding.imageView.setImageResource(integer);
        }
    }
}
