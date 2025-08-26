package Day02;

import java.util.*;

class Date01{

     int day;
     int month;
     int year;

      public Date01() {
          this(1,2,2001);
      }

      public Date01(int day, int month, int year) {
          day = day;
          month = month;
          year = year;
      }

      public void acceptDate(){

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the Date: ");
          this.day = sc.nextInt();

          System.out.print("Enter the Month: ");
          this.month = sc.nextInt();

          System.out.print("Enter the Year: ");
          this.year = sc.nextInt();

      }

      public void displayDate(){
          System.out.println("Date: "+getDay() + "/"+getMonth()+ "/"+getYear());
      }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        year = year;
    }
}

public class program04 {
    public static void main(String[] args) {
        Date01 d1 = new Date01();

        d1.acceptDate();      //call acceptDate method
        d1.displayDate();    // call displayDate method


       // d1.year = 2000;
      //  System.out.println(d1.year);

      //  d1.setYear(2001);
      //  System.out.println(d1.getYear());

     //   d1.month = 5;                       //setter
      //  System.out.println(d1.month);       //getter

     //   System.out.println(d1.getYear());


    }
}
