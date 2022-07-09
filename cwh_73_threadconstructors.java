// Thread class has a built in constructor that takes name as an input so we will use the super keyword to give our thread a name
//These are referred to as thread constructors
class Mythread extends Thread{
    public Mythread(String name){
        super(name);
        System.out.println("This is the thread");
    }
}
public class cwh_73_threadconstructors {
    public static void main(String[] args) {
          Mythread type1 = new Mythread("Sourav");
          type1.start();
          System.out.println("The name of the thread is "+type1.getName());
          System.out.println("The id of the thread is "+type1.getId());
    }
}
