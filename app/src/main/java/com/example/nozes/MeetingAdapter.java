package com.example.nozes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MeetingAdapter extends ArrayAdapter<Meeting> {
    private final Context context;
    private final ArrayList<Meeting> elements;

    public MeetingAdapter(Context context, ArrayList<Meeting> elements){
        super(context, R.layout.meeting, elements);
        this.context = context;
        this.elements = elements;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.meeting, parent, false);
        TextView titulo = (TextView) rowView.findViewById(R.id.txtTitle);
        TextView data = (TextView) rowView.findViewById(R.id.txtDate);
        TextView hora = (TextView) rowView.findViewById(R.id.txtHour);

        titulo.setText(elements.get(position).getTitle());
        data.setText(elements.get(position).getDate());
        hora.setText(elements.get(position).getHour());

        return rowView;
    }
}
