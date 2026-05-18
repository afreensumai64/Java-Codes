import java.util.Scanner;

public class hamming {
   public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter 4 bit data:");
        String d = sc.next();

        int d1 = d.charAt(0) - '0';
        int d2 = d.charAt(1) - '0';
        int d3 = d.charAt(2) - '0';
        int d4 = d.charAt(3) - '0';

        int p1 = d1 ^ d2 ^ d4;
        int p2 = d1 ^ d3 ^ d4;
        int p4 = d2 ^ d3 ^ d4;

        String code = " " + p1 + p2 + d1 + p4 + d2 + d3 + d4;
        System.out.println("Generated hamming code" + code);
    
        System.out.println("Enter error position:");
        int pos = sc.nextInt();
      
        char[] a = code.toCharArray();
   
        a[pos-1] = (a[pos-1] == '0') ? '1' : '0' ;
       
        String received = new String(a);
        System.out.println("Receieved code:" + received);

        int c1 = (a[0] - '0') ^ (a[2] - '0') ^ (a[4] -'0') ^ (a[6] -'0');
        int c2 = (a[1] - '0') ^ (a[2] - '0') ^ (a[5] - '0') ^ (a[6] - '0');
        int c4 = (a[3] - '0') ^ (a[4] - '0') ^ (a[5] - '0') ^ (a[6] - '0');
        
        int error = c1 + c2 * 2 + c4 * 4;
       
        System.out.println("Error at position:" + error);
    
        sc.close();
      
     }
}

 
         
         
         
         
         
         
         
         

