// Abstract classes and methods in java
import java.util.Scanner;
abstract class Shape{
    Shape(){
        System.out.println("This is the base class called Shape");
    }
    abstract void structure();
}
class Shapetwo extends Shape{
     void structure(){
         System.out.println("Enter the values for length and breadth");
         Scanner sc = new Scanner(System.in);
         int l  = sc.nextInt();
         int b  = sc.nextInt();
         int area = l*b;
         System.out.println("The area of rectangle "+area);
     }
}
public class cwh_53_abstract_class_methods {
    public static void main(String[] args) {
      Shapetwo type1 = new Shapetwo();
      type1.structure();
    }
}

/*
1. In Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.
abstract class Base {
    abstract void fun();
}
class Derived extends Base {
    void fun() { System.out.println("Derived fun() called"); }
}
class Main {
    public static void main(String args[]) {

        // Uncommenting the following line will cause compiler error as the
        // line tries to create an instance of abstract class.
        // Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
Output
Derived fun() called



2. An abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of a inherited class is created. For example –

// An abstract class with constructor
abstract class Base {
    Base() { System.out.println("Base Constructor Called"); }
    abstract void fun();
}
class Derived extends Base {
    Derived() { System.out.println("Derived Constructor Called"); }
    void fun() { System.out.println("Derived fun() called"); }
}
class Main {
    public static void main(String args[]) {
       Derived d = new Derived();
    }
}

Output
Base Constructor Called
Derived Constructor Called


3. In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.

// An abstract class without any abstract method
abstract class Base {
    void fun() { System.out.println("Base fun() called"); }
}

class Derived extends Base { }

class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}

Output
Base fun() called

4. Abstract classes can also have final methods (methods that cannot be overridden). For example, the following program compiles and runs fine.

// An abstract class with a final method
abstract class Base {
    final void fun() { System.out.println("Derived fun() called"); }
}

class Derived extends Base {}

class Main {
    public static void main(String args[]) {
       Base b = new Derived();
       b.fun();
    }
}

Output
Derived fun() called


*/
