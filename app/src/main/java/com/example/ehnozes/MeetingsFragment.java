package com.example.ehnozes;

import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MeetingsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_meetings, container, false);
    }
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
