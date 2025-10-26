

class Pen{
   String color;
   String type;

   public void write(){
     System.err.println("Writing Somethimg.");

   }

   public void printColor(){
    System.err.println(this.color);
   }
   //without Construntor
}

class Student{
    String name;
    int age;
    public void printInfo(){
       System.err.println(this.name);
       System.err.println(this.age);

    }
    //with Constructor, by Defole in java
    // Student(){           //without Parameter
    //   System.err.println("Constructor called");
    // }

    Student(String name, int age){   //with Parameter
        this.name = name;
        this.age = age;

    }
}
public class OOPS{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";


        pen1.printColor();
        pen2.printColor();
        pen1.write();
        pen2.write();

        Student s1 = new Student("Roshan", 21);
        // s1.name = "Roshan";
        // s1.age = 22;
        
        s1.printInfo();
    } 
}