package ru.geekbrains.lesson3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    protected String speciality;

    public Employee(String surName, String name, double salary, String speciality) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.speciality = speciality;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
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
