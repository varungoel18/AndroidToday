package com.varungoel.today;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDateTime = findViewById(R.id.txt_datetime);
//        String dateTimeFormat = "MM/dd/yy hh:mm a";
//        String dateTimeFormat = "MMM dd, yyyy h:mm aa";
//        String dateTimeFormat = "MMMM dd,yyyy h:mmaa";
//        String dateTimeFormat = "E , MMMM dd,yyyy h:mm:ss a";
//        String dateTimeFormat = "EEEE,MMMM dd,yyyy h:mm:ss a";

        Date date = Calendar.getInstance().getTime();
//        txtDateTime.setText(DateFormat.format(dateTimeFormat,date));
        txtDateTime.setText(date.toString());
    }
}