package com.example.nozes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Inserir dados
        /*ImageButton botaoadd = (ImageButton) findViewById(R.id.btnAddProfile);
        botaoadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                DBController crud = new DBController(getBaseContext());
                String name = "NomeTeste";
                String lastName = "SobreNomeTeste";
                String jobRole = "JobRoleTeste";
                String team = "TeamTeste";
                String email = "EmailTeste";
                String gender = "GenderTeste";
                Integer age = 1;

                String resultado = crud.insertProfile(name, lastName, jobRole, team, email, gender, age);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });*/
        //Edita dados
        ImageButton botaoedt = (ImageButton) findViewById(R.id.btnEditProfile);
        botaoedt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
        //Exclui dados
        ImageButton botaorem = (ImageButton) findViewById(R.id.btnRemoveProfile);
        botaorem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
    }
    public void cadastrar(){

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
