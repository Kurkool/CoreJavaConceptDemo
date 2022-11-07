package myPack;


import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        //--- ex1
//        ArraysExercise ae = new ArraysExercise();
//        ae.arrProcedure();

        //--- ex2
//        MethodsInJavaExercise methodInJava = new MethodsInJavaExercise();
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        System.out.println("Please input 5 int value:");
//        for(int i = 0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        methodInJava.getOddValues(arr);

        //--- ex3
//        Employee employee = new Employee();
//        employee.setId("001");
//        employee.setFirstName("emName");
//        employee.setLastName("emLastName");
//        employee.setDepartment("ATCT");
//        employee.setPosition("Dev");
//
//        employee.printDetails();
//
//        Employee employee2 = new Employee("002","emName2",
//                "emLastName2","ATCT","Analyst");
//
//        employee2.printDetails();

        //--- ex4
        Customer customer = new Customer("Kurkool","Uss");
        Account savings = new Savings("Savings",customer);
        savings.deposit(1000);
        savings.withdraw(500);
        savings.display();
      System.out.println("----------");
        Customer customer2 = new Customer("cusName","cusLastName");
        Account checking = new Checking("Checking", customer2);
        checking.deposit(500);
        checking.withdraw(600);
        checking.display();
        System.out.println("----------");
    //--- ex5
        Customer customer3 = new Customer("Kurkool","Uss");
        Account priv = new Privileged("Privileged",customer3,1000);
        priv.deposit(50);
        priv.withdraw(550);
        priv.withdraw(1000);
        priv.display();

    }
}
