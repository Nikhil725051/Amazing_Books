package com.example.amazingbooks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    // Data to display.
    int[] books = {
            R.drawable.android_apprentice,
            R.drawable.android_app_development,
            R.drawable.android_programming_for_beginners,
            R.drawable.android_programming,
            R.drawable.head_first_android,
            R.drawable.hello_android,
            R.drawable.practical_android,
            R.drawable.practical_android};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        //Pass adapter to RecyclerView
        recyclerView.setAdapter(new BooksAdapter(books));

        //layout manager specifies how to arrange the views. Here I am using LinearLayoutManager.
        //Recycler view gives you more
        //options. You can choose to display views in a linear list, a grid, or
        //a staggered grid.
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
    }
}