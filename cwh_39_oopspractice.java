import java.util.Scanner;
public class cwh_39_oopspractice {
public static void main(String[] args) {
class square{
Scanner sc = new Scanner(System.in);
public void calc(){
    System.out.println("Enter the side  of the square");
    int side =  sc.nextInt();
    int perimeter  = 4*side;
    System.out.println("The perimeter of the square is "+perimeter);
    int area = side*side;
    System.out.println("The area of the square is "+area);
}
}
    Scanner sc = new Scanner(System.in);
     square type1 = new square();
     type1.calc();
   }
}
