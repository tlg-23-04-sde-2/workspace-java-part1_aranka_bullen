package com.hr.personnel;

import java.time.LocalDate;

class HourlyEmployee extends Employee {
    double rate;
    double hours;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
    }



    public void pay(){
        double pay = hours * rate;
        System.out.printf("%s gets paid at a %s rate * %s hours", getName(), getRate(), getHours());
    }



    public String toString() {
        return String.format("Name: %s, Hire Date: %s, Rate: %s, Hours: %s", getName(), getHireDate(), getRate(), getHours());
    }
}