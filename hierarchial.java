import java.util.*;
class hierarchial {
 public static void main (String [] args) {

    Scanner sc = new Scanner(System.in);
    
    int regions;
    System.out.println("Enter number of regions:");
    regions = sc.nextInt();
     
    System.out.println("\n Hirachial routing");
    
    for(int i =0; i<=regions;i++){
        System.out.println("Enter number of nodes in regions:" + i + ":");
        int nodes = sc.nextInt();
        int cost[][] = new int [nodes] [nodes];
    
        System.out.println("Enter cost matrix for region" + i + ":");
        for(int j=0; j< nodes;j++) {
           for(int k=0; k< nodes;k++) {
              cost[j][k]= sc.nextInt();
           }
        }

     
        System.out.println("Region" + i + "Routing table");
           for(int j=0; j< nodes;j++) {
              for(int k=0; k< nodes;k++) {
                 if(j!=k) { 
                   System.out.println("Node" + (j+1) + "-> Node" + (k+1) + "Cost" + cost[j][k]);
                 }
              }
        }
            
    }
    
       System.out.println("Routing between regions is done by higher level routers");


 }
}  

