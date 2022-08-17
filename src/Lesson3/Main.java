package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Company employeeList = new Company();
        Scanner in = new Scanner(System.in);
        boolean menuLoopBreak = true;
        int maxInitialEmployeeCounter = 5;

        // Adding first 5 employees
        for (int i = 0; i < maxInitialEmployeeCounter; i++) {
            addNewEmployeeToList(employeeList);
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
                case "1" -> System.out.println("Sum of salary = " + (new SumSalary().sumSalary(employeeList)));
                case "2" -> employeeList.printAllEmployees();
                case "3" -> addNewEmployeeToList(employeeList);
                case "4" -> menuLoopBreak = false;
                default -> System.out.println("Wrong command");
            }
        } while (menuLoopBreak);

        System.out.println("Program ended");
    }

    public static void addNewEmployeeToList(Company employeeList) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type employee name: ");
        String name = in.nextLine();
        System.out.println("Type employee surname: ");
        String surname = in.nextLine();
        System.out.println("Type employee salary: ");
        String salary = in.nextLine();
        employeeList.setEmployeeArrayList(new Employee(name, surname, Double.parseDouble(salary)));
    }

}
