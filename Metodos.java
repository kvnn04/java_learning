public class Metodos {
    // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Metodos myObj = new Metodos(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

class Main {
    int modelYear;
    String modelName;
  
    public Main(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Main myCar = new Main(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

