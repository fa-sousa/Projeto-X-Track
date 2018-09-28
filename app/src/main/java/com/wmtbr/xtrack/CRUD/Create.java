package com.wmtbr.xtrack.CRUD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Create {
    public Create(Context applicationContext) {
    }

    public void createTable() {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String colunas = "( CODIGO TEXT, PACOTE TEXT)";
        String query = "CREATE TABLE IF NOT EXISTS " + MainDB.TABELA + colunas;

        db.execSQL(query);
    }

}

