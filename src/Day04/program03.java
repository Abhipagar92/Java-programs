package Day04;

class date{
    private int day = 1;
    private int month = 2;
    private int year = 2001;

   public String displayDate(){
        return day+ "/" +month+ "/" +year;
    }

}
public class program03 {
    public static void main(String[] args) {

        date d1 = new date();
        System.out.println("d1: "+d1.displayDate());

        date d2 = new date();
        System.out.println("d1: "+d2.displayDate());

    }
}
