package com.example.recycleviewwithdatabinding;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewwithdatabinding.databinding.SinglerawdesignBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder> {

    List<Student> slist;

    public MyAdapter(List<Student> slist) {
        this.slist = slist;

    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SinglerawdesignBinding binding = SinglerawdesignBinding.inflate(inflater, parent, false);
        return new myviewholder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        Student scurrent = slist.get(position);
        holder.singlerawdesignBinding.setStudentobject(scurrent);

    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {

        SinglerawdesignBinding singlerawdesignBinding;

        public myviewholder(@NonNull SinglerawdesignBinding singlerawdesignBinding) {
            super(singlerawdesignBinding.getRoot());
            this.singlerawdesignBinding = singlerawdesignBinding;

        }
    }

}
