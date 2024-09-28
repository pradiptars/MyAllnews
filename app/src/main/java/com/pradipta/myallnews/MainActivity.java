package com.pradipta.myallnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnbd, btnin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnbd = (Button) findViewById(R.id.btnbd);
        btnin = (Button) findViewById(R.id.btnin);

        btnbd.setOnClickListener(this);
        btnin.setOnClickListener(this);
     
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnbd){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        }if(v.getId()==R.id.btnin){
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);

        }

    }
}