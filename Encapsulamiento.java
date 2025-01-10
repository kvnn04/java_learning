public class Encapsulamiento {
    private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }

  public static void main(String[] args) {
      Encapsulamiento miObject = new Encapsulamiento();
      miObject.setName("kevin");
      System.out.println(miObject.getName());
  }
}
