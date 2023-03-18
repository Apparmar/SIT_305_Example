package com.example.sit305_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myText;
    TextView mtView;

    Button btPlus;
    Button btMin;
    Button btMulti;
    Button btDiv;
    EditText firstDec;
    EditText secondDec;
    TextView calcOut;

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
                mtView.setText("Hello " + myString + ".\nWelcome to SIT 305.");
                Toast.makeText(MainActivity.this,"Hello world",Toast.LENGTH_LONG).show();
            }
        });


        btPlus = findViewById(R.id.buttonPlus);
        btMin = findViewById(R.id.buttonMinus);
        btMulti = findViewById(R.id.buttonMulti);
        btDiv = findViewById(R.id.buttonDiv);
        firstDec = findViewById(R.id.editFirstDec);
        secondDec = findViewById(R.id.editSecondDec);
        calcOut = findViewById(R.id.calcOut);


        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valueOne = Double.parseDouble(firstDec.getText().toString());
                Double valueTwo = Double.parseDouble(secondDec.getText().toString());
                Double output = valueOne + valueTwo;
                calcOut.setText(output.toString());
            }
        });

        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valueOne = Double.parseDouble(firstDec.getText().toString());
                Double valueTwo = Double.parseDouble(secondDec.getText().toString());
                Double output = valueOne - valueTwo;
                calcOut.setText(output.toString());

            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valueOne = Double.parseDouble(firstDec.getText().toString());
                Double valueTwo = Double.parseDouble(secondDec.getText().toString());
                Double output = valueOne * valueTwo;
                calcOut.setText(output.toString());

            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valueOne = Double.parseDouble(firstDec.getText().toString());
                Double valueTwo = Double.parseDouble(secondDec.getText().toString());
                Double output = valueOne / valueTwo;
                calcOut.setText(output.toString());

            }
        });

    }
}