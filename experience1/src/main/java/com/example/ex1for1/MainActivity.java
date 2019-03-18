package com.example.ex1for1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用onCreate()");
    }
    @Override
    protected void onStart() {
        Log.i("MainActivityLife","调用onStart()");
    }
        super.onStart();
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLife","调用onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivityLife","调用onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivityLife","调用onStop()");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MainActivityLife","调用onDestroy()");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("MainActivityLife","调用onRestart()");
    }
}
