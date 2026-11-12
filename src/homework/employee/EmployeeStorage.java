package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;


    public void add(Employee n) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = n;
    }

    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }
        employees = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
        System.out.println();
    }

    public void searchByID(String employeeID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getEmployeID().equals(employeeID)) {
                System.out.println("Employee found:");
                System.out.println(employees[i]);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }
    }

    public void searchByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getCompany().equals(company)) {
                System.out.println("Employee found:");
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with company " + company + " not found.");
        }


    }

}
