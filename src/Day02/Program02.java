package Day02;

//It is an example of method overloading
//Defining the multiple methods with same name but differnt signature(parameters/type/order)

class Arithmatic{
    void add(int n1, int n2){
        System.out.println("Addition: " +(n1 + n2));
    }
    void add(int n1, int n2, int n3){
        System.out.println("Addition: " +( n1 + n2 + n3));
    }
    void square(int n){
        System.out.println("Square: " +( n * n ));
    }
    void square(double n){
        System.out.println("Square: " + (n * n));
    }

    void division(int numerator, double denominator){
        System.out.println("Division: " +(numerator / denominator));
    }
    void division(double numerator, int denominator){
        System.out.println("Division: " +(numerator / denominator));
    }
}


public class Program02 {
    public static void main(String[] args) {
          Arithmatic a1 = new Arithmatic();

          a1.add(10,20);
          a1.add(10,20,30);
          a1.square(10);
          a1.square(2.5);
          a1.division(10,2.5);
          a1.division(10.5, 2);


    }
}
