import java.util.Scanner;
class Employee {
    String name;
    int age,salary;

         void setDetails( String n,int a,int s){
         name =n;
         age = a;
         salary = s;
         }
         
         void display() {
         System.out.println("\n-----Employee Details----");
         System.out.println("Name:" + name);
         System.out.println("Age:" + age);
         System.out.println("Salary:" + salary);
         }
}
         
 public class EmployeeMain {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name:");
        String name = sc.nextLine();
        
        System.out.print("Enter employee age:");
        int age = sc.nextInt();

        System.out.print("Enter employee salary:");
        int salary = sc.nextInt();

        Employee emp = new Employee();
        emp.setDetails(name,age,salary);
        emp.display();
        }
}


        
        

   
 