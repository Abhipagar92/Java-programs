package Day05.p1;

public class program01 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Abhi", 10000);
        BankAccount a3 = new BankAccount("Lakhan" , 1500000);

        a1.DisplayAccountDetails();
        System.out.println("-------------------------------");

        a2.DisplayAccountDetails();
        System.out.println("-------------------------------");

        a3.DisplayAccountDetails();


    }
}
