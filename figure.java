import java.util.*;
abstract class shape{
    private int dim1;
    private int dim2;
public void setdim1(int dim1){
     this.dim1 = dim1;
}
public void setdim2(int dim2){
     this.dim2 = dim2;
}
int getdim1(){
    return dim1;
}
int getdim2(){
    return dim2;
}
}
class rectangle extends shape{
    private double area;
    rectangle(int dim1,int dim2){
        setdim1(dim1);
        setdim2(dim2);
    }
public int calc(){
    return (getdim1())*(getdim2());
}
}
class square extends shape{
    square(int dim1){
        setdim1(dim1);
    }
int calc(){
    return (getdim1())*(getdim1());
}
}
public class figure {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the choice 1.Rectangle 2.Circle");
       int option = sc.nextInt();
       switch(option){
           case 1:
           int l,b;
           System.out.println("Enter the length and breadth of the rectangle ");
           l = sc.nextInt();
           b = sc.nextInt();
           rectangle type1 = new rectangle(l,b);
           System.out.println("The area of the rectangle is "+type1.calc());
            break;
            case 2:
            System.out.println("Enter the side of the square ");
            int side = sc.nextInt();
            square type2 = new square(side);
           System.out.println("The area of the square is "+type2.calc());
            break;
           default:
           System.out.println("The choice is invalid please run again");
       }
    }
}
