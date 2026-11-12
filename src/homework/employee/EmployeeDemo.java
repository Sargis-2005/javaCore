package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printcommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    System.out.println("program finish");
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    searchEmployeeByID();
                    break;
                case "4":
                    seachEmployeeByCompany();
                    break;


            }
        }
    }


    private static void seachEmployeeByCompany() {
        System.out.println("please input company");
        String company = scanner.nextLine();
        employeeStorage.searchByCompany(company);
    }

    private static void searchEmployeeByID() {
        System.out.println("please input ID");
        String ID = scanner.nextLine();
        employeeStorage.searchByID(ID);
    }


    private static void addEmployee() {
        System.out.println("please input name,surname,ID,salary,company,position");
        String employeData = scanner.nextLine();
        String[] employeDataArr = employeData.split(",");
        double salary = Double.parseDouble(employeDataArr[3]);
        Employee employee = new Employee(employeDataArr[0],
                employeDataArr[1],
                employeDataArr[2],
                salary,
                employeDataArr[4],
                employeDataArr[5]);
        employeeStorage.add(employee);
        System.out.println("Employee added!!!");

    }

    private static void printcommand() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY");

    }
}



