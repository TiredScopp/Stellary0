package com.example.stellarylite;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SharedPreferences preferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
        boolean isFirstRun= preferences.getBoolean("is_first_run", true);

        if (isFirstRun){
            Intent intent = new Intent(Registro.this, Bienvenida.class);
            startActivity(intent);

            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("is_first_run", false);
            editor.apply();
        }
            setContentView(R.layout.activity_registro);
    }
}