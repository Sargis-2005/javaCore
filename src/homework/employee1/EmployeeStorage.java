package homework.employee1;

import homework.employee.Employee;

public class EmployeeStorage {
    private Employee1[] employees = new Employee1[10];
    private int size;
    public void addEmployee1(Employee1 employee1) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee1;
    }

    private void extend() {
        Employee1[] temp = new Employee1[employees.length + 10];
        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }
        employees = temp;
    }

    public Employee1 getByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }

        }
        return null;
    }
    public void printAll(){
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
        System.out.println();
    }
  public void printByCompanyName(String name){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i]!=null&&employees[i].getCompany1()!=null&&employees[i].getCompany1().getName().equals(name)){
                System.out.println(employees[i]);
                found=true;
            }

        }
        if (!found){
            System.out.println("No employees found for company name" + name);
        }
    }
   public void printByCompanyId(String id){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i]!=null&&employees[i].getCompany1()!=null&&employees[i].getCompany1().getCompanyId().equals(id)){
                System.out.println(employees[i]);
                found=true;
            }

        }
        if (!found){
            System.out.println("No employees found for company id" + id);
        }
    }

}
