import java.util.Enumeration;
import java.util.Vector;

class Employee {
    String firstName;
    String lastName;
    int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        Vector<Employee> employeeVector = new Vector<>();
        employeeVector.add(new Employee("John", "Doe", 30));
        employeeVector.add(new Employee("Jane", "Doe", 25));
        employeeVector.add(new Employee("Jack", "Doe", 28));
        printAll(employeeVector);
    }

    public static void printAll(Vector<Employee> employeeVector) {
        Enumeration<Employee> enumeration = employeeVector.elements();
        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            System.out.println("Name: " + employee.firstName + " " + employee.lastName + ", Age: " + employee.age);
        }
    }
}
