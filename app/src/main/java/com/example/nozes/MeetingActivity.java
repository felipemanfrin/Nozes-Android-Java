package com.example.nozes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class MeetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting);

        //ListView listMeeting = (ListView) findViewById(R.id.lstMeetings);
        //ArrayAdapter arrayAdapter = new MeetingAdapter(this, addMeeting());
        //listMeeting.setAdapter(arrayAdapter);

        //Inserir dados
        /*ImageButton botaoadd = (ImageButton) findViewById(R.id.btnAddMeeting);
        botaoadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                DBController crud = new DBController(getBaseContext());
                String title = "TituloTeste";
                String data = "01-01-2019";
                String hora = "00:00:00";
                String ata = "Ata Teste";

                String resultado = crud.insertMeeting(title, data, hora, ata);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });*/
        //Edita dados
        ImageButton botaoedt = (ImageButton) findViewById(R.id.btnEditMeeting);
        botaoedt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
        //Exclui dados
        ImageButton botaorem = (ImageButton) findViewById(R.id.btnRemoveMeeting);
        botaorem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
    }
    public void onProfile(View view){
        startActivity(new Intent(MeetingActivity.this, ProfileActivity.class));
        finish();
    }
    public void onTask(View view){
        startActivity(new Intent(MeetingActivity.this, TaskActivity.class));
        finish();
    }
    /*private ArrayList<Meeting> addMeeting(){
        ArrayList<Meeting> meetings = new ArrayList<Meeting>();
        Meeting next = new Meeting("Aniversário","20/11/2019","18:30");
        meetings.add(next);
        next = new Meeting("Primeira reunião","21/11/2019","08:00");
        meetings.add(next);
        next = new Meeting("Segunda reunião","21/11/2019","09:00");
        meetings.add(next);
        next = new Meeting("Terceira reunião","21/11/2019","10:00");
        meetings.add(next);
        next = new Meeting("Quarta reunião","21/11/2019","11:00");
        meetings.add(next);
        next = new Meeting("Quinta reunião","21/11/2019","12:00");
        meetings.add(next);
        next = new Meeting("Sexta reunião","21/11/2019","13:00");
        meetings.add(next);
        return meetings;
    }*/
}
