package com.example.nozes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        ListView listMeeting = (ListView) findViewById(R.id.lstMeetings);//cria a lista para reuniões a partir do xml
        ListView listTask = (ListView) findViewById(R.id.lstTasks);//cria a lista para as tarefas a partir do xml

        ArrayList<String> task;//cria um arraylist para tarefas chamando suas função
        task = runTask();
        //cria os arrayadapters
        ArrayAdapter arrayAdapterM = new MeetingAdapter(this, addMeeting());
        //ArrayAdapter<String> arrayAdapterM = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meeting);
        ArrayAdapter<String> arrayAdapterT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, task);

        //seta os arrayadapters
        listMeeting.setAdapter(arrayAdapterM);
        listTask.setAdapter(arrayAdapterT);

    }

    //função para lista de tarefas
    private ArrayList<String> runTask(){
        ArrayList<String> dados = new ArrayList<String>();//cria o array
        dados.add("Task1");
        dados.add("Task2");
        dados.add("Task");
        dados.add("Task4");
        dados.add("Task5");
        dados.add("Task6");
        dados.add("Task7");
        dados.add("Task8");
        dados.add("Task9");
        return dados;//retorna todos os dados adicionados
    }
    //para popular as reuniões com os list customizado
    private ArrayList<Meeting> addMeeting(){
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
    }
}
