package Day03.p1;

public class program02 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        arr[0][0]= 10;
        arr[0][1]= 20;
        arr[0][2]= 30;
        arr[1][0]= 40;
        arr[1][1]= 50;
        arr[1][2]= 60;

        System.out.println("array Using For Loop: ");
        for(int i = 0; i < arr.length ;i++){
            int[] arr2 = arr[i];
            for (int j = 0 ; j < arr2.length ; j++ ){
                int element = arr[i][j];
                System.out.println("Array Of Given Element:" +element);
            }
        }

        System.out.println("------------------------------------------");

        System.out.println("Using For Each: ");
        for (int[] arr2 :arr){
            for (int element:arr2){
                System.out.println("Array of element using for each: "+element);
            }
        }





    }
}
