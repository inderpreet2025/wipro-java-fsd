import java.io.*;
import java.util.Date;
import java.util.Calendar;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {}

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Assignment4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JANUARY, 1);
        Date dateOfBirth = calendar.getTime();

        Employee employee = new Employee("John Doe", dateOfBirth, "IT", "Software Engineer", 50000.0);

        try (FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employee);
        }

        try (FileInputStream fileInputStream = new FileInputStream("employee.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Employee deserializedEmployee = (Employee) objectInputStream.readObject();
            System.out.println("Name: " + deserializedEmployee.getName());
            System.out.println("Date of Birth: " + deserializedEmployee.getDateOfBirth());
            System.out.println("Department: " + deserializedEmployee.getDepartment());
            System.out.println("Designation: " + deserializedEmployee.getDesignation());
            System.out.println("Salary: " + deserializedEmployee.getSalary());
        }
    }
}
