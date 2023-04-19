package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_data);

        Intent intent = getIntent();
        String Nom = intent.getStringExtra("name");
        String Telef = intent.getStringExtra("tel");;
        String CorreoE = intent.getStringExtra("email");;
        String City = intent.getStringExtra("city");;

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView telTextView = findViewById(R.id.telTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView cityTextView = findViewById(R.id.cityTextView);

        nameTextView.setText(Nom);
        telTextView.setText(Telef);
        emailTextView.setText(CorreoE);
        cityTextView.setText(City);
    }
}