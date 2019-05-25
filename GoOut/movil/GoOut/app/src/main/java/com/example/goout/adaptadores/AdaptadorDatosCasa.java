package com.example.goout.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goout.R;
import com.example.goout.clases.Casa;

import java.util.ArrayList;

public class AdaptadorDatosCasa extends RecyclerView.Adapter<AdaptadorDatosCasa.ViewHolderDatosCasa> {

    ArrayList<Casa> lstDatosCasas;

    public AdaptadorDatosCasa(ArrayList<Casa> lstDatosCasas) {
        this.lstDatosCasas = lstDatosCasas;
    }

    @NonNull
    @Override
    public AdaptadorDatosCasa.ViewHolderDatosCasa onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitemcuartos,null,false);
        return new ViewHolderDatosCasa(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorDatosCasa.ViewHolderDatosCasa viewHolderDatosCasa, int i) {
        viewHolderDatosCasa.agregarCasa(lstDatosCasas.get(i));
    }

    @Override
    public int getItemCount() {
        return lstDatosCasas.size();
    }

    public class ViewHolderDatosCasa extends RecyclerView.ViewHolder {

        TextView lblubicacion,lblprecio_tiempo;
        ImageView lblimagen_casa;
        public ViewHolderDatosCasa(@NonNull View itemView) {
            super(itemView);
                lblubicacion = itemView.findViewById(R.id.LblUbicacion);
                lblimagen_casa = itemView.findViewById(R.id.LblImagenCasa);
                lblprecio_tiempo = itemView.findViewById(R.id.LblPrecioTiempo);

        }

        public void agregarCasa(Casa casas) {
            lblubicacion.setText(casas.getUbicacion());
            lblimagen_casa.setImageResource(casas.getImagen());
            lblprecio_tiempo.setText(casas.getPrecio_tiempo());

        }
    }
}
