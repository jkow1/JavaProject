package Lesson3;

public class Employee {

    public String name;
    public String surname;
    public double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary for " + name + " " + surname + " is " + salary;
    }

    public double getSalary() {
        return salary;
    }
}
