package com.fatma.wuhanproject_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {

            //loginUSer(email, password);

            @Override
            public void onClick(View view) {
                new SweetAlertDialog(LoginActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Success!")
                        .setContentText("Logged in successfully")
                        .show();

                Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(i);
            }
        });

        }

    }
