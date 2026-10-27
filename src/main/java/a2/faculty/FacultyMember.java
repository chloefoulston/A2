package a2.faculty;
import a2.Employee;

public abstract class FacultyMember extends Employee {

    public FacultyMember(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    public FacultyMember(FacultyMember other) {
        super(other);
    }
}