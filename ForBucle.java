

public class ForBucle {
    public static void main(String[] args) {
        // int i = 0;
        // i de la funcion main es diferente al i del for
        // for (ejecutable una ves, condicion en la que se va a correr mientras sea true, codigo que sera ejecutado por cada iteracion)
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }
// ------------------------------------------------------------
        // for Anidados

                // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
// --------------------------------------------------------------------
// There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):

// for (type variableName : arrayName) {
    // code block to be executed
//   }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(Arrays.toString(cars)); solo para mostrar en terminal
        for (String i : cars){                  // esto es un forEach
            System.out.println(i);
        }

        

// --------------------------------------------------------------------

        int contador = 0;

        // while (condicion cuando sea true)
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        // Este blocke se ejecuta antes de checkear que la condion sea true
        do { 
            System.out.println("Se ejecuta al menos una vez o mejor dicho antes de que el while checkee que la condicion se a true");
        } while (false);


    }
}
