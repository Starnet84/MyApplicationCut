package com.itsteps.altair.myapplicationcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_screen1 = (Button) findViewById(R.id.btn_screen1);
        Button btn_screen2 = (Button) findViewById(R.id.btn_screen2);

        btn_screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), Screen1Activity.class);
                startActivity(intent);
            }
        });

        btn_screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent (getApplicationContext(), Screen2Activity.class);
               startActivity(intent);
            }
        });
    }
}
