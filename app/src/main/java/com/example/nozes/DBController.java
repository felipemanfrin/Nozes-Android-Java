package com.example.nozes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBController {
    private SQLiteDatabase db;
    private CreateDB database;

    public DBController(Context context){
        database = new CreateDB(context);
    }

    public String insertData(String name, String lasName, String jobRole,String team, String email,
                             String gender, Integer age ){
        ContentValues values;
        long result;

        db = database.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.LAST_NAME, lasName);
        values.put(CreateDB.JOB_ROLE, jobRole);
        values.put(CreateDB.TEAM, team);
        values.put(CreateDB.EMAIL, email);
        values.put(CreateDB.GENDER, gender);
        values.put(CreateDB.AGE, age);

        result = db.insert(CreateDB.TAB_PROFILE, null, values);
        db.close();

        if (result ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";
    }
    public Cursor loadData(){
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
    public Cursor loadDataById(int id){
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
    public void alterRegistro(int id, String name, String lasName, String jobRole, String team,
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
    public void deleteRegistro(int id){
        String where = database.ID_USER + "=" + id;
        db = database.getReadableDatabase();
        db.delete(CreateDB.TAB_PROFILE,where,null);
        db.close();
    }
}
