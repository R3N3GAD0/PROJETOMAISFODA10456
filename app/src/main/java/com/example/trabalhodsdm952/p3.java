package com.example.trabalhodsdm952;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class p3 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.p3);
            Button next = findViewById(R.id.BotaoFoda);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Intent intent = new Intent(v.getContext(), p4T.class);
                  startActivity(intent);
                }
            });
        }

    }

