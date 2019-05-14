package com.example.nozes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateDB extends SQLiteOpenHelper {

    static final String NAME_DB = "nozes.db";
    static final String TAB_PROFILE = "profile";
    static final String ID_USER = "_id";
    static final String NAME = "name";
    static final String LAST_NAME = "lastName";
    static final String JOB_ROLE = "jobRole";
    static final String TEAM = "team";
    static final String EMAIL = "email";
    static final String GENDER = "gender";
    static final String AGE = "age";

    static final String TAB_TASK = "task";
    static final String ID_TASK = "_id";
    static final String TITLE_TASK = "titleTask";
    static final String CUSTO = "custo";
    static final String PRAZO = "prazotask";
    static final String DESCRICAO = "descricaotask";

    static final String TAB_MEETING = "meeting";
    static final String ID_MEETING = "_id";
    static final String TITLE_MEETING = "titleMeeting";
    static final String DATA = "dataMeeting";
    static final String HORA = "horaMeeting";
    static final String ATA = "ata";

    static final int VERSION = 1;

    public CreateDB(Context context){
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String sql = "CREATE TABLE IF NOT EXISTS "+TAB_PROFILE+"("
                + ID_USER + " integer primary key autoincrement,"
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
}
