// Differences b/w abstract classes and interfaces
/*
1.Two abstract class cannot be inherited at the same time by a child class while with interfaces it is possible
2.It is compulsory to declare all the methods defined in an interface while abstract classes have no such restriction(but if method is declared abstract in an abstract class then it becomes complusory to define it)
* Property 2 only applies for methods that are not declared as abstract
3.The methods of interfaces must be defined public
4.for abstarct we use extends keyword but for interfaces we use implements keyword
5.All the variables in an interface are final and cannot be modified
6.Objects of interfaces can also be created
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
*/
abstract class One{
abstract void hi();
void hello(){
    System.out.println("This is the method one");
}
}
interface Two{
    public void hey();
    public void helloo();
   
}
class Three extends One implements Two{
      public void hi(){
          System.out.println("This is hi of abstract class");
      }
      public void hey(){
           System.out.println("This is the method hey of interface and it is compulsory");
       }
       public void helloo(){
        System.out.println("This is the method helloo of interface and it is compulsory");
    }

}
public class cwh_54_interfaces {
    public static void main(String[] args) {
         Three type1 = new Three();
         type1.hey();
         type1.helloo();
         type1.hi();

    }
}
