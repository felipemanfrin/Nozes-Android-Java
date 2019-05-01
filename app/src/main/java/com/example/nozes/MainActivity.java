package com.example.nozes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button log;
    private TextView forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button) findViewById(R.id.btnLogin);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });
        forgot = (TextView) findViewById(R.id.txtForgot);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                forgot();
            }
        });

    }
    private void logar(){
        startActivity(new Intent(MainActivity.this, InicialActivity.class));
    }
    private void forgot(){
        startActivity(new Intent(MainActivity.this, ForgotActivity.class));
    }
}
