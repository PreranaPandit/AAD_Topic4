package com.example.aad_topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public  static final String countries[] = {
      "Nepal", "India", "China", "UK", "Canada", "US"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lsCountries = findViewById(R.id.lvCountries);

       ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);

        lsCountries.setAdapter(adapter);
    }
}
