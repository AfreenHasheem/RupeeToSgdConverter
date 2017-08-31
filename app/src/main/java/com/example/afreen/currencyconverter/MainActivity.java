package com.example.afreen.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    public void Convert(View view)
    {
        EditText rupeeEditText= (EditText) findViewById(R.id.rupeeEditText);
        Double rupeeAmount=Double.parseDouble(rupeeEditText.getText().toString());
        Double sgdAmount=rupeeAmount*0.021;
        Toast.makeText(MainActivity.this, "S$" + String.format("%.2f",sgdAmount),Toast.LENGTH_LONG).show();

        Log.i("amount",rupeeEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
