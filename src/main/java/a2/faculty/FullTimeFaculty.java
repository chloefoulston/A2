package a2.faculty;

public class FullTimeFaculty extends FacultyMember{

    private double teachingAllowance;

    public FullTimeFaculty() {
        super();
        this.teachingAllowance = 0.0;
    }

    public FullTimeFaculty(String employeeId, String name, double baseSalary, double teachingAllowance) {
        super(employeeId, name, baseSalary);
        this.teachingAllowance = teachingAllowance;
    }

    public FullTimeFaculty(FullTimeFaculty other) {
        super(other);
        this.teachingAllowance = other.teachingAllowance;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + teachingAllowance;
    }
    public double getTeachingAllowance() {
        return teachingAllowance;
    }

}
