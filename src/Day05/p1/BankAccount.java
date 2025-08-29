package Day05.p1;

public class BankAccount {

    private static int generateAccNo = 1000;
    private final int accoNo;
    private String name;
    private Double balance;


    {
        generateAccNo++;
        accoNo = generateAccNo;
    }

    public BankAccount(){

    }

    public BankAccount ( String name , double balance){
         this.name = name;
         this.balance = balance;
    }

    public void DisplayAccountDetails(){
        System.out.println("Accno: " + accoNo);
        System.out.println("Name: " +name);
        System.out.println("Balance: "+balance);
    }

}
