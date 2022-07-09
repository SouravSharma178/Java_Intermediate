// Access modifiers,getters and setters in java
class Circle{
    private float r;
    float value;
public void setArea(float i){
    this.r = i;
   value = 3.14f *r*r;
}
public double getArea(){
    return value;
}
}
public class cwh_40_getters_setters_accessmodifiers {
    public static void main(String[] args) {
     Circle type1 = new Circle();
     type1.setArea(5);
     System.out.println("The area of circle is "+type1.getArea());
}
}
