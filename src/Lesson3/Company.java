package Lesson3;

import java.util.ArrayList;

public class Company {

    public ArrayList<Employee> employeeArrayList;

    public Company() {
        this.employeeArrayList = new ArrayList<>();
    }

    public void printAllEmployees() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(Employee employee) {
        this.employeeArrayList.add(employee);
    }
}
