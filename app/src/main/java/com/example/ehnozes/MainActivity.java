package com.example.ehnozes;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Fragment selectFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //selectFragment = new PersonFragment();

            switch (item.getItemId()) {
                case R.id.navigation_person:
                    selectFragment = new PersonFragment();
                    break;
                case R.id.navigation_tasks:
                    selectFragment = new TasksFragment();
                    break;
                case R.id.navigation_meetings:
                    selectFragment = new MeetingsFragment();
                    break;
                case R.id.navigation_settings:
                    selectFragment = new SettingsFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //coloca como padrão o framePerson
        selectFragment = new PersonFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();
    }
}
