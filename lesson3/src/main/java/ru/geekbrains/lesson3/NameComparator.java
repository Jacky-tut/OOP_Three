package ru.geekbrains.lesson3;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.name.compareTo(o2.name);
        if (result == 0){
            result = Double.compare( o2.calculateSalary(), o1.calculateSalary());
        }
        return result;
    }
    }

