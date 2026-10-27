package Employees;

public class FullTimeFaculty extends FacultyMember{

    private double teachingAllowance;

    public FullTimeFaculty(String employeeId, String name, double baseSalary, double teachingAllowance) {
        super(employeeId, name, baseSalary);
        this.teachingAllowance = teachingAllowance;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + teachingAllowance;
    }
    public double getTeachingAllowance() {
        return teachingAllowance;
    }

}
