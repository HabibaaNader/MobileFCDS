package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private Button back_button,login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back_button = (Button) findViewById(R.id.button2);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });

        login_button = (Button) findViewById(R.id.button3);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity1() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openActivity3() {
        Intent intent1 = new Intent(this, MainActivity3.class);
        startActivity(intent1);
    }
}
