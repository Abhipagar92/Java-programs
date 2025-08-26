package Day02.p2;

//import Day02.p1.Employee;

import Day02.p1.Employee;

import java.util.Scanner;

class Employee02{
    int emp_id;
    String name;
    double Salary;

    public Employee02(){

    }

    public Employee02(int emp_id, String name, double salary){
        this.emp_id = emp_id;
        this.name = name;
        this.Salary = salary;
    }

    public void acceptEmp(Scanner sc ){
        System.out.println("Enter Employee Id: ");
        emp_id = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        name = sc.next();

        System.out.println("Enter Employee Salary: ");
         Salary = sc.nextDouble();

    }

    public void displayEmp(){
        System.out.println("Employee Details :"+ "Employee ID: "+ emp_id + "Employee Name: "+name+ "Employee Salary: "+Salary);
    }
}

public class program01 {

    public static int menu(Scanner sc) {

        System.out.println("0. Exit");
        System.out.println("1. Accept Employee");
        System.out.println("2. Display Employee");
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();

        return  choice;

    }

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        Employee02 e1 = new Employee02();


        while ((choice = menu(sc)) != 0){

             switch (choice){
                 case 1:
                      e1.acceptEmp(sc);
                      break;
                 case 2:
                      e1.displayEmp();
                      break;
                 default:
                      System.out.println("Wrong Choice... :( please enter Correct Choice .... :) ");
                      break;
             }
        }



    }
}
