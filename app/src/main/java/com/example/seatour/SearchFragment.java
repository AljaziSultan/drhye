package com.example.seatour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.support.v7.app.AppCompatActivity;

public class SearchFragment extends AppCompatActivity {

    ListView listview;
    ArrayAdapter<String> arrayadapter;
    String[] SearchList = {"BoatName1","BoatName2","BoatName3","BoatName4"};
    private int contentView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_search);
        // Inflate the layout for this fragment
        listview= findViewById(R.id.liS);
        arrayadapter= new ArrayAdapter<String>(this, R.layout.list_customtext, SearchList);
        listview.setAdapter(arrayadapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_menu, menu);
        MenuItem item2= menu.findItem(R.id.search);
        SearchView searchView =(SearchView) item2.getActionView();


        searchView.setQueryHint("Search Here");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayadapter.getFilter().filter(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }}

