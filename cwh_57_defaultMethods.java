// default and private  methods inside an interface in java
// default method is used when we want to define the function within the interface
// Default method can be overrided
// Private method is used to simplify a default method or if the default method becomes too complex
import java.util.Scanner;
class Cellphone{
    Cellphone(){
        System.out.println("This phone is able to pick and receive calls");
    }
}
interface Wifi{
     void network();
    default void networkprovider(){
       System.out.println("The provider is airtel");
    }
}
interface Gps{
     private void mapsreduce(){
         System.out.println("This is the maps reduce");
     }
     default void maps(){

       System.out.println("This is google maps");
    }

}
class Smartphone extends Cellphone implements Wifi,Gps{
      // This method should be compulsarily declared public
      public void network(){
          System.out.println("The network is coming");
      }
       void networkprovider(){
        System.out.println("The provider is airtel and it is better than jio");
     }
      void mapsreduce(){
        System.out.println("This is the maps reduce");
    }
}
public class cwh_57_defaultMethods {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Smartphone type1 = new Smartphone();
       type1.network();
       type1.maps();
       type1.mapsreduce();
   }
}
