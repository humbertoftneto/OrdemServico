package com.example.ordemservico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ordemservico.Model.OrdemServicoBEAN;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CadastraOrdemServico extends AppCompatActivity {
EditText edt_numOS, edt_descricaoOS, edt_setorOS, edt_solicitanteOS, edt_observacoesOS;
Button btn_Confirma;
OrdemServicoBEAN ordemservico;

//DatabaseReference databaseReference;
//FirebaseDatabase firebaseDatabase;
FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference().child("OrdemServico");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_ordem_servico);
        edt_numOS = (EditText)findViewById(R.id.ed_numOrdemServico);
        edt_descricaoOS = (EditText)findViewById(R.id.ed_descricaoOrdemServico);
        edt_setorOS = (EditText)findViewById(R.id.ed_setorOrdemServico);
        edt_solicitanteOS = (EditText)findViewById(R.id.ed_solicitanteOrdemServico);
        edt_observacoesOS = (EditText)findViewById(R.id.ed_observacoesOrdemServico);


        //databaseReference = FirebaseDatabase.getInstance().getReference().child("OrdemServico");

      btn_Confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numeroServico = Integer.parseInt(edt_numOS.toString());
                ordemservico.setNumeroServico(numeroServico);
                ordemservico.setDescricaoServico(edt_descricaoOS.getText().toString());
                ordemservico.setSetorServico(edt_setorOS.getText().toString());
                ordemservico.setSolicitanteServico(edt_solicitanteOS.getText().toString());
                ordemservico.setObservacaoDetalhada(edt_observacoesOS.getText().toString());

                //databaseReference.push().setValue(ordemservico);
                //Toast.makeText(CadastraOrdemServico.this,"Dados inseridos com sucesso!", Toast.LENGTH_LONG).show();
                myRef.setValue(ordemservico);
            }
        });


        //myRef.setValue("Hello, World!");

    }
}
