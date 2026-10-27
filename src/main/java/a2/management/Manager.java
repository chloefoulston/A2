package a2.management;
import a2.Employee;


public abstract class Manager extends Employee {

    public Manager(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
}