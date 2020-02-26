package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button launchDetailActivity = findViewById(R.id.launchbutton);

        launchDetailActivity = new Button(this);

        launchDetailActivity.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                LaunchDetailActivityClicked();
            }

        });

    }

    public void LaunchDetailActivityClicked() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

}

