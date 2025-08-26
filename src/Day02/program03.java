package Day02;

import java.util.Scanner;

class date {
    private int day;
    private int month;
    private int year;

    public date() {
        this(1, 1, 2001);
    }

    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void acceptDate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Day: ");
        this.day = sc.nextInt();
        System.out.print("Enter the Month: ");
        this.month = sc.nextInt();
        System.out.print("Enter the Year: ");
        this.year = sc.nextInt();
    }

    void displayDate() {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }

}


    public class program03 {
        public static void main(String[] args) {

            date d1 = new date();
            d1.displayDate();

            date d2 = new date(2, 2, 2001);
            d2.displayDate();

            date d3 = new date();
            d3.acceptDate();
            d3.displayDate();


        }
    }
