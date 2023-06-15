package com.example.prova2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.prova2.Topicos.Topico;
import com.example.prova2.Topicos.Topico1Activity;
import com.example.prova2.Topicos.Topico2Activity;
import com.example.prova2.Topicos.Topico3Activity;
import com.example.prova2.Topicos.Topico4Activity;
import com.example.prova2.Topicos.Topico5Activity;
import com.example.prova2.Topicos.Topico6Activity;
import com.example.prova2.Topicos.Topico7Activity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //construção da lista
        ListView listView =  findViewById(R.id.listview);
        ArrayList<Topico> list = new ArrayList<>(1);
        list.add(new Topico(R.drawable.inf, "Infantaria", "A Rainha das Armas" ));
        list.add(new Topico(R.drawable.cav, "Cavalaria", "A Arma de Heroís" ));
        list.add(new Topico(R.drawable.art, "Artilharia", "Mallet" ));
        list.add(new Topico(R.drawable.eng, "Engenharia", "O Castelo Lendário" ));
        list.add(new Topico(R.drawable.com, "Comunicações", "A Arma do Comando" ));
        list.add(new Topico(R.drawable.mat_bel, "Material Belico", "Apoio Incondicional" ));
        list.add(new Topico(R.drawable.inte, "Intedência", "A Rainha da Logistica" ));


       TopicoAdapter topicoAdapter = new TopicoAdapter(this,R.layout.linha, list);
       listView.setAdapter(topicoAdapter);

        //construção dos eventos
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position == 0){
                    startActivity(new Intent(MainActivity.this, Topico1Activity.class));

                }
                else if(position == 1){
                    startActivity(new Intent(MainActivity.this, Topico2Activity.class));

                }
                else if(position == 2){
                    startActivity(new Intent(MainActivity.this, Topico3Activity.class));

                }
                else if(position == 3){
                    startActivity(new Intent(MainActivity.this, Topico4Activity.class));

                }
                else if(position == 4){
                    startActivity(new Intent(MainActivity.this, Topico5Activity.class));

                }
                else if(position == 5){
                    startActivity(new Intent(MainActivity.this, Topico6Activity.class));

                }
                else if(position == 6){
                    startActivity(new Intent(MainActivity.this, Topico7Activity.class));

                }
            }
        });
    }
}