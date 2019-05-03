package com.example.nozes;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;

public class InicialActivity extends AppCompatActivity {

    private ListView listMeeting, listTask;
    private ImageButton addProfile, addMeeting, addTask, editProfile, editMeeting, editTask, rmvProfile, rmvMeeting, rmvTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        listMeeting = (ListView) findViewById(R.id.lstMeetings);//cria a lista para reuniões a partir do xml
        listTask = (ListView) findViewById(R.id.lstTasks);//cria a lista para as tarefas a partir do xml

        //cria os arrayadapters
        ArrayAdapter arrayAdapterM = new MeetingAdapter(this, addMeeting());
        ArrayAdapter arrayAdapterT = new TaskAdapter(this, addTask());

        //seta os arrayadapters
        listMeeting.setAdapter(arrayAdapterM);
        listTask.setAdapter(arrayAdapterT);

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
    private ArrayList<Task> addTask(){
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task next = new Task("Fazer esboço","20/11/2019",true);
        tasks.add(next);
        next = new Task("Primeira tarefa","21/11/2019",false);
        tasks.add(next);
        next = new Task("Segunda tarefa","21/11/2019",false);
        tasks.add(next);
        next = new Task("Terceira tarefa","21/11/2019",false);
        tasks.add(next);
        next = new Task("Quarta tarefa","21/11/2019",false);
        tasks.add(next);
        next = new Task("Quinta tarefa","21/11/2019",false);
        tasks.add(next);
        next = new Task("Sexta tarefa","21/11/2019",false);
        tasks.add(next);
        return tasks;
    }
}
