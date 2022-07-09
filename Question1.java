class A{
  A(){
        System.out.println("A constructor");
    }
  }
  class B extends A{
    B(){
        System.out.println("B constructor");
    }
  }
  public class Main
  {
      public static void main (String arg [])
      {
          B type1 = new B();

      }
  }
