package com.wmtbr.xtrack.models;

import android.provider.ContactsContract;

import com.google.firebase.database.DatabaseReference;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Date;

public class PojoDemo {

    private String cidade;
    private Date data;
    private String hora;
    private String status;
    private String uf;

    public PojoDemo(String cidade, Date data, String hora, String status, String uf) {
        this.cidade = cidade;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


}
