package com.javalesson.constructor;

import com.javalesson.domainmodel.Employee;

public class ConstructorMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Anton", "software developer", 17500);
        Employee employee2 = new Employee("Wojciech", "software engeneer", 28000);

        System.out.println(employee.toString());
    }
}
