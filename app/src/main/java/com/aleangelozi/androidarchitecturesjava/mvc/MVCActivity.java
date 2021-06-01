package com.aleangelozi.androidarchitecturesjava.mvc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aleangelozi.androidarchitecturesjava.R;

public class MVCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        setTitle("MVC Activity");
    }

    public static Intent getIntent(Context context) {
        return new Intent(context, MVCActivity.class);
    }
}