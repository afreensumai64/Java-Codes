import java.util.Scanner;
public class talk {
   public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome to talk command");
        System.out.println("type 'exit' to quit");
       
        while(true) {
        System.out.print("You:");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("exit"))
        {
        
        System.out.print("Exiting talk command");
        break;
        }
        System.out.print("Talk command: hello you said:" + input);
       
        }
      
        sc.close();
        
   }
}


        




        
      
        

