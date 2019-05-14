package com.example.nozes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateDB extends SQLiteOpenHelper {

    static final String NAME_DB = "nozes.db";

    static final String TAB_PROFILE = "profile";
    static final String ID_PROFILE = "_id";
    static final String NAME = "name";
    static final String LAST_NAME = "lastName";
    static final String JOB_ROLE = "jobRole";
    static final String TEAM = "team";
    static final String EMAIL = "email";
    static final String GENDER = "gender";
    static final String AGE = "age";
    static final String[] COLUMNS_PROFILE = {ID_PROFILE, NAME, LAST_NAME, JOB_ROLE, TEAM, EMAIL, GENDER, AGE};

    static final String TAB_TASK = "task";
    static final String ID_TASK = "_id";
    static final String TITLE_TASK = "titleTask";
    static final String CUSTO = "custo";
    static final String PRAZO = "prazotask";
    static final String DESCRICAO = "descricaotask";
    static final String[] COLUMNS_TASK = {ID_TASK, TITLE_TASK, CUSTO, PRAZO, DESCRICAO};

    static final String TAB_MEETING = "meeting";
    static final String ID_MEETING = "_id";
    static final String TITLE_MEETING = "titleMeeting";
    static final String DATA = "dataMeeting";
    static final String HORA = "horaMeeting";
    static final String ATA = "ata";
    static final String[] COLUMNS_MEETING = {ID_MEETING, TITLE_TASK, DATA, HORA, ATA};

    static final int VERSION = 1;

    public CreateDB(Context context){
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String sql = "CREATE TABLE IF NOT EXISTS "+TAB_PROFILE+"("
                + ID_PROFILE + " integer primary key autoincrement,"
                + NAME + " text,"
                + LAST_NAME + " text,"
                + JOB_ROLE + " text,"
                + TEAM + " text,"
                + EMAIL + " text,"
                + GENDER + " text,"
                + AGE + " integer"
                +")";
        db.execSQL(sql);
        sql = "CREATE TABLE IF NOT EXISTS "+TAB_TASK+"("
                + ID_TASK + " integer primary key autoincrement,"
                + TITLE_TASK + " text,"
                + CUSTO + " double,"
                + PRAZO + " int,"
                + DESCRICAO + " text"
                +")";
        db.execSQL(sql);
        sql = "CREATE TABLE IF NOT EXISTS "+TAB_MEETING+"("
                + ID_MEETING + " integer primary key autoincrement,"
                + TITLE_MEETING + " text,"
                + DATA + " text,"
                + HORA + " text,"
                + ATA + " text"
                +")";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+TAB_PROFILE);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_TASK);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TAB_MEETING);
        onCreate(db);
    }
    public void insertTask (Task task){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(TITLE_TASK, task.getTitulo());
        values.put(PRAZO, task.getCusto());
        values.put(CUSTO, task.getCusto());
        values.put(DESCRICAO, task.getDescricao());

        db.insert(TAB_TASK, null, values);
        db.close();
    }
    public Task getTask (int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TAB_TASK,
                COLUMNS_TASK,
                " id = ?",
                new String[] {String.valueOf(id)},
                null,
                null,
                null,
                null);
        if(cursor == null)
            return null;
        else{
            cursor.moveToFirst();
            Task task = cursorToTask(cursor);
            return task;
        }
    }
    private Task cursorToTask(Cursor cursor){
        Task task = new Task();
        task.setId(Integer.parseInt(cursor.getString(0)));
        task.setTitulo(cursor.getString(1));
        task.setCusto(cursor.getDouble(2));
        task.setPrazo(cursor.getString(3));
        task.setDescricao(cursor.getString(4));
        return task;
    }
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> listaTasks = new ArrayList<Task>();
        String query = "SELECT * FROM "+ TAB_TASK;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()){
            do{
                Task task = cursorToTask(cursor);
                listaTasks.add(task);
            }while (cursor.moveToNext());
        }
        return listaTasks;
    }
    public int updateTask(Task task) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TITLE_TASK, task.getTitulo());
        values.put(CUSTO, task.getPrazo());
        values.put(PRAZO, task.getPrazo());
        values.put(DESCRICAO, task.getDescricao());

        int i = db.update(TAB_TASK,
                values,
                ID_TASK+" = ?",
                new String[] {String.valueOf(task.getId())});
        db.close();
        return i;
    }
    public int deleteTask(Task task){
        SQLiteDatabase db = this.getWritableDatabase();

        int i = db.delete(TAB_TASK,
                ID_TASK+" = ?",
                new String[] {String.valueOf(task.getId())});
        db.close();
        return i;
    }
}
