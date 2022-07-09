class Base{
    int x;
public void setx(int x){
   this.x = x;
}
public int getx(){
    return x;
}
}
// in java extends keyword is used for inheritance
class Derived extends Base{
    int y;
public void sety(int y){
    this.y = y;
     }
public int gety(){
    return y;
     }
}
public class cwh_45_inheritance {
public static void main(String[] args){
    Derived type1  = new Derived();
    type1.setx(5);
    System.out.println("The value of x is "+type1.getx());
}
}
