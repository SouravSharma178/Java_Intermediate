// Conversion of km to miles
import java.util.Scanner;
public class Question2 {
   public static void main(String[] args) {
       float km,miles;
       miles = 0.621371f;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the km value :");
       km = sc.nextInt();
       System.out.println("This is the conversion into miles");
       System.out.println(miles*km);
   }
}
