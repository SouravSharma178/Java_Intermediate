// If nothing is mentioned then derived class will call the base class construtor first
// The derived class will call the constructor without argument
// if we want to call the overloaded constructors we must use the super keyword
class Base1{
    Base1(){
        System.out.println("This is the base class constructor");
    }
    Base1(int a){
      System.out.println("This is the base class constructor with value a "+a);
    }

}
class Derived1 extends Base1{
    Derived1(){
     super(10);
    }
}
public class cwh_46_constructorsininheritance {
public static void main(String[] args) {
         Derived1 type1 = new Derived1();
}
}
