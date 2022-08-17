package Lesson3;

public class SumSalary {

    public double sumSalary(Company employeeArrayList) {
        double salarySum = 0;
        for (Employee i : employeeArrayList.getEmployeeArrayList()) {
            salarySum += i.getSalary();
        }
        return salarySum;
    }
}
