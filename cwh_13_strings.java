import java.util.Scanner;
public class cwh_13_strings {
   public static void main(String[] args) {
    // 1.This is the way to input to a string
    String st = new String("Sourav");
    System.out.println(st);
    // 2.Another way is to input it directly
    String name = "Sharma";
    System.out.println(name);
    // String as input
    System.out.println("Enter the string");
    Scanner sc = new Scanner(System.in);
    String midname = sc.nextLine();
    System.out.println("The complete name is "+st+" "+midname+" "+name);
    float num = 3.65f;
    // here 5.2f means 5 spaces inlcuding the number and upto 2 decimals
    System.out.printf("This is also one of format specifiers 5.2f",num);

   }
}
