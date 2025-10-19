package Shapes;
    public class Rectangle {
        public double length,breadth;


          public Rectangle(double length, double breadth) {
               this.length = length;
               this.breadth = breadth;
          }

        public double area() {
        return length*breadth;
        }
    }
