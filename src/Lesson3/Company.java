package Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    public ArrayList<Employee> employeeArrayList;

    public Company() {
        this.employeeArrayList = new ArrayList<>();
    }

    public void addNewEmployeeToList() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type employee name: ");
        String name = input.nextLine();
        System.out.println("Type employee surname: ");
        String surname = input.nextLine();
        System.out.println("Type employee salary: ");
        String salary = input.nextLine();

        setEmployeeArrayList(new Employee(name, surname, Double.parseDouble(salary)));
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(Employee employee) {
        this.employeeArrayList.add(employee);
    }
}
