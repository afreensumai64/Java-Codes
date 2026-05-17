import java.util.*;

public class slidingwindow {
  public static void main (String [] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter total number of frames:");
     int totalframes = sc.nextInt();

     System.out.println("Enter window size:");
     int windowsize = sc.nextInt();
  

     int sent = 0;
        
     while (sent < totalframes) {
         System.out.println("Sending frames");
           for(int i = 0; i < windowsize && sent < totalframes;i++) {
              System.out.println("Frames" + (sent+i) + "sent" );
           }
         System.out.println("Enter frames acknowledged:");
         int ack = sc.nextInt();

         if(ack <= 0) {
           System.out.println("No acknowlegdemt received. resending frames");
         } else {
           System.out.println(ack + " frames acknowledged");

           sent+=ack;
           }
         }

       System.out.println("All frames are transmitted successfully.");
       sc.close();
   }
}
      
     
       
         
         