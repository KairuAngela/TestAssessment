package com.fatma.wuhanproject_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class MainActivity extends AppCompatActivity {

    TextInputEditText firstname, lastname, phone, dob, email, id;
    //TextInputEditText age;
    Button register;
    int yob, mob, ddob;


    /*private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            int mwaka = MainActivity.this.yob = year;
            int month = MainActivity.this.mob = monthOfYear;
            int day = MainActivity.this.ddob = dayOfMonth;
            MainActivity.this.updateDisplay();
        }
    };

    private void updateDisplay() {
        TextInputEditText date = this.dob;
        StringBuilder sb = new StringBuilder();
        sb.append(this.ddob);
        sb.append("-");
        sb.append(this.mob + 1);
        sb.append("-");
        sb.append(this.yob);
        sb.append(" ");
        date.setText(sb);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.firsn);
        lastname = findViewById(R.id.lasty);
        phone = findViewById(R.id.phoneNumber);
        id = findViewById(R.id.idNumber);
        //age = findViewById(R.id.age);
        dob = findViewById(R.id.age);
        email = findViewById(R.id.emailInput);
        register = findViewById(R.id.register);

        if(!Patterns.EMAIL_ADDRESS.matcher(email.getText()).matches()){
            email.setError("Email is not valid");
            email.setFocusable(true);
        } /*else if (age. < 5 ) {
            age.setError("You should be between 5 and 18 years old");
            age.setFocusable(true);
        }*/else if (phone.length() > 10) {
            phone.setError("Invalid phone number");
            phone.setFocusable(true);
        }else if (id.length() > 8) {
            id.setError("Invalid ID number");
            id.setFocusable(true);
        }else {
            //registerUSer(email, password);
        }

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Success!")
                        .setContentText("Registration successful")
                        .show();

                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        }

    }
