class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000, 2020, "AB123456C");

        // Test getters
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        // Test setters
        employee.setName("Jane Doe");
        employee.setAnnualSalary(55000);
        employee.setYearStarted(2021);
        employee.setNationalInsuranceNumber("CD789012E");

        // Test getters after setting new values
        System.out.println("Updated Name: " + employee.getName());
        System.out.println("Updated Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Updated Year Started: " + employee.getYearStarted());
        System.out.println("Updated National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
