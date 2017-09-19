package com.example.simonanger.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_rps);
    }

    public void onBeginButtonClicked(View button) {
        Intent intent = new Intent(this, RPSActivity.class);
        startActivity(intent);
    }
}
