public class Main {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee();
        employee1.name = "Alice";
        employee1.setSalary(50000);
        employee1.role = "Developer";

        Employee employee2 = new Employee();
        employee2.name = "Bob";
        employee2.setSalary(60000);
        employee2.role = "Manager";

        // Display employee information
        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Role: " + employee1.getRole());
        System.out.println("Salary: $" + employee1.getSalary());

        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Role: " + employee2.getRole());
        System.out.println("Salary: $" + employee2.getSalary());
    }
}