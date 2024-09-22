package com.example.lab_1_main;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonChangeText;
    private Button buttonChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is correct

        textView = findViewById(R.id.textView);
        buttonChangeText = findViewById(R.id.button_change_text);
        buttonChangeColor = findViewById(R.id.button_change_color);

        // Change Text Button
        buttonChangeText.setOnClickListener(v -> textView.setText("Text Changed!"));

        // Change Color Button
        buttonChangeColor.setOnClickListener(v -> textView.setTextColor(Color.RED));
    }
}
