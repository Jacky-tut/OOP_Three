package ru.geekbrains.lesson3;


public abstract class Employee implements Comparable<Employee> {

    protected String name;

    protected String surName;

    protected double salary;

    protected String speciality;

    public Employee(String surName, String name, double salary, String speciality) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.speciality = speciality;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Специальность: %s; Среднемесячная заработная плата: %.2f", name, surName, speciality, salary);
    }
    @Override
    public int compareTo(Employee o) {
        return Double.compare( o.calculateSalary(), calculateSalary());
    }

}
