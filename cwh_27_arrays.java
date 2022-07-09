import java.util.Scanner;
public class cwh_27_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaration of array is done as follows
        int [] arr = new int[5];

        // Java does not have a size of operator
        // so to find the length of an array we use length function

        System.out.println(arr.length);
        for(int i=0;i<5;i++){
            System.out.println("enter the element of the array");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
