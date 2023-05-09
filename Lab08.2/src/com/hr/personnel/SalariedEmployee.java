package com.hr.personnel;

import java.time.LocalDate;

class SalariedEmployee extends Employee {

    double salary;


    public double getSalary() {
        return salary;
    }

    public void pay() {
        double pay = salary/52;
        System.out.printf("%s is paid on %s weekly salary", getName(), getSalary());
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
    }



    @Override
    public String toString() {
       return String.format("Name: %s, Hire Date: %s, Salary: %s", getName(), getClass(), getSalary());
    }
}