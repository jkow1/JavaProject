package Lesson3;

public class SumSalary {

    public double sumSalary(Company employeesList) {
        double salarySum = 0;
        for (Employee i : employeesList.getEmployeesArrayList()) {
            salarySum += i.getSalary();
        }
        return salarySum;
    }
}
