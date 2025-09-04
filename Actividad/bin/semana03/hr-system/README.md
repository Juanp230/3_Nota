# hr-system

This project is a simple Human Resources system designed to manage employee information. It includes functionality to create employee records, manage their salaries, and display their details.

## Project Structure

```
hr-system
├── src
│   └── company
│       ├── hr
│       │   └── Employee.java
│       └── main
│           └── Main.java
└── README.md
```

## Classes

### Employee Class

- **Package:** `company.hr`
- **Attributes:**
  - `public String name`: The name of the employee.
  - `private double salary`: The salary of the employee, which is private and controlled.
  - `protected String role`: The role of the employee.
  
- **Methods:**
  - `public String getName()`: Returns the name of the employee.
  - `public double getSalary()`: Returns the salary of the employee.
  - `public void setSalary(double salary)`: Sets the salary of the employee with validation to ensure it is greater than 0.
  - `protected String getRole()`: Returns the role of the employee.
  - `public void increaseSalary(double amount)`: Increases the salary by the specified amount only if the amount is positive.

### Main Class

- **Package:** `company.main`
- **Methods:**
  - `public static void main(String[] args)`: Creates two Employee objects, sets their names, roles, and salaries, and displays their information using the getters.

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Compile the Java files using the command:
   ```
   javac src/company/hr/Employee.java src/company/main/Main.java
   ```
5. Run the Main class using the command:
   ```
   java -cp src company.main.Main
   ```

This will execute the application and display the employee information as defined in the Main class.