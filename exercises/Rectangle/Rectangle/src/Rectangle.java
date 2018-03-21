class Rectangle {
  // Data members
  private double width;
  private double height;
  
  // Constructor
  public Rectangle() {
      width = 1;
      height = 1;
  }

  // Constructor
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  } 
  
  // or if you don't like to use the "this" keyword
  /*public Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
*/
  
  // set methods
  public void setWidth(double width){
      this.width = width;
  }
  
  public void setHeight(double height){
      this.height = height;
  }
  
  // get methods
  public double getWidth(){
      return width;
  }
  
  public double getHeight(){
      return width;
  }
  
  
  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }
}
