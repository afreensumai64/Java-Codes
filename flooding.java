import java.util.*;

public class flooding {
    static void flood(int g [][],boolean visited [], int node , int n) {
         visited[node]=true;
         System.out.println("packet reached node" + node);
          
         for(int i=0; i< n; i++) {
             for(int j=0; j< n; j++) {
                flood(g,visited,i,n);
             }
         }
            
    }
     
      public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter number of nodes:") ;
        int n = sc.nextInt();
     
        int g [][] = new int[n][n];
        boolean visited[] = new boolean[n];
      
        System.out.println("enter adjacency matris");
        for(int i=0; i< n; i++) 
             for(int j=0; j< n; j++) 
                g[i][j] = sc.nextInt();

             
        System.out.println("enter source node:");
        int src = sc.nextInt();
     
        
        System.out.println("\n flooding started");
        flood(g,visited,src,n);
   
      }
}
  
    