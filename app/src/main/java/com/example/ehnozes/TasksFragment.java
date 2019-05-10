package com.example.ehnozes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TasksFragment extends Fragment {
    private ListView listTask;
    private ArrayAdapter<Task> arrayAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tasks, container, false);

        /*listTask = (ListView) findViewById(R.id.lstTasks);
        ArrayAdapter arrayAdapter = new TasksAdapter(this, addTask());
        listTask.setAdapter(arrayAdapter);
        */

        return view;
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
