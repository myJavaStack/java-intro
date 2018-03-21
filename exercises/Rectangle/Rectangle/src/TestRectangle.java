/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT
 */
public class TestRectangle {
    
    public static void main(String[] args) {
    Rectangle myRectangle = new Rectangle(4, 40);
    System.out.println("The area of a rectangle with width " +
      myRectangle.getWidth() + " and height " +
      myRectangle.getHeight()+ " is " +
      myRectangle.getArea());
    System.out.println("The perimeter of a rectangle is " +
      myRectangle.getPerimeter());

    Rectangle yourRectangle = new Rectangle(3.5, 35.9);
    System.out.println("The area of a rectangle with width " +
      yourRectangle.getWidth() + " and height " +
      yourRectangle.getHeight() + " is " +
      yourRectangle.getArea());
    System.out.println("The perimeter of a rectangle is " +
      yourRectangle.getPerimeter());
  }

    
}
