class Box {
    private double width;
    private double height;
    private double depth;
  
    // parameterized constructor
    public Box(double width, double height, double depth) {
      this.width = width;
      this.height = height;
      this.depth = depth;
    }
  
    // method to return the volume of the box
    public double getVolume() {
      return width * height * depth;
    }
}

public class Assignment1 {
    public static void main(String[] args) {

      Box box = new Box(5.0, 4.0, 3.0);
  
      double volume = box.getVolume();
  
      System.out.println("Volume of the box: " + volume);
    }
  }