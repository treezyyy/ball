package com.example.ball;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer svyat=0;
    Integer bon=0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("svyat")){
            svyat = savedInstanceState.getInt("svyat");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("bon")){
            bon = savedInstanceState.getInt("bon");
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.text1)).setText(svyat.toString());
        ((TextView)findViewById(R.id.text2)).setText(bon.toString());
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("svyat", svyat);
        outState.putInt("bon", bon);
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAddMar(View view) {
        svyat=svyat+1;
        TextView marView = findViewById(R.id.text1);
        marView.setText(svyat.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAddfss(View view) {
        bon=bon+1;
        ((TextView)findViewById(R.id.text2)).setText(bon.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAddDelete(View view) {
        svyat=0;
        bon=0;
        ((TextView)findViewById(R.id.text1)).setText(svyat.toString());
        ((TextView)findViewById(R.id.text2)).setText(bon.toString());
    }

}