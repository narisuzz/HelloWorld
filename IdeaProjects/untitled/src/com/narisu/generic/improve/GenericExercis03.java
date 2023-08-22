package com.narisu.generic.improve;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercis03 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000,
                new MyDate(2000, 11, 11)));
        employees.add(new Employee("jack", 12000,
                new MyDate(2001, 12, 12)));
        employees.add(new Employee("hsp", 50000,
                new MyDate(1980, 10, 10)));
        System.out.println("employees=" + employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }

                int nameComparison = emp1.getName().compareTo(emp2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                int yearComparison = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
                if (yearComparison != 0) {
                    return yearComparison;
                }

                // 如果姓名和出生日期都相等，则按照薪资进行排序
                return (int) (emp1.getSal() - emp2.getSal());
            }
        });

        System.out.println("Sorted employees=" + employees);
    }
}

