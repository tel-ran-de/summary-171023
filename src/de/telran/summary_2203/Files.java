package de.telran.summary_2203;

public class Files {

    public static void main(String[] args) {
        // City, Temperature, Location, DateTime
        // ..
        // ..
        String query = "select name, salary from employees where name is 'Petya'";
        Employee employee = new Employee("Anton", "BMW", 10);
        Employee employee1 = new Employee("Anton", "BMW", 10);
        System.out.println(employee);
        System.out.println(employee.equals(employee1));
    }
}
