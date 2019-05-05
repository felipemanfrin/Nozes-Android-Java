package com.example.ehnozes;

import android.content.Intent;
import android.icu.util.RangeValueIterator;
import android.renderscript.Element;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public EditText user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.edtUser);
        password = (EditText) findViewById(R.id.edtPassword);
    }
    public void logar(View v){
        String rh = user.getText().toString();
        if (rh.isEmpty()){
            Toast.makeText(getApplicationContext(),"Deu certo"+ rh,Toast.LENGTH_LONG).show();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
        //else{
            Toast.makeText(getApplicationContext(),""+ rh,Toast.LENGTH_LONG).show();
        //}
    }
}
