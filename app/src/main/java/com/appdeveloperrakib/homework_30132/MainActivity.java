package com.appdeveloperrakib.homework_30132;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        Employee employee1 = new Employee("Jubayer",50000, LocalDate.parse("2021-04-01"));

        textView.append("\nName: "+employee1.getName());
        textView.append("\nSalary: "+employee1.getSalary());
        textView.append("\nHire Date: "+employee1.getHireDate());
        textView.append("\nYears of Service: "+employee1.calculateYears());


        Employee employee2 = new Employee("John",70000, LocalDate.parse("2015-04-01"));

        textView.append("\n\nName: "+employee2.getName());
        textView.append("\nSalary: "+employee2.getSalary());
        textView.append("\nHire Date: "+employee2.getHireDate());
        textView.append("\nYears of Service: "+employee2.calculateYears());





    }
}