package com.example.ehnozes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class TasksAdapter extends ArrayAdapter<Task> {
    private final Context context;
    private final ArrayList<Task> elements;

    public TasksAdapter(Context context, ArrayList<Task> elements){
        super(context, R.layout.tasks, elements);
        this.context = context;
        this.elements = elements;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.tasks, parent, false);
        TextView titulo = (TextView) rowView.findViewById(R.id.txtTitle);
        TextView prazo = (TextView) rowView.findViewById(R.id.txtTerm);
        CheckBox chk = (CheckBox) rowView.findViewById(R.id.chkTask);

        titulo.setText(elements.get(position).getTitle());
        prazo.setText(elements.get(position).getTerm());
        chk.setChecked(elements.get(position).getChk());

        return rowView;
    }
}