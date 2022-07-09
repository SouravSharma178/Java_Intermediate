// Some important points in java
// 1.Array as an argument are passed as reference variables to functions which means that the value changed within the function of the array affects the actual values of the array.Same is the case with objects
// Method overloading cannot be done if we just change the return type from void to int or vice-versa without changing the parameters
import java.util.Scanner;
public class cwh_32_methods_overloading {
    static int change(int []arr){
      // This will affect the value of the array
      arr[0] = 1;
      return arr[0];
    }
    // Method overloading
    static int fun(int x){
        return x;
    }
    static int fun(int x,int y){
        int sum = x+y;
        return sum;
    }
public static void main(String[] args) {
       int []arr = {2,4,6,8,10};
       change(arr);
       System.out.println("The changed value of array index 0 is "+arr[0]);
       int c = fun(10);
       int d = fun(20,30);
}
}
