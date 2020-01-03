package com.example.ordemservico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CadastraOrdemServico extends AppCompatActivity {
EditText edt_numOS, edt_descricaoOS, edt_setorOS, edt_solicitanteOS, edt_observacoesOS;

FirebaseDatabase firebaseDatabase;
DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_ordem_servico);
        edt_numOS = (EditText)findViewById(R.id.ed_numOrdemServico);
        edt_descricaoOS = (EditText)findViewById(R.id.ed_descricaoOrdemServico);
        edt_setorOS = (EditText)findViewById(R.id.ed_setorOrdemServico);
        edt_solicitanteOS = (EditText)findViewById(R.id.ed_solicitanteOrdemServico);
        edt_observacoesOS = (EditText)findViewById(R.id.ed_observacoesOrdemServico);
    }
}
