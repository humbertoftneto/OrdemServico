package com.example.ordemservico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ordemservico.Model.OrdemServicoBEAN;

import java.util.ArrayList;

public class OrdemServicoAdapter extends ArrayAdapter<OrdemServicoBEAN> {
    private final Context context;
    private final ArrayList<OrdemServicoBEAN> elementos;

    public OrdemServicoAdapter(Context context, ArrayList<OrdemServicoBEAN> elementos){
        super(context, R.layout.item, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item, parent, false);

        TextView descricao = (TextView) rowView.findViewById(R.id.t_descricaoServico);
        TextView setor = (TextView) rowView.findViewById(R.id.t_setorServico);

        descricao.setText(elementos.get(position).getDescricaoServico());
        setor.setText(elementos.get(position).getSetorServico());

        return rowView;
    }
}
