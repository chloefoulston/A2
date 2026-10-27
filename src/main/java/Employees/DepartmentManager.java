package Employees;

public class DepartmentManager extends Manager {

    private String department;

    public DepartmentManager(String employeeId, String name, double baseSalary, String department) {
        super(employeeId, name, baseSalary);
        this.department = department;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.10;
    }
}
