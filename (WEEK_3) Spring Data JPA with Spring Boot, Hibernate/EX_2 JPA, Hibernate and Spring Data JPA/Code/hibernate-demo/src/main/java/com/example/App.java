package com.example;

public class App {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        Employee emp1 = new Employee("Ruthvik", "Developer");
        Integer id1 = dao.saveEmployee(emp1);

        Employee emp2 = new Employee("Avinash", "Tester");
        Integer id2 = dao.saveEmployee(emp2);

        // List all employees
        System.out.println("Employees:");
        for (Employee e : dao.listEmployees()) {
            System.out.println(e);
        }
    }
}
