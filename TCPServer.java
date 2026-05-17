import java.io.*;
import java.net.*;

public class TCPServer {
   public static void main (String[]args) throws Exception {
      ServerSocket ss = new ServerSocket(5000);
      System.out.print("Waiting for client....");

      Socket s = ss.accept();
      System.out.print("Client connected");
    

      DataInputStream dis = new DataInputStream(s.getInputStream());
      FileOutputStream fos = new FileOutputStream("received.txt");

      int bytes;
      while ((bytes = dis.read())!= -1) {
      fos.write(bytes);
      }
       
      System.out.print("File received Succesfully");

      fos.close();
      dis.close();
      s.close();
      ss.close();
      }
}
    
    
   
    

      
