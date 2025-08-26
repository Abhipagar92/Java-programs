package Day02.p1;

import java.util.Scanner;

public class Employee {
    private int emp_id;
    private String name;
    private double salary;

    public Employee(){
        this(1, " ", 2001);
    }

    public Employee(int emp_id, String name, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    public void acceptEmployee(Scanner sc){
          System.out.println("Enter Employee ID: ");
          emp_id = sc.nextInt();

          System.out.println("Enter Employee Name: ");
          name = sc.next();

          System.out.println("Enter Employee Salary: ");
          salary = sc.nextDouble();

    }

   public void displayEmployee(){
         System.out.println("Emp_Id: " +emp_id);
         System.out.println("Emp_Name: " +name);
         System.out.println("Emp_Salary: " +salary);
    }
}
