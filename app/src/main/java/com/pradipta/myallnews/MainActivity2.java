package com.pradipta.myallnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23,btn24,btn25,btn26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        btn10 = (ImageButton) findViewById(R.id.btn_1);
        btn11= (ImageButton) findViewById(R.id.btn_2);
        btn12 = (ImageButton) findViewById(R.id.btn_3);
        btn13 = (ImageButton) findViewById(R.id.btn_4);
        btn14 = (ImageButton) findViewById(R.id.btn_5);
        btn15 = (ImageButton) findViewById(R.id.btn_6);
        btn16 = (ImageButton) findViewById(R.id.btn_7);
        btn17 = (ImageButton) findViewById(R.id.btn_8);
        btn18 = (ImageButton) findViewById(R.id.btn_9);
        btn19 = (ImageButton) findViewById(R.id.btn_10);
        btn20 = (ImageButton) findViewById(R.id.btn_11);
        btn21 = (ImageButton) findViewById(R.id.btn_12);
        btn22 = (ImageButton) findViewById(R.id.btn_13);
        btn23 = (ImageButton) findViewById(R.id.btn_14);
        btn24 = (ImageButton) findViewById(R.id.btn_15);
        btn25 = (ImageButton) findViewById(R.id.btn_16);
        btn26 = (ImageButton) findViewById(R.id.btn_17);

        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_1){
            Intent intent = new Intent(MainActivity2.this, Prothomalo.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_2){
            Intent intent = new Intent(MainActivity2.this, Protidin.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_3){
            Intent intent = new Intent(MainActivity2.this, Ittefaq.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_4){
            Intent intent = new Intent(MainActivity2.this, Jonokontho.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_5){
            Intent intent = new Intent(MainActivity2.this, Kalerkontho.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_6){
            Intent intent = new Intent(MainActivity2.this, Naya.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_7){
            Intent intent = new Intent(MainActivity2.this, Manob.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_8){
            Intent intent = new Intent(MainActivity2.this, Jugantor.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_9){
            Intent intent = new Intent(MainActivity2.this, Kalbela.class);
            startActivity(intent);
        }

       if(v.getId() == R.id.btn_10){
            Intent intent = new Intent(MainActivity2.this, Samakal.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_11){
            Intent intent = new Intent(MainActivity2.this, Jayjay.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_12){
            Intent intent = new Intent(MainActivity2.this, Share.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_13){
            Intent intent = new Intent(MainActivity2.this, Orthoniti.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_14){
            Intent intent = new Intent(MainActivity2.this, Inkelab.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_15){
            Intent intent = new Intent(MainActivity2.this, Observer.class);
            startActivity(intent);
        }  if(v.getId() == R.id.btn_16){
            Intent intent = new Intent(MainActivity2.this, Dailystar.class);
            startActivity(intent);
        }if(v.getId() == R.id.btn_17){
            Intent intent = new Intent(MainActivity2.this, Financial.class);
            startActivity(intent);
        }

    }
}