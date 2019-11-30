package com.wormmark.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Log.e(TAG, "Creating");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG, "Starting");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "Resuming");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "Pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Stopping");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Restarting");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Destroying");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG,"Saving state");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "Restoring state");
    }
}
