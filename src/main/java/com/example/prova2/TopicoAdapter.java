package com.example.prova2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.prova2.Topicos.Topico;
import java.util.ArrayList;

public class TopicoAdapter extends ArrayAdapter<Topico> {
    private Context mContext;
    private int mResource;

    public TopicoAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Topico> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView insignia = convertView.findViewById(R.id.imagem);
        TextView nome = convertView.findViewById(R.id.nome);
        TextView alcunha = convertView.findViewById(R.id.alcunha);

        insignia.setImageResource(getItem(position).getInsignia());
        nome.setText(getItem(position).getNome());
        alcunha.setText(getItem(position).getAlcunha());

        return convertView;
    }
}
