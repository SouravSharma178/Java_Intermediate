// start command is used to call the thread
// This example is based on extending a thread class
import java.util.Scanner;
class mythread extends Thread{
    public int i = 0;
    public int counter = 0;
    public void run(){
        while(true){
        if(i==100){
            System.out.println("The counter value for thread 2 is "+counter);
            break;
        }
        System.out.println("Thread 1 is running");
        i++;
        counter++;
    }
    }
    public void running(){
        System.out.println("running thread 1");
    }
}
class mythread2 extends Thread{
    public int i = 0;
    public int counter = 0;
    public void run(){
        while(true){
        if(i==100){
            System.out.println("The counter value for thread 2 is "+counter);
            break;
        }
        System.out.println("Thread 2 is running");
        i++;
        counter++;
    }
    }
    public void running(){
        System.out.println("running thread 2");
    }
}
public class cwh_70_threads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mythread type1 = new mythread();
        mythread2 type2 = new mythread2();
        type1.start();
        type2.start();


    }
}
