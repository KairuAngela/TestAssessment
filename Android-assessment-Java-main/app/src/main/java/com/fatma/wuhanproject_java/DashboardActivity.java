package com.fatma.wuhanproject_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class DashboardActivity extends AppCompatActivity {

    TextView fname, lname, phone, age, id, email;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        fname = findViewById(R.id.email);
        lname = findViewById(R.id.email);
        phone = findViewById(R.id.email);
        email = findViewById(R.id.email);
        age = findViewById(R.id.password);
        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        }

    }
