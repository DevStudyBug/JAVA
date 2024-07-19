//Java Abstract Class and Abstract Methods
abstract class Animal {
  abstract void makeSound();
  }
class Dog extends Animal {


  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark");
  }
}
class cat extends Animal {

  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("meow meow");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Dog class
    Dog d1 = new Dog();
    d1.makeSound();
    cat c1 = new cat ();
    c1.makeSound();
  }
}
