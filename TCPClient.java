import java.io.*;
import java.net.*;

public class TCPClient {
   public static void main (String[]args) throws Exception {
      Socket s = new Socket("localhost", 5000);
  
      FileInputStream fis = new FileInputStream("send.txt");
      DataOutputStream dos = new DataOutputStream(s.getOutputStream());

      int bytes;
      while ((bytes = fis.read())!= -1) {
      dos.write(bytes);
      }
       
      System.out.print("File sent Succesfully");

      fis.close();
      dos.close();
      s.close();
      
      }
}
    