package com.sphydro.spaece_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.sphydro.spaece_activity.Adapter.Adapter;
import com.sphydro.spaece_activity.Adapter.ConsultantDetailRecyclerView;
import com.sphydro.spaece_activity.Model.consultantDetail;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    RecyclerView consultantDetailRecyclerView;
    List<consultantDetail> consultantDetailList = new ArrayList<>();
//    ConsultantDetailRecyclerView Adapter ;
    Adapter adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        consultantDetailRecyclerView = findViewById(R.id.recyclerView);
        consultantDetailRecyclerView.setHasFixedSize(true);
        consultantDetailRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));
        consultantDetailList.add(new consultantDetail("Mohan" ,"12345", "chhsu@gmail.com", "9568951569" ));

        list.add("Mohan");
        list.add("Rihit");
        list.add("anjg");
        list.add("Shivam");

        adapter = new Adapter(consultantDetailList);
        consultantDetailRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


//        search = (ListView) findViewById(R.id.search_items);
//        ArrayList<String> searchArray = new ArrayList<>();
//        searchArray.addAll(Arrays.asList(getResources().getStringArray(R.array.items)));

//        adapter = new ArrayAdapter<String>(
//                SearchActivity.this,
//                android.R.layout.simple_list_item_1,
//                searchArray
//        );

//        search.setAdapter(adapter);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.search, menu);
//        MenuItem item = menu.findItem(R.id.search_items);
//        SearchView searchView = (SearchView) item.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter.getFilter().filter(newText);
//                return false;
//            }
//        });
//        return super.onCreateOptionsMenu(menu);
//    }
}