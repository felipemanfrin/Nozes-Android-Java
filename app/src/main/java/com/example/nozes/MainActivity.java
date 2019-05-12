package com.example.nozes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private Button log;
    private TextView edtUser, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button) findViewById(R.id.btnLogin);
        edtUser = (TextView) findViewById(R.id.edtUser);
        edtPassword = (TextView) findViewById(R.id.edtPassword);

    }
    public void logar(View view){
            startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            Toast.makeText(getApplicationContext(), edtUser.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void forgot(View view){
        startActivity(new Intent(MainActivity.this, ForgotActivity.class));
    }
}
