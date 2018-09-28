package com.wmtbr.xtrack.CRUD;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.wmtbr.xtrack.activities.MyApp;

public class MainDB extends SQLiteOpenHelper{
    private static final String NOME_DB = "DB";
    private static int VERSAO_DB= 3;
    public static final String TABELA = "TABELA";


    private static MainDB instancia;


    public static MainDB getInstancia(){
        if (instancia ==null) instancia = new MainDB();
        return instancia;
    }


    private MainDB() {
        super(MyApp.getContext(), NOME_DB, null, VERSAO_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
