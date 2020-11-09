package com.example.msalha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void get_fat(View view){
        EditText getage = (EditText)findViewById(R.id.editTextNumber);
        EditText getwe = findViewById(R.id.editTextNumber2);
        EditText gethe = findViewById(R.id.editTextNumber3);
        int age = Integer.parseInt(getage.getText().toString());
        int weight = Integer.parseInt(getwe.getText().toString());
        int height = Integer.parseInt(gethe.getText().toString());
        double rsult = ((-76.76+4.15*height-0.082*weight)/weight)*10;
        Toast.makeText(this,String.valueOf(rsult)+"%",Toast.LENGTH_LONG).show();
    }
}