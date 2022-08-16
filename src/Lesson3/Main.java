package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Company employeeList = new Company();
        Scanner in = new Scanner(System.in);
        boolean menuLoopBreak = true;
        int maxInitialEmployeeCounter = 1;

        // Adding first 5 employees
        for (int i = 0; i < maxInitialEmployeeCounter; i++) {
            employeeList.addNewEmployeeToList();
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
                case "2" -> System.out.println(employeeList.getEmployeeArrayList());
                case "3" -> employeeList.addNewEmployeeToList();
                case "4" -> menuLoopBreak = false;
                default -> System.out.println("Wrong command");
            }
        } while (menuLoopBreak);

        System.out.println("Program ended");
    }
}
