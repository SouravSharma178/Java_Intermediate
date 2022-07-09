// Constructors in java
class employee{
    int salary;
// A constructor does not return anything.
public employee(int salary){
    this.salary = salary;
    System.out.println("The salary is "+salary);
}
}
public class cwh_42_constructors {
  public static void main(String[] args) {
     employee type1  = new employee(10000);
  }
}

