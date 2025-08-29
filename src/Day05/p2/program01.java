package Day05.p2;

import java.util.Scanner;

class Date{
    int day;
    int month;
    int year;

    public Date(){

    }

    public Date(int day , int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public void acceptDate(Scanner sc){
        System.out.println("Enter the Day : ");
        day = sc.nextInt();

        System.out.println("Enter the Month : ");
        month = sc.nextInt();

        System.out.println("Enter the Year : ");
        year = sc.nextInt();
    }

    public void displayDate(){
        System.out.println("Day: "+this.day+ " Month :"+this.month+ " Year :"+this.year);
    }
}

class Vehicle {
    String company;
    String licenceNo;


    public Vehicle( String company, String licenceNo){
        this.company=company;
        this.licenceNo=licenceNo;
    }

    public Vehicle() {

    }

    public void acceptVehicle(Scanner sc){
        System.out.println("Enter Vehicle Name : ");
        company= sc.next();
        sc.nextLine();

        System.out.println("Enter Vehicle Number :" );
        licenceNo= sc.nextLine();


    }

    public void displayVehicle(){

        System.out.println("Company: "+this.company);
        System.out.println("Licence No : "+this.licenceNo);

    }
}

class Employee{
    private int Empid;
    private String name;
    private double salary;
    Date doj;
    Vehicle vh;


    public Employee(){
        doj = new Date();
        vh = new Vehicle();
    }

   /* public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }*/

    public Employee(int empid, String name, double salary , int day, int month, int year ){
        this.Empid=empid;
        this.name=name;
        this.salary=salary;
//        this.vh=new Vehicle(company,licenceNo);
        this.doj=new Date(day,month,year);

    }

    public void acceptEmployee(Scanner sc ){
        System.out.println("Enter the Employee id :" );
        Empid = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter the Employee Name :" );
        name = sc.next();

        System.out.println("Enter the Employee Salary :" );
        salary = sc.nextDouble();

        vh.acceptVehicle(sc);
        doj.acceptDate(sc);


//        System.out.println("Enter Date: "+doj.day+ " / "+ doj.month+ " /: "+doj.year);



    }

    public void displayEmployee(){
       // System.out.println("Employee Id: "+getEmpid());
        System.out.println("Employee Id: "+Empid);
       // System.out.println("Employee Name: "+getName());
        System.out.println("Employee Name: "+name);
      //  System.out.println("Employee Salary: "+getSalary());
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Vehicle: "+vh.company);
        System.out.println("Employee Vehicle Number: "+vh.licenceNo);
        System.out.println("Date of Joining: ");
        doj.displayDate();
        if (vh != null)
            vh.displayVehicle();

    }
}

public class program01 {


    public static int menu(Scanner sc) {

        System.out.println("01. Register New Employee: ");
        System.out.println("02. Display New Employee: ");
        System.out.println("Enter Your Choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int choice;

        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();


        System.out.println("WelCome To Employee Registration Portal");

        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:
                    e1.acceptEmployee(sc);
                    System.out.println("Employee Details Successfully Filled :)");
                    break;
                case 2:
                     e1.displayEmployee();
                    break;

                default:
                    System.out.println("Please Enter Correct Choice :( ");
            }


        }



//        e1.acceptEmployee(sc);
//        e1.displayEmployee();


//
//
//        Vehicle v1= new Vehicle();
//        v1.acceptVehicle(sc);
//        v1.displayVehicle();
//
//
//        Date d1 = new Date();
//        d1.acceptDate(sc);
//        d1.displayDate();


            //sc.nextLine();


        }

}