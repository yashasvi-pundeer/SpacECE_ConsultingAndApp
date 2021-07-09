package com.sphydro.spaece_activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.sphydro.spaece_activity.R;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchActivity extends AppCompatActivity {

    ListView search;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search = (ListView) findViewById(R.id.search_items);
        ArrayList<String> searchArray = new ArrayList<>();
        searchArray.addAll(Arrays.asList(getResources().getStringArray(R.array.items)));

        adapter = new ArrayAdapter<String>(
                SearchActivity.this,
                android.R.layout.simple_list_item_1,
                searchArray
        );

        search.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
        MenuItem item = menu.findItem(R.id.search_items);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}