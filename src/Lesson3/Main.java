package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Company employeesList = new Company();
        Scanner in = new Scanner(System.in);
        boolean menuLoopBreak = true;
        int maxInitialEmployeeAdditionCounter = 5;

        // Adding first 5 employees
        for (int i = 0; i < maxInitialEmployeeAdditionCounter; i++) {
            addNewEmployeeToList(employeesList);
        }

        do {
            System.out.println("""
                    You have 4 possible options. Choose what to do:
                    1 – Print sum of all employees salary
                    2 – Display all employees data
                    3 – Add new employee
                    4 – End program""");

            String input = in.nextLine();

            switch (input) {
                case "1" -> System.out.println("Sum of salary = " + (new SumSalary().sumSalary(employeesList)));
                case "2" -> employeesList.printAllEmployees();
                case "3" -> addNewEmployeeToList(employeesList);
                case "4" -> menuLoopBreak = false;
                default -> System.out.println("Wrong command");
            }
        } while (menuLoopBreak);

        System.out.println("Program ended");
    }

    public static void addNewEmployeeToList(Company employeesList) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type employee name: ");
        String name = in.nextLine();
        System.out.println("Type employee surname: ");
        String surname = in.nextLine();
        System.out.println("Type employee salary: ");
        String salary = in.nextLine();
        employeesList.setEmployeesArrayList(new Employee(name, surname, Double.parseDouble(salary)));
    }

}
