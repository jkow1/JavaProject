package Lesson3;

import java.util.ArrayList;

public class Company {

    public ArrayList<Employee> employeesArrayList;

    public Company() {
        this.employeesArrayList = new ArrayList<>();
    }

    public void printAllEmployees() {
        for (Employee employee : employeesArrayList) {
            System.out.println(employee.toString());
        }
    }

    public ArrayList<Employee> getEmployeesArrayList() {
        return employeesArrayList;
    }

    public void setEmployeesArrayList(Employee employee) {
        this.employeesArrayList.add(employee);
    }
}
