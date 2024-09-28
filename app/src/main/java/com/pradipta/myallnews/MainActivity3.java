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

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        btn1 = (ImageButton) findViewById(R.id.btn_1);
        btn2 = (ImageButton) findViewById(R.id.btn_2);
        btn3 = (ImageButton) findViewById(R.id.btn_3);
        btn4 = (ImageButton) findViewById(R.id.btn_4);
        btn5 = (ImageButton) findViewById(R.id.btn_5);
        btn6 = (ImageButton) findViewById(R.id.btn_6);
        btn7 = (ImageButton) findViewById(R.id.btn_7);
        btn8 = (ImageButton) findViewById(R.id.btn_8);
        btn9 = (ImageButton) findViewById(R.id.btn_9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       if(v.getId()==R.id.btn_1){
            Intent intent = new Intent(MainActivity3.this, Ananda.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.btn_2){
            Intent intent = new Intent(MainActivity3.this, Abp.class);
            startActivity(intent);
        }if(v.getId()==R.id.btn_3){
            Intent intent = new Intent(MainActivity3.this, Bortoman.class);
            startActivity(intent);
        }if(v.getId()==R.id.btn_4){
            Intent intent = new Intent(MainActivity3.this, Eisomoy.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.btn_5){
            Intent intent = new Intent(MainActivity3.this, Telegraph.class);
            startActivity(intent);
        }if(v.getId()==R.id.btn_6){
            Intent intent = new Intent(MainActivity3.this, Hindu.class);
            startActivity(intent);
        }if(v.getId()==R.id.btn_7){
            Intent intent = new Intent(MainActivity3.this, Hindustan.class);
            startActivity(intent);
        }if(v.getId()==R.id.btn_8){
            Intent intent = new Intent(MainActivity3.this, Indian.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.btn_9){
            Intent intent = new Intent(MainActivity3.this, Times.class);
            startActivity(intent);
        }

    }
}