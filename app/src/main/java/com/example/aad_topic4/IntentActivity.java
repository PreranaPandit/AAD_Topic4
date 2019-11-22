package com.example.aad_topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    //Referencing the button for intent purpose
    private TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        //Receiving message from another activity
       Bundle bundle = getIntent().getExtras();

       if(bundle!=null)
       {
           String capital = bundle.getString("capital");
           tvCapital = findViewById(R.id.tvCapital);
           tvCapital.setText(capital);
       }
       else {
           //Use of toast that pops up the message as a message box on the window.
           Toast.makeText(this, "No capital",Toast.LENGTH_LONG).show();
       }

    }
}
