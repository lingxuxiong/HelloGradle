package com.neil.hellogradle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String message = BuildConfig.enableLog ? "Logging enabled." : "Logging disabled.";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
