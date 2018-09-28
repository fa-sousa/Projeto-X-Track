package com.wmtbr.xtrack.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wmtbr.xtrack.CRUD.Create;
import com.wmtbr.xtrack.CRUD.Update;
import com.wmtbr.xtrack.R;

public class Cadastro extends AppCompatActivity implements View.OnClickListener{

    Button btCancel, btConfirm, btReg;
    EditText rastreio, descricao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btCancel = (Button) findViewById(R.id.btCancel);
        btConfirm = (Button) findViewById(R.id.btConfirm);


        rastreio = (EditText) findViewById(R.id.rastreio);
        descricao = (EditText) findViewById(R.id.descricao);


        btConfirm.setOnClickListener(this);
        btCancel.setOnClickListener(this);


        Create c = new Create(getApplicationContext());
        c.createTable();



    }

    @Override
    public void onClick(View view) {

        if (view.getId() ==R.id.btConfirm) {
            Cadastrado cd = new Cadastrado();
            cd.setCodigo(rastreio.getText().toString());
            cd.setPacote(descricao.getText().toString());

            Update u = new Update(getApplicationContext());
            if (u.updateCadastrado(cd)){
                Toast.makeText(this,"CADASTRO REALIZADO COM SUCESSO", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "ERRO", Toast.LENGTH_LONG).show();
            }
        }else if (view.getId() ==R.id.btCancel){
            Intent intent = new Intent(getApplicationContext(), Principal.class);
            startActivity(intent);
        }

    }
}
