import java.util.ArrayList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Emp ID: " + empId);
        System.out.println("Emp Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        if (list.contains(e)) {
            System.out.println("Employee already exists in the database!");
            return false;
        } else {
            list.add(e);
            System.out.println("Employee added successfully!");
            return true;
        }
    }

    public boolean deleteEmployee(int empId) {
        Employee employeeToDelete = null;
        for (Employee employee : list) {
            if (employee.empId == empId) {
                employeeToDelete = employee;
                break;
            }
        }

        if (employeeToDelete != null) {
            list.remove(employeeToDelete);
            System.out.println("Employee with Emp ID: " + empId + " deleted successfully!");
            return true;
        } else {
            System.out.println("Employee with Emp ID: " + empId + " not found in the database!");
            return false;
        }
    }

    public String showPaySlip(int empId) {
        Employee employee = null;
        for (Employee emp : list) {
            if (emp.empId == empId) {
                employee = emp;
                break;
            }
        }

        if (employee != null) {
            return "Payslip for Employee with Emp ID: " + empId + "\n" +
                   "Name: " + employee.empName + "\n" +
                   "Salary: " + employee.salary;
        } else {
            return "Employee with Emp ID: " + empId + " not found in the database!";
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        EmployeeDB employeeDB = new EmployeeDB();

        Employee employee1 = new Employee(101, "John Doe", "john.doe@example.com", "Male", 50000);
        Employee employee2 = new Employee(102, "Jane Smith", "jane.smith@example.com", "Female", 60000);

        employeeDB.addEmployee(employee1);
        employeeDB.addEmployee(employee2);

        employeeDB.deleteEmployee(101);

        System.out.println(employeeDB.showPaySlip(102));
    }
}