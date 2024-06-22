package com.javalesson.domainmodel;

public class Employee {
    private static int employeeCount;
    private String name;
    private String position;
    private int salary;
    private int employeeId;
    private String department;

    static {
        employeeCount = 1000;
    }

    {
        department = "IT";
    }

    public Employee() {
        employeeCount = employeeCount + 1;
        this.employeeId = employeeCount;
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "it");
    }

    private Employee(String name, String position, int salary, String department) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        employeeCount = employeeCount + 1;
        this.employeeId = employeeCount;

        if(!this.department.equals(department)) {
            this.department = department;
        }
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", employeeId=" + employeeId +
                ", department='" + department + '\'' +
                '}';
    }
}
