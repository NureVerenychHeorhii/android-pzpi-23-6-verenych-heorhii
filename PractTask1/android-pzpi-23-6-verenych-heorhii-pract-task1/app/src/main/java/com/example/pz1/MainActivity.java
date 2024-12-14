package com.example.pz1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Найти элементы интерфейса по их ID
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        // Установить обработчик клика на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Изменить текст в TextView при нажатии на кнопку
                textView.setText("Текст змінено!");
            }
        });
    }
}
