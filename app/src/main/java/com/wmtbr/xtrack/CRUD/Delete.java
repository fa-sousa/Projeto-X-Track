package com.wmtbr.xtrack.CRUD;

import android.database.sqlite.SQLiteDatabase;

import com.wmtbr.xtrack.activities.Cadastrado;



public class Delete {

    public boolean removerCadastrado (Cadastrado cadastrado){
        SQLiteDatabase db = MainDB.getInstancia().getWritableDatabase();
        String query = "CODIGO = '" + cadastrado.getCodigo() + "'";
        return db.delete(MainDB.TABELA, query, null) >0;

    }
}

