package example.aula_01.com.projetoxtrackteste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class activity_cadastro extends AppCompatActivity {

    Button botaoCancelar = (Button) findViewById(R.id.botaoCancelar);
    Button botaoConfirmar = (Button) findViewById(R.id.botaoConfirmar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        botaoCancelar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(activity_cadastro.this, principal.class);
                startActivity(it);
            }
        });

        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(activity_cadastro.this, principal.class);
                startActivity(it);
            }
        });

    }
}
