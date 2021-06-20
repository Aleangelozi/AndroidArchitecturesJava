package com.aleangelozi.androidarchitecturesjava;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aleangelozi.androidarchitecturesjava.mvc.MVCActivity;
import com.aleangelozi.androidarchitecturesjava.mvp.MVPActivity;
import com.aleangelozi.androidarchitecturesjava.mvvm.MVVMActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Android Architectures - Java");
    }

    public void onMVC(View view) {startActivity(MVCActivity.getIntent(this));}

    public void onMVP(View view) {startActivity(MVPActivity.getIntent(this));}

    public void onMVVM(View view) {startActivity(MVVMActivity.getIntent(this));}
}