// Varargs(variable arguments)- they help us to pass n number of arguments to our functions
import java.util.Scanner;
public class cwh_33_varargs {
    // This is the syntax of varargs
    // to make one argument compulsory-
    // static int add(int x ,int ...arr)
    // This is the syntax(int ...arr)
    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
}
public static void main(String[] args) {
    System.out.println(add(1,2));
    System.out.println(add(2,3,4));
    System.out.println(add(4,5,6));
}
}
