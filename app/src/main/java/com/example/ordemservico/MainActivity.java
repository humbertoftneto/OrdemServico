package com.example.ordemservico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.menu_novo:novaClick();

            return(true);
        case R.id.menu_executando:

            return(true);
        case R.id.menu_concluido:

            return(true);
            default:
                return super.onOptionsItemSelected(item);
    }
    }
    private void novaClick() {
       Intent intent_nova = new Intent(this,CadastraOrdemServico.class);
       intent_nova.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       startActivity(intent_nova);
   }
}
