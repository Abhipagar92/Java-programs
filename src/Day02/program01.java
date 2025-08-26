package Day02;
import java.util.*;

class Time{

   // Fields
   int hr;
   int  min;


   //methods
    void acceptTime(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hrs: ");
        hr = sc.nextInt();

        System.out.println("Enter the min: ");
        min = sc.nextInt();

    }

    void displayTime(){

        System.out.println("Time : " + hr + " Hrs : " + min + " min ");

    }
}


public class program01 {
    public static void main(String[] args) {
         Time t1 = null ;  // reference of a class
         t1 = new Time();  //object of class
         t1.acceptTime();
         t1.displayTime();

         Time in = new  Time();
        System.out.println("Enter In Time: ");
         in.acceptTime();
         in.displayTime();

         Time out = new Time();
        System.out.println("Enter Out Time: ");
         out.acceptTime();
         out.displayTime();
    }
}
