package ru.geekbrains.lesson3;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String surName, String name, double salary, String speciality) {
        super(surName, name, salary, speciality);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Специальность: %s; %.2f (руб.)", name, surName, speciality, salary);
    }
}

