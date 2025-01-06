// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

// To declare an array, define the variable type with square brackets:
public class Arrais {

    // static means that the method belongs to the Arrais class and not an object of the Arrais class.
    
    public static void main(String[] args) {
        String[] listaDeStrings = {"hola", "BOKA"};
        for (String i: listaDeStrings){
            System.out.println(i);
        }

        double[] listaDeNumero = {1,2,3,4,5};
        for (double i: listaDeNumero){
            System.out.println(i);
        }
    }
}

