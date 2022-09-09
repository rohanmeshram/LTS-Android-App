package com.example.androidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class Registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private Spinner spinner2;


    public Registration() {
    }

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        spinner = findViewById(R.id.spinner);

        String[] categories = getResources().getStringArray(R.array.categories);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

      //  spinner2 = findViewById(R.id.spinner2);

      //  String[] city = new String[] {"Nagpur", "Pune", "Raipur"};
     //  Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

     //   ArrayAdapter <String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city);
     //  adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     //   spinner.setAdapter(adapter1);

        spinner2 = findViewById(R.id.spinner2);
        String[] city = getResources().getStringArray(R.array.city);
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, city);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}