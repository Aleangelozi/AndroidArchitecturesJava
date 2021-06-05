package com.aleangelozi.androidarchitecturesjava.mvc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.aleangelozi.androidarchitecturesjava.R;

import java.util.ArrayList;
import java.util.List;

public class MVCActivity extends AppCompatActivity {

    private List<String> listValues = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private ListView list;
    private CountriesController controller;
    private Button retryButton;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        setTitle("MVC Activity");

        list = findViewById(R.id.list);
        adapter = new ArrayAdapter<>(this, R.layout.row_layout, R.id.listText, listValues);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MVCActivity.this, "You clicked " +
                        listValues.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        ArrayList<String> vals = new ArrayList<>();
        vals.add("USA");
        vals.add("Canada");
        vals.add("Brazil");
        vals.add("USA");
        vals.add("Canada");
        vals.add("Brazil");
        vals.add("USA");
        vals.add("Canada");
        vals.add("Brazil");
        setValues(vals);

    }

    private void setValues(List<String> values) {
        listValues.clear();
        listValues.addAll(values);
        adapter.notifyDataSetChanged();
    }


    public static Intent getIntent(Context context) {
        return new Intent(context, MVCActivity.class);
    }
}