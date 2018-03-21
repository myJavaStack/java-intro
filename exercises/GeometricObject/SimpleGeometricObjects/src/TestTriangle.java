
import java.util.Scanner;


public class TestTriangle {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    
    Triangle triangle = new Triangle(side1, side2, side3);
    
    System.out.print("Enter the color: ");
    String color = input.next();
    triangle.setColor(color);
    
    System.out.print("Enter a boolean value for filled: ");
    boolean filled = input.nextBoolean();
    triangle.setFilled(filled);

    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is "
      + triangle.getPerimeter());
    System.out.println(triangle.toString());
  }
 
}
