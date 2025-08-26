package Day04;

public class program02 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];

        arr[0] = new Employee(1,"Abhi",100000);
        arr[1] = new Employee(2,"Lakhan",200000);
        arr[2] = new Employee(3,"Rohan",300000);
        arr[3] = new Employee(4,"Aditya",400000);
        arr[4] = new Employee(5,"Kunal",500000);

        System.out.println("using for Loop: ");
        for (int i = 0; i < arr.length; i++){
            Employee e = arr[i];
            e.displayEmployee();
        }

        System.out.println("Using For Each: ");
        for (Employee e:arr){
            e.displayEmployee();
        }
    }
}
