import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;
public class Arrayys {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        try (Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Indique una marca de coche.");
            String inputStr = scanner.nextLine().toLowerCase();
            boolean condicional = cars.contains(inputStr);

            if (condicional) {
                System.out.println("si existe esa marca");
            } else {
                System.out.println("No existe esa marca");
            }
            System.out.println("Ingrese una marca a eliminar");
            String inputStr2 = scanner.nextLine();
            boolean condicional2 = cars.contains(inputStr2);
    
            if (condicional2) {
                cars.remove(inputStr2);
                System.out.println(cars);
                System.out.println("marca borrada");
            } else {
                System.out.println("No existe esa marca");
            }

            boolean empty = cars.isEmpty();
            System.out.println(empty);
            int index = cars.indexOf("Ford"); // Busca argumento en la lista y si no esta devuelve un -1
            System.out.println(index);
            int lastIndex = cars.lastIndexOf("Mazda");
            System.out.println(lastIndex);


        }

        // --------------------------------------------------------------------
            


        // -----------------------------------------------------------------------
        // for (String i : cars){
        //     System.out.println(i);
        // }
        // boolean condicion = cars.contains("Volvo");
        // if (condicion) {
        //     System.out.println("Volvo está en el arreglo.");
        // } else {
        //     System.out.println("Volvo no está en el arreglo.");
        // }

        // -----------------------------------------------------------------------------------

        
    }
    
}
