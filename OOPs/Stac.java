class Student{
   String name;
   static String school;   //static = Common
}

public class Stac{
   public static void main(String[] args){
      Student.school = "Haridwar University";
      
      Student student1 = new Student();
      Student student2 = new Student();
      student1.name = "Roshan";
      student2.name = "Rohan kumar";
      System.err.println(student1.school);
      System.err.println(student1.name);
      System.err.println(student2.school);
      System.err.println(student2.name);

   }
}