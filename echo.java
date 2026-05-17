import java.util.Scanner;
public class echo {
   public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the data:");

        int data =  sc.nextInt();
        System.out.println("You entered:" + data);

        sc.close();
        
        }
   
        

   }


