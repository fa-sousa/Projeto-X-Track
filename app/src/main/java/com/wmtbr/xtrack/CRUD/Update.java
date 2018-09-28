package com.wmtbr.xtrack.CRUD;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.wmtbr.xtrack.activities.Cadastrado;



public class Update {

    public Update(Context applicationContext) {
    }

    public boolean addCadastrado (Cadastrado cadastrado) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("CODIGO", cadastrado.getCodigo());
        cv.put("PACOTE", cadastrado.getPacote());

        return db.insert(MainDB.TABELA, null, cv) != -1;
    }

    public boolean updateCadastrado (Cadastrado cadastrado) {

        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("CODIGO", cadastrado.getCodigo());
        cv.put("PACOTE", cadastrado.getPacote());

        String where = "CODIGO = '" + cadastrado.getCodigo() + "'";

        return db.update(MainDB.TABELA, cv, where, null) >0;
    }


}

