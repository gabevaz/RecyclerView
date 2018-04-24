package br.com.fiap.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvContatos;
    List<Contato>contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContatos = findViewById(R.id.rvContatos);
        rvContatos.setHasFixedSize(true);

        contatos = GeraContatos.geraContatos();

        ContatoAdapter adapter = new ContatoAdapter(this, contatos);

        rvContatos.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //outro tipo de layout, contatos ficma lado a lado, no caso, em duas colunas
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        rvContatos.setLayoutManager(layoutManager);
    }
}
