package com.example.sit305_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myText;
    TextView mtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        myText = findViewById(R.id.editTextTextPersonName);
        mtView = findViewById(R.id.textView);
        
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myString = myText.getText().toString();
                mtView.setText("Hello " + myString + ". Welcome to SIT 305.");
                Toast.makeText(MainActivity.this,"Hello world",Toast.LENGTH_LONG).show();
            }
        });
    }
}