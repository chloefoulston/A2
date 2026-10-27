package a2.faculty;

public class PartTimeFaculty extends FacultyMember{
    private double sessionAllowance;

    public PartTimeFaculty() {
        super();
        this.sessionAllowance = 0.0;
    }

    public PartTimeFaculty(String employeeId, String name, double baseSalary, double sessionAllowance) {
        super(employeeId, name, baseSalary);
        this.sessionAllowance = sessionAllowance;
    }

    public PartTimeFaculty(PartTimeFaculty other) {
        super(other);
        this.sessionAllowance = other.sessionAllowance;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + sessionAllowance;
    }

    public double getSessionAllowance() {
        return sessionAllowance;
    }

}
