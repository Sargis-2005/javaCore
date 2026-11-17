package homework.employee1;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static CompanyStorage companyStorage = new CompanyStorage();
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    static void main() {
        boolean isRun = true;
        while (isRun) {
            printcommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    System.out.println("Program finished");
                    break;
                case "1":
                    addEmploye();
                    break;
                case "2":
                    employeeStorage.printAll();
                    break;
                case "3":
                    searchEmployeByID();
                    break;
                case "4":
                    searchEmployeesByCompanyName();
                    break;
                case "5":
                    addCompany();
                    break;
                case"6":
                    companyStorage.printAll();
                    break;
                case"7":
                    searchCompanyById();
                    break;
                case"8":
                    printEmployeesByCompanyId();
                    break;
                case "9":
                    changeEmployeeCompany();
                    break;
                case "10":
                    printEmployeeCompany();
                    break;


            }
        }
    }

    private static void printEmployeeCompany() {
        System.out.println("Enter employee ID");
        String employeeId = scanner.nextLine();
        Employee1 employee1 = employeeStorage.getByID(employeeId);
        if (employee1!=null && employee1.getCompany1()!=null){
            System.out.println("Employee" + employee1.getName() + " " + employee1.getSurname());
            System.out.println("Company information " + employee1.getCompany1());
        }else System.out.println("Employee or company not found");
    }

    private static void changeEmployeeCompany() {
        System.out.println("Enter employee ID");
        String emloyeeId = scanner.nextLine();
        Employee1 employee1 = employeeStorage.getByID(emloyeeId);
        if (employee1==null){
            System.out.println("Employee not found");
            return;
        }
        System.out.println("Company" + employee1.getCompany1().getName());
        System.out.println("Enter new company ID");
        String newCompanyID = scanner.nextLine();
        Company1 newCompany1 = companyStorage.getByID(newCompanyID);
        if (newCompany1!=null){
            employee1.setCompany1(newCompany1);
            System.out.println("Employee company successfully changed!");
            System.out.println("New company: " + newCompany1.getName());
        }else System.out.println("Company not found");
    }

    private static void printEmployeesByCompanyId() {
        System.out.println("Enter company ID:");
        String id = scanner.nextLine();
        employeeStorage.printByCompanyId(id);
    }

    private static void searchCompanyById() {
        System.out.println("Enter company ID");
        String id = scanner.nextLine();
        System.out.println(companyStorage.getByID(id));
    }

    private static void addCompany() {
        System.out.println("Please input company id,name,industry,country");
        String companyData = scanner.nextLine();
        String[] companyDataArr = companyData.split(",");
        Company1 company1 = new Company1(companyDataArr[0],
                companyDataArr[1],
                companyDataArr[2],
                companyDataArr[3]);
        companyStorage.addCompany(company1);
        System.out.println("Company added!!");
    }

    private static void searchEmployeesByCompanyName() {
        System.out.println("Enter company name");
        String companyName = scanner.nextLine();
        employeeStorage.printByCompanyName(companyName);
    }

    private static void addEmploye() {
        System.out.println("please input name,surname,employee id,salary,position,company id");
        String employeeData = scanner.nextLine();
        String[] employeeDataArr = employeeData.split(",");
        Double salary = Double.parseDouble(employeeDataArr[3]);
        Company1 company1 = companyStorage.getByID(employeeDataArr[5]);
        Employee1 employee1 = new Employee1(employeeDataArr[0],
                employeeDataArr[1],
                employeeDataArr[2],
                salary,
                company1,
                employeeDataArr[4]);
        employeeStorage.addEmployee1(employee1);
        System.out.println("Employee added!!");
    }

    private static void printcommand() {
        System.out.println("Please input 0 for Exit ");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employee");
        System.out.println("Please input 3 for search Employee by ID");
        System.out.println("Please input 4 for search Employee by company name");
        System.out.println("Please input 5 for add company");
        System.out.println("Please input 6 for print all companies");
        System.out.println("Please input 7 for search company by Id");
        System.out.println("Please input 8 for print Employees by company Id");
        System.out.println("Please input 9 for change Employee company");
        System.out.println("Please input 10 for print Employee company");
    }

    private static void searchEmployeByID() {
        System.out.println("Please input employee id");
        String id = scanner.nextLine();
        System.out.println(employeeStorage.getByID(id));

    }
}
