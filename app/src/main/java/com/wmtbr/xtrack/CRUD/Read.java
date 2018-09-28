package com.wmtbr.xtrack.CRUD;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.wmtbr.xtrack.activities.Cadastrado;
import java.util.ArrayList;


public class Read {
    public Read(Context applicationContext) {

    }

    public ArrayList<Cadastrado> getCadastrado(){
        SQLiteDatabase db = MainDB.getInstancia().getReadableDatabase();
        String query = "SELECT * FROM "+ MainDB.TABELA;
        ArrayList<Cadastrado> cadastrados = new ArrayList<>();
        Cursor c =db.rawQuery(query, null);

        if (c.moveToFirst()) {
            do{
                Cadastrado cadastrado = new Cadastrado(c.getString(0));
                cadastrado.setCodigo(c.getString(1));
                cadastrado.setPacote(c.getString(2));
                cadastrados.add(cadastrado);
            }while (c.moveToNext());
        }

        c.close();
        return cadastrados;

    }


}
