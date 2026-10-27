package a2;
public abstract class Employee implements Comparable<Employee>{
    private String employeeId;
    private String name;
    private double baseSalary;

    // Parameterized Constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Default Constructor
    public Employee(){
        this("","",0.0);
    }

    //Copy Constructor
    public Employee(Employee other){
        this(other.employeeId, other.name, other.baseSalary);
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return "ID: " + employeeId
                + ", Name: " + name
                + ", Base Salary: " + baseSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return employeeId.equals(other.employeeId);
    }
    // Part 5 — Natural ordering with Comparable
    @Override
    public int compareTo(Employee other) {
        return this.employeeId.compareTo(other.employeeId);
    }
}
