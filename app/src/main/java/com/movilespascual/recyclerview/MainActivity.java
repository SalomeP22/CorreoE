package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void  init(){
        elements = new ArrayList<>();
        elements.add(new ListaElementos("Salome","3217026113","salo@gmail.com","20","Medellín"));
        elements.add(new ListaElementos("Daniela","3025754387","dani@gmail.com","28","Medellín"));
        elements.add(new ListaElementos("Juan","320891791","Juan@gmail.com","12","Bogotá"));
        elements.add(new ListaElementos("Leidy","3137660288","leidy@gmail.com","36","Manizales"));
        elements.add(new ListaElementos("Pablo","3173555555","Pablo@gmail.com","24","Bogotá"));
        elements.add(new ListaElementos("Alejandro","3025755678","Alejo@gmail.com","42","Manizales"));


        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}