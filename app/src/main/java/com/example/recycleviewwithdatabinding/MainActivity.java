package com.example.recycleviewwithdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.recycleviewwithdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       binding.recycle.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter=new MyAdapter(getstudent());
        binding.recycle.setAdapter(adapter);


    }
    public List<Student>getstudent()
    {

        List<Student> slist=new ArrayList<>();
        slist.add(new Student("Kisna","Engineering"));
        slist.add(new Student("raman","B.TEch"));
        slist.add(new Student("RAj","M.Tech"));
        slist.add(new Student("Mnanan","Doctor"));
        slist.add(new Student("Vrajat","MBA"));
        slist.add(new Student("Prince","Bca"));
        slist.add(new Student("Ayush","B.Tech"));
        slist.add(new Student("Aditya","Diploma"));
        slist.add(new Student("Rahul","Engineering"));
        slist.add(new Student("Kishna","B.TEch"));
        slist.add(new Student("RAj","B.Tech"));
        slist.add(new Student("Karan","Teacher"));
        slist.add(new Student("Kevin","Ca"));
        slist.add(new Student("Prince","Ca"));
        slist.add(new Student("Krish","B.Tech"));
        slist.add(new Student("Dheer","Diploma"));
        return slist;


    }
}