//Java Interface
interface Polygon {
  void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

  // implementation of abstract method
  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class Squar implements Polygon {
  // implementation of abstract method
  public void getArea(int l, int b) {
    System.out.println("The area of the Squar is " + (l * b));
  }
}

class Main {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
    
    Squar r2 = new Squar();
    r2.getArea(6, 6);
  }
}
