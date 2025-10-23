package unidad2.actividad1.company.hr;

public class Employee {
    public String name;
    private double salary;
    protected String role;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que 0.");
        }
    }

    protected String getRole() {
        return role;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }
}