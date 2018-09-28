package com.wmtbr.xtrack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wmtbr.xtrack.R;
import com.wmtbr.xtrack.activities.Cadastro;

public class Principal extends AppCompatActivity {

    public void cadastrar (View view){
        Intent intent2 = new Intent(getApplicationContext(),Cadastro.class);
        startActivity(intent2);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
