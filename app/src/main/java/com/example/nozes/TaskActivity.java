package com.example.nozes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        ListView listTask = (ListView) findViewById(R.id.lstTasks);
        ArrayAdapter arrayAdapter = new TaskAdapter(this, addTask());
        listTask.setAdapter(arrayAdapter);
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
