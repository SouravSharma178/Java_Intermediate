public class cwh_38_customclass_part2 {
    public static void main(String[] args) {
class employee{
    int id;
    String name;
public void getdata(){
    System.out.println("The details of the employees are "+id+" "+name);
}
}
     System.out.println("This is our custom class ");
     employee type1 = new employee(); // defining a new object of employee type
     type1.id = 10;            // assigning values to attributes
     type1.name = "Sourav";

     // calling a class method to display the results
     type1.getdata();
    }
}
