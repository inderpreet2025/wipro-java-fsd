import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee id:");
        int id = scanner.nextInt();

        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();

        Employee originalEmployee = new Employee(name, id, salary);
        Employee clonedEmployee = (Employee) originalEmployee.clone();

        System.out.println("Original Employee: " + originalEmployee);
        System.out.println("Cloned Employee: " + clonedEmployee);

        System.out.println("Enter new employee name:");
        name = scanner.next();

        System.out.println("Enter new employee id:");
        id = scanner.nextInt();

        System.out.println("Enter new employee salary:");
        salary = scanner.nextDouble();

        originalEmployee.setName(name);
        originalEmployee.setId(id);
        originalEmployee.setSalary(salary);

        System.out.println("After changing original employee:");
        System.out.println("Original Employee: " + originalEmployee);
        System.out.println("Cloned Employee: " + clonedEmployee);
    }
    static class Employee implements Cloneable {
        private String name;
        private int id;
        private double salary;
    
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public double getSalary() {
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
    
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    
        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }
    
}
