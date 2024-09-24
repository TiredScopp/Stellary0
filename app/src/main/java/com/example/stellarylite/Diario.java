package com.example.stellarylite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Diario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

        Spinner spinner1 = findViewById(R.id.spinner1id);
        Spinner spinner2 = findViewById(R.id.spinner2id);
        Spinner spinner3 = findViewById(R.id.spinner3id);

        // Datos para la lista desplegable
        String[] dias = {"00", "01", "02", "03"};
        String[] Meses = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] Años = {"00", "2024", "2025", "2026"};

        // Adaptador para el Spinner
        ArrayAdapter<String> adapterD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dias);
        adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterM = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Meses);
        adapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Años);
        adapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asignar el adaptador al Spinner
        spinner1.setAdapter(adapterD);
        spinner2.setAdapter(adapterM);
        spinner3.setAdapter(adapterA);

    }

    public void Regresar (View view){
        Intent regresar = new Intent(this, Menu.class);
        startActivity(regresar);
        finish();
    }
}