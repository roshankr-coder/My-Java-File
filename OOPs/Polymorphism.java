class Student{
    String name;
    int age;

    public void printInfo(String namr){
      System.err.println(name);
    }
    public void printInfo(int age){
      System.err.println(age);
    }
    public void printInfo(String name, int age){
      System.err.println(name+ " "+ age);
    }

}

public class Polymorphism{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Roshan";
        s1.age = 21;
       

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
    }
}