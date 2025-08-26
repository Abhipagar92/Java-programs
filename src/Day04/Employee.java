package Day04;

import java.util.Scanner;

public class Employee {
    int emp_id;
    String emp_name;
    double emp_salary;

     public Employee(){

     }

     public Employee(int emp_id, String emp_name, double emp_salary){

         this.emp_id = emp_id;
         this.emp_name = emp_name;
         this.emp_salary = emp_salary;
     }

     public void acceptEmployee(Scanner sc){
         System.out.println("Enter Employee Id: ");
         emp_id = sc.nextInt();

         sc.nextLine();

         System.out.println("Enter Employee Name: ");
         emp_name = sc.nextLine();

         System.out.println("Enter Employee Salary: ");
         emp_salary = sc.nextDouble();
     }

     public void displayEmployee(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee Salary: "+emp_salary);
     }


}
