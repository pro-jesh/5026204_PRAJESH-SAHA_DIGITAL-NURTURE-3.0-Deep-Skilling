package Week1.Data_Structures_and_Algorithms.Exercise_4.code;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(10);

        // Adding employees
        management.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        management.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        management.addEmployee(new Employee(3, "Charlie", "Designer", 70000));

        // Traversing employees
        System.out.println("All Employees:");
        management.traverseEmployees();

        // Searching for an employee
        Employee emp = management.searchEmployee(2);
        System.out.println("Searched Employee: " + emp);

        // Deleting an employee
        management.deleteEmployee(2);
        System.out.println("Employees after deletion:");
        management.traverseEmployees();
    }
}
