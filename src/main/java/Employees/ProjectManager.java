package Employees;

public class ProjectManager extends Manager{
    private String projectName;

    public ProjectManager(String employeeId, String name, double baseSalary, String projectName) {
        super(employeeId, name, baseSalary);
        this.projectName = projectName;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() * 1.15;
    }

    public String getProjectName() {
        return projectName;
    }

}
