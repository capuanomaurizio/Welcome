package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtText;
    TextView lblText;
    Button btnPlay, btnTest, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnTest = (Button)findViewById(R.id.btnTest);
        btnReset = (Button)findViewById(R.id.btnReset);
        lblText = (TextView)findViewById(R.id.lblText);
        edtName = (EditText)findViewById(R.id.edtName);
        edtText = (EditText)findViewById(R.id.edtText);
    }

    public void reset(View v){
        lblText.setText("");
    }

    public void test(View v){
        lblText.setText(edtText.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Operation succeded", Toast.LENGTH_LONG);
        toast.show();
    }

    public void play(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("name", edtName.getText().toString());
        startActivity(i);
    }
}