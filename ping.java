import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ping {
  public static void main (String[]args) {
   String host = "google.com";
    try {
     String os = System.getProperty("os.name").toLowerCase();
     String command;

     if(os.contains("win")) {
        command = "ping -n 4 " +host;
     } else {
        command = "ping -c 4 " +host;
     }
     Process process =  Runtime.getRuntime().exec(command);
     BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
     String line;
     while ((line = reader.readLine())!=null)  {
        System.out.println(line);
     }
     process.waitFor(); 
    } catch(Exception e) {
        e.printStackTrace();
     }
  }
}

     
