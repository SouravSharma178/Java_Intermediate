import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");

//1.Scanner class is imported to take a user input in java
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a +b;
//        float sum = a +b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);

//2. hasNextInt() is used to verify a condition
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//3. if only next is used then only the first word of the string is taken
       String str = sc.next();
//4. String str = sc.nextLine();
        // if nextline is used that entire string is taken as input
        System.out.println(str);
    }
}
