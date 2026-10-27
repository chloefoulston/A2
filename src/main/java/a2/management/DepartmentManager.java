package a2.management;
import a2.interfaces.BonusEligible;

public class DepartmentManager extends Manager implements BonusEligible {
    private String department;

    public DepartmentManager(String employeeId, String name, double baseSalary, String department) {
        super(employeeId, name, baseSalary);
        this.department = department;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.10;
    }
    // Part 4 — User-defined interface
    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.05;
    }

    public DepartmentManager(DepartmentManager other) {
        super(other);
        this.department = other.department;
    }
}