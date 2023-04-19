package com.movilespascual.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    private List<ListaElementos> Datos;
    private LayoutInflater Inflater;
    private Context Contexto;


    public ListAdapter(List<ListaElementos> itemList, Context context) {
        this.Datos = itemList;
        this.Inflater = LayoutInflater.from(context);
        this.Contexto = context;
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = Inflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(Datos.get(position));
    }

    @Override
    public int getItemCount() {
        return Datos.size();
    }

    //public void setItems(List<ListaElementos> items){ Datos= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icono;
        TextView Nom, Phone, Correo, Edad, Ciud, Ini;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icono = itemView.findViewById(R.id.iconoImageView);
            Nom = itemView.findViewById(R.id.nameTextView);
            Phone = itemView.findViewById(R.id.telTextView);
            Correo = itemView.findViewById(R.id.emailTextView);
            Edad = itemView.findViewById(R.id.yearoldTextView);
            Ciud = itemView.findViewById(R.id.cityTextView);
            Ini = itemView.findViewById(R.id.Ini);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        ListaElementos clickedItem = Datos.get(position);

                        Intent intent = new Intent(Contexto,ViewData.class);
                        intent.putExtra("name", clickedItem.getName());
                        intent.putExtra("tel", clickedItem.getTel());;
                        intent.putExtra("email", clickedItem.getEmail());;
                        intent.putExtra("City", clickedItem.getCity());;

                        Contexto.startActivity(intent);
                    }
                }
            });
        }

        void bindData(final ListaElementos item){
            icono.setColorFilter(Color.parseColor("#7B1FA2"), PorterDuff.Mode.SRC_IN);
            Nom.setText(item.getName());
            Phone.setText(item.getTel());
            Correo.setText(item.getEmail());
            Edad.setText(item.getYearOld());
            Ciud.setText(item.getCity());
            Ini.setText(item.getIni());
        }
    }

}
