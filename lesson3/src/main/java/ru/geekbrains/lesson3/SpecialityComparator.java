package ru.geekbrains.lesson3;

import java.util.Comparator;

public class SpecialityComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.speciality.compareTo(o2.speciality);
        if(res == 0){
            res = o1.name.compareTo(o2.name);
        }
        return res;
    }
}
