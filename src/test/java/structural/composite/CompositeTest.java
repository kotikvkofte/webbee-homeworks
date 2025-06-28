package structural.composite;

import org.ex9.structural.composite.Analyst;
import org.ex9.structural.composite.Developer;
import org.ex9.structural.composite.Organization;
import org.ex9.structural.composite.Tester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    @DisplayName("Сумма зарплат одного сотрудника")
    void totalSalaryForOneEmployee() {
        Organization organization = new Organization();
        double salary = 26000;

        organization.addEmployee(new Developer("Albert Ivanov", salary));

        Assertions.assertEquals(salary, organization.getTotalSalary());

    }

    @Test
    @DisplayName("Сумма зарплат нескольких сотрудников")
    void totalSalaryForManyEmployes() {
        Organization organization = new Organization();
        double salary = 50000;

        organization.addEmployee(new Developer("Albert Ivanov", 10000));
        organization.addEmployee(new Developer("Ivan Albertov", 20000));
        organization.addEmployee(new Analyst("John Snow", 10000));
        organization.addEmployee(new Tester("John Snow", 10000));

        Assertions.assertEquals(salary, organization.getTotalSalary());

    }

}
