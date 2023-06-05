package com.example.seatour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.example.seatour.databinding.ActivityMainBinding;

import java.util.ArrayList;
public class CategoriesActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int[] imageList = {R.drawable.pasta, R.drawable.maggi, R.drawable.cake, R.drawable.pancake, R.drawable.pizza, R.drawable.burger, R.drawable.fries};
        int[] ingredientList = {R.string.pastaIngredients, R.string.maggiIngredients,R.string.cakeIngredients,R.string.pancakeIngredients,R.string.pizzaIngredients, R.string.burgerIngredients, R.string.friesIngredients};
        int[] descList = {R.string.pastaDesc, R.string.maggieDesc, R.string.cakeDesc,R.string.pancakeDesc,R.string.pizzaDesc, R.string.burgerDesc, R.string.friesDesc};
        String[] nameList = {"Dana marina", "Fishing trip", "Jubail Sea", "Jana", "Podel"," Boat RIV", "CC Trip"};
        String[] timeList = {" 150 riyals", "120 riyals", "180 riyals","300 riyals", "180 riyals", "120 riyals", "180 riyals"};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(CategoriesActivity.this, dataArrayList);
        binding.Lists.setAdapter(listAdapter);
        binding.Lists.setClickable(true);
        binding.Lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent DetailedActivity = new Intent(CategoriesActivity.this, DetailedActivity.class);
                DetailedActivity.putExtra("name", nameList[i]);
                DetailedActivity.putExtra("time", timeList[i]);
                DetailedActivity.putExtra("ingredients", ingredientList[i]);
                DetailedActivity.putExtra("desc", descList[i]);
                DetailedActivity.putExtra("image", imageList[i]);
                startActivity(DetailedActivity);
            }
        });
    }
}