import java.util.Scanner;
class StudentDetails {
    String name;
    int age, id;
    String department;

       void setDetails(String n, int a,int i, String d) {
       name = n;
       department = d;
       id = i;
       age = a;
       } 
        
       void display() {
       System.out.println("\n----Student Details-----");
       System.out.println("Student Name:" +name);
       System.out.println("Student Age:" +age);
       System.out.println("Student id:" +id);
       System.out.println("Student department:" +department);

       }
}

public class StudentDetailsMain {
   public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name:");
        String name = sc.nextLine();
 
        System.out.print("Student Age:");
        int age = sc.nextInt();

        System.out.print("Student Id:");
        int id = sc.nextInt();

        System.out.print("Student departemnt");
        String department= sc.nextLine();

         
        StudentDetails obj = new StudentDetails();
        obj.setDetails(name,age,id,department);
        obj.display();
        }
}
     




