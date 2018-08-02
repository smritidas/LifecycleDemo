package com.example.android.lifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "TXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}


