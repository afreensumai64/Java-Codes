class Family {
  void showFamilyName() {
      System.out.println("Family name: Sharma");
  }
}
 
 class Father extends Family {
   void showFather() {
     System.out.println("Father name: Ram Sharma");
   }
}

class Mother extends Family {
   void showMother() {
     System.out.println("Mother name: Radha Sharma"); 
   }
}

class Child extends Family {
   void showChild() {
     System.out.println("Child name: Raghav Sharma");
   }
}


public class FamilyTree {
   public static void main(String[] args) {
        Father f = new Father();
        Mother m = new Mother();
        Child c = new Child();
     
        f.showFamilyName(); 
        f.showFather();
   
        m.showFamilyName(); 
        m.showMother();

        c.showFamilyName(); 
        c.showChild();

        }
}


        









  