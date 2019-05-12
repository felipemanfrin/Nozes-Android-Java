package com.example.nozes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Date;

public class DBController {
    private SQLiteDatabase db;
    private CreateDB database;

    public DBController(Context context){
        database = new CreateDB(context);
    }
    //**********************INSERT*************************************
    public String insertProfile(String name, String lasName, String jobRole,String team, String email,
                             String gender, Integer age ){
        ContentValues values;//var para valores de insert
        long result; //result

        db = database.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.LAST_NAME, lasName);
        values.put(CreateDB.JOB_ROLE, jobRole);
        values.put(CreateDB.TEAM, team);
        values.put(CreateDB.EMAIL, email);
        values.put(CreateDB.GENDER, gender);
        values.put(CreateDB.AGE, age);

        result = db.insert(CreateDB.TAB_PROFILE, null, values); //retorno do insert
        db.close();//fecha db

        if (result ==-1)
            return "Erro ao inserir Profile";
        else
            return "Profile Inserido com sucesso";
    }
    public String insertTask(String title, Double custo, Integer prazo, String descricao ){
        ContentValues values;//var para valores de insert
        long result; //result

        db = database.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.TITLE_TASK, title);
        values.put(CreateDB.CUSTO, custo);
        values.put(CreateDB.PRAZO, prazo);
        values.put(CreateDB.DESCRICAO, descricao);

        result = db.insert(CreateDB.TAB_TASK, null, values); //retorno do insert
        db.close();//fecha db

        if (result ==-1)
            return "Erro ao inserir Task";
        else
            return "Task Inserido com sucesso";
    }
    public String insertMeeting(String title, String data, String hora, String ata){
        ContentValues values;//var para valores de insert
        long result; //result

        db = database.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.TITLE_MEETING, title);
        values.put(CreateDB.DATA, data);
        values.put(CreateDB.HORA, hora);
        values.put(CreateDB.ATA, ata);

        result = db.insert(CreateDB.TAB_TASK, null, values); //retorno do insert
        db.close();//fecha db

        if (result ==-1)
            return "Erro ao inserir Meeting";
        else
            return "Meeting Inserido com sucesso";
    }
    //**********************ALTER*************************************
    public void alterProfile(int id, String name, String lasName, String jobRole, String team,
                              String email, String gender, int age){
        ContentValues values;
        String where;

        db = database.getWritableDatabase();

        where = CreateDB.ID_USER + "=" + id;

        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.LAST_NAME, lasName);
        values.put(CreateDB.JOB_ROLE, jobRole);
        values.put(CreateDB.TEAM, team);
        values.put(CreateDB.EMAIL, email);
        values.put(CreateDB.GENDER, gender);
        values.put(CreateDB.AGE, age);

        db.update(database.TAB_PROFILE,values,where,null);
        db.close();
    }

    public void alterTask(int id, String title, double custo, Integer prazo, String descricao){
        ContentValues values;
        String where;

        db = database.getWritableDatabase();

        where = CreateDB.ID_TASK + "=" + id;

        values = new ContentValues();
        values.put(CreateDB.TITLE_TASK, title);
        values.put(CreateDB.CUSTO, custo);
        values.put(CreateDB.PRAZO, prazo);
        values.put(CreateDB.DESCRICAO, descricao);

        db.update(database.TAB_TASK,values,where,null);
        db.close();
    }

    public void alterMeeting(int id, String title, String data, String hora, String ata){
        ContentValues values;
        String where;

        db = database.getWritableDatabase();

        where = CreateDB.ID_MEETING + "=" + id;

        values = new ContentValues();
        values.put(CreateDB.TITLE_MEETING, title);
        values.put(CreateDB.DATA, data);
        values.put(CreateDB.HORA, hora);
        values.put(CreateDB.ATA, ata);

        db.update(database.TAB_TASK,values,where,null);
        db.close();
    }
    //**********************DELETE*************************************
    public void deleteProfile(int id){
        String where = database.ID_USER + "=" + id;
        db = database.getReadableDatabase();
        db.delete(CreateDB.TAB_PROFILE,where,null);
        db.close();
    }

    public void deleteTask(int id){
        String where = database.ID_TASK + "=" + id;
        db = database.getReadableDatabase();
        db.delete(CreateDB.TAB_TASK,where,null);
        db.close();
    }

    public void deleteMeeting(int id){
        String where = database.ID_TASK + "=" + id;
        db = database.getReadableDatabase();
        db.delete(CreateDB.TAB_MEETING,where,null);
        db.close();
    }
    //*************************LOAD************************************
    public Cursor loadProfile(){
        Cursor cursor;
        String[] values =  {database.ID_USER, database.NAME, database.LAST_NAME, database.JOB_ROLE,
                database.TEAM, database.EMAIL, database.GENDER, database.AGE};
        db = database.getReadableDatabase();
        cursor = db.query(database.TAB_PROFILE, values, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
    public Cursor loadProfileById(int id){
        Cursor cursor;
        String[]values =  {database.ID_USER, database.NAME, database.LAST_NAME, database.JOB_ROLE,
                database.TEAM, database.EMAIL, database.GENDER, database.AGE};
        String where = CreateDB.ID_USER + "=" + id;
        db = database.getReadableDatabase();
        cursor = db.query(CreateDB.TAB_PROFILE,values,where, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

}
