package org.ex9.structural.composite;

/**
 * Абстракция "Сотрудник" - Leaf паттерна Composite.
 * @author Краковцев Артём
 */
public interface Employee {

    /**
     * @return имя сотрудника.
     */
    String getName();

    /**
     * @return зарплата сотрудника.
     */
    double getSalary();

    void setSalary(double salary);

    /**
     * @return должность сотрудника
     */
    String getRole();

}
