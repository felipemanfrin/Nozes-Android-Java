package com.example.nozes;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        ListView listTask = (ListView) findViewById(R.id.lstTasks);
        ArrayAdapter arrayAdapter = new TaskAdapter(this, addTask());
        listTask.setAdapter(arrayAdapter);

        //Inserir dados
        ImageButton botaoadd = (ImageButton) findViewById(R.id.btnAddTask);
        botaoadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                DBController crud = new DBController(getBaseContext());
                String titletask = "NewTask";
                double custo = 10.00;
                int prazo = 2;
                String descricao = "Descrição Teste";

                String resultado = crud.insertTask(titletask, custo, prazo, descricao);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
        //Edita dados
        ImageButton botaoedt = (ImageButton) findViewById(R.id.btnEditTask);
        botaoedt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
        //Exclui dados
        ImageButton botaorem = (ImageButton) findViewById(R.id.btnRemoveTask);
        botaorem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
    }

    public void onProfile(View view){
        startActivity(new Intent(TaskActivity.this, ProfileActivity.class));
        finish();
    }
    public void onMeeting(View view){
        startActivity(new Intent(TaskActivity.this, MeetingActivity.class));
        finish();
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
