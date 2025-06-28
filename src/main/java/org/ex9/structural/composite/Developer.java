package org.ex9.structural.composite;

/**
 * Листовой объект "Разработчик".
 * @author Краковцев Артём
 */
public class Developer implements Employee {

    /**
     * Имя сотрудника.
     */
    private final String name;
    /**
     * Зарплата сотрудника
     */
    private double salary;
    /**
     * Должность сотрудника
     */
    private final String role;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.role = "Разработчик";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return this.role;
    }

}
