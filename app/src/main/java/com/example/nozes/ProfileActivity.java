package com.example.nozes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void onTask(View view){
        startActivity(new Intent(ProfileActivity.this, TaskActivity.class));
        finish();
    }
    public void onMeeting(View view){
        startActivity(new Intent(ProfileActivity.this, MeetingActivity.class));
        finish();
    }
}
