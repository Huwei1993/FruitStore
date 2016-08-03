package com.shayne.fruitstore.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * huwei1993 on 2016/8/3 22:36
 */
public class UserOpenHelper extends SQLiteOpenHelper {
    private  static  final String  DB_NAME = "user";

    public UserOpenHelper(Context context) {
        super(context, "fhome.db", null, 1);   // 数据库的名称
    }

    //  第一次进入时进入
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+DB_NAME+"(id integer primary key autoincrement,account integer(20),password varchar(2),name varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
