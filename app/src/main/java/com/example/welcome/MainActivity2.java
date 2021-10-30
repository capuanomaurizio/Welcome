package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView lblName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lblName = (TextView)findViewById(R.id.lblName);
        Intent i = getIntent();
        String receivedMessage = i.getStringExtra("name");
        lblName.setText(receivedMessage);

        Toast toast = Toast.makeText(getApplicationContext(), "Operation succeded", Toast.LENGTH_LONG);
        toast.show();
    }
}