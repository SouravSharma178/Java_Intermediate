import java.util.Scanner;
class employee{
    int id;
    String name;
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
     System.out.println("This is our custom class ");
     employee type1 = new employee(); // defining a new object of employee type
     type1.id = 10;            // assigning values to attributes
     type1.name = "Sourav";
     System.out.println("The details of the employees are "+type1.id+" "+type1.name);
    }
}
