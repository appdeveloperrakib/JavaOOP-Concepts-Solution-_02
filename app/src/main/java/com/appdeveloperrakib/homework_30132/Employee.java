package com.appdeveloperrakib.homework_30132;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {

    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public int calculateYears(){

        LocalDate currentDate = LocalDate.now();
        long years = ChronoUnit.YEARS.between(hireDate,currentDate);
        return (int) years;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
