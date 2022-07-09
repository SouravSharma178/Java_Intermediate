// Program to check if a number entered by a user is integer or not
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    boolean check = sc.hasNextInt();
    System.out.println(check);
    }
}
