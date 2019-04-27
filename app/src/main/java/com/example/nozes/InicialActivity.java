package com.example.nozes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        ListView listMeeting = (ListView) findViewById(R.id.lstMeetings);
        ListView listTask = (ListView) findViewById(R.id.lstTasks);

        ArrayList<String> meeting = runMeeting();
        ArrayList<String> task = runTask();

        ArrayAdapter<String> arrayAdapterM = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meeting);
        ArrayAdapter<String> arrayAdapterT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, task);

        listMeeting.setAdapter(arrayAdapterM);
        listTask.setAdapter(arrayAdapterT);

    }
    private ArrayList<String> runMeeting(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Meeting1");
        dados.add("Meeting2");
        dados.add("Meeting3");
        dados.add("Meeting4");
        dados.add("Meeting5");
        dados.add("Meeting6");
        dados.add("Meeting7");
        dados.add("Meeting8");
        dados.add("Meeting9");
        return dados;
    }
    private ArrayList<String> runTask(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Task1");
        dados.add("Task2");
        dados.add("Task");
        dados.add("Task4");
        dados.add("Task5");
        dados.add("Task6");
        dados.add("Task7");
        dados.add("Task8");
        dados.add("Task9");
        return dados;
    }
}
