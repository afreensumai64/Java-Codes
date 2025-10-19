import Shapes.Circle; 
import Shapes.Triangle;
import Shapes.Rectangle;
 
public class ShapesMain {
 public static void main(String[] args) {
   Circle circle = new Circle(5);
   Triangle triangle = new Triangle(3,4);
   Rectangle rectangle = new Rectangle(8,2);
   

   System.out.println("Area of Circle is:" + circle.area());
   System.out.println("Area of Triangle is:" + triangle.area());
   System.out.println("Area of Rectangle is:" + rectangle.area());
   }
}
