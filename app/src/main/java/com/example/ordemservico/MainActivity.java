package com.example.ordemservico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ordemservico.Model.OrdemServicoBEAN;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView lista = (ListView) findViewById(R.id.lst_ordemservico);
        //final ArrayList <OrdemServicoBEAN> ordemservico = preencheDados();
    }
}
