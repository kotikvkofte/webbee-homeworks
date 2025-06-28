package org.ex9.structural.composite;

/**
 * Листовой объект "Аналитик".
 * @author Краковцев Артём
 */
public class Analyst implements Employee {

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

    public Analyst(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.role = "Аналитик";
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
