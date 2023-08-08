
package abstractclass;
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The Dog says: wao wao");
  }
}

public class Abstractclass {

   
    public static void main(String[] args) {
    Dog mydog = new Dog(); // Create a Pig object
    mydog.animalSound();
    mydog.sleep();   
    }
    
}
