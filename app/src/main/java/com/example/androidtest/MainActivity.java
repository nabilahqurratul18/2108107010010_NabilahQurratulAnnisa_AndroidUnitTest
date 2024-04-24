package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button buttonGreet;
    TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        buttonGreet = findViewById(R.id.buttonGreet);
        textViewGreeting = findViewById(R.id.textViewGreeting);

        buttonGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nama dari EditText
                String name = editTextName.getText().toString();

                // Tampilkan pesan sapaan dengan nama yang dimasukkan
                String greetingMessage = generateGreetMessage(name);
                textViewGreeting.setText(greetingMessage);
            }
        });
    }

    // Metode untuk menghasilkan pesan sapaan
    public static String generateGreetMessage(String name) {
        if (name.isEmpty()) {
            return "Halo, !";
        } else {
            return "Halo, " + name + "!";
        }
    }
}
