package Day04;

import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.acceptEmployee(sc);
        e1.displayEmployee();
    }
}
