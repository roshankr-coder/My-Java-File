

class Shape{
    public void area(){
      System.out.println("Display arae");
    }
}

class Triangle extends Shape{
     public void area(int l, int h){
        System.err.println(0.5*l*h);
     }
}

class Circle extends Shape{
    public void area(int r){
       System.err.println(3.14*r*r);
    }
}

public class Inheritance{
    public static void main(String[] args) {
       Triangle t1 = new Triangle();
       Circle t2 = new Circle();
          t1.area();
          t1.area(4,6);
          t2.area(7);
          
    }
}