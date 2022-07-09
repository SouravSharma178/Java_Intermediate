class Base2{
    Base2(){
        System.out.println("I am a constructor");
    }
    Base2(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived2 extends Base2{
    Derived2(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived2(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived2{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class cwh_46_constructor_super {
    public static void main(String[] args) {
        // Base2 b = new Base2();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
