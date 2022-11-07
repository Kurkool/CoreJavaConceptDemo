package myPack;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) throws InvalidUserDetailException {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("*** Input Employee Details ***");
        System.out.print("Name:");
        String empName = sc.nextLine();
        System.out.print("Age:");
//        int empAge = Integer.parseInt(sc.nextLine());
        int empAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Gender:");
        String empGender = sc.nextLine();

        emp.setName(empName);
        emp.setAge(empAge);
        emp.setGender(empGender);

        EmployeeValidation validate = new EmployeeValidation();
        validate.validateInput(emp);
    }
}
