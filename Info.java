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

public class Info{
    public static void main(String[] args) {
        Bank.Account account1 = new Bank.Account();
        account1.name = "customer";
    }
}