package com.fatma.wuhanproject_java;

import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;

public class DatePickerActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.datepicker_activity);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.datepicker_activity, menu);
        return true;
    }
}
