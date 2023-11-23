package com.example.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap<String, String> dict = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dict.put("Привет", "Suilad");
        dict.put("Пока", "Mara Mesta");

        // Мои хотелки
        // 1. Хочу загрузить activity_main.xml
        setContentView(R.layout.activity_main);

        // 2. Хочу управлять кнопкой
        Button myButton = findViewById(R.id.button);

        // 3. Завладеть вьюшкой для отображения результата
        TextView result = findViewById(R.id.textresult);

        // 4. Завладеть вьюшкой для отображения результата
        EditText input = findViewById(R.id.editText);

        // 5. Хочу слушателя на кнопку добавить


    }}





