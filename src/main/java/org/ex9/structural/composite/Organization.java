package org.ex9.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Объект Компоновщик, который объединяет работников ({@link Employee})
 * и предоставляет информацию об общей ЗП сотрудников.
 * @author Краковцев Артём
 */
public class Organization {

    /**
     * Список сотрудников организации.
     */
    private final List<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    /**
     * @return список сотрудников
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Добавляет в список нового сотрудника.
     * @param employee новый сотрудник
     */
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    /**
     * @return общая зарплата всех сотрудников.
     */
    public double getTotalSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

}
