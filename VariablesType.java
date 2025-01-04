

public class VariablesType {
    public static void main(String[] args) {
        // Tipos de datos primitivos

        // Enteros
        byte byteVar = 127;              // Entero de 8 bits
        short shortVar = 32000;          // Entero de 16 bits
        int intVar = 100000;             // Entero de 32 bits
        long longVar = 100000000L;      // Entero de 64 bits

        // Números de punto flotante
        float floatVar = 3.14f;         // Número decimal de 32 bits
        double doubleVar = 3.14159;     // Número decimal de 64 bits

        // Caracteres
        char charVar = 'A';             // Un solo carácter
        char unicodeChar = '\u0041';    // Representación Unicode de 'A'

        // Booleanos
        boolean booleanVarTrue = true;  // Valor verdadero
        boolean booleanVarFalse = false; // Valor falso

        // Cadenas de texto
        String stringVar = "Hola, Java!"; // Cadena de texto

        // Imprimir todos los valores
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("char (Unicode): " + unicodeChar);
        System.out.println("boolean (true): " + booleanVarTrue);
        System.out.println("boolean (false): " + booleanVarFalse);
        System.out.println("String: " + stringVar);

        String persona = Persona.saludar("kevin");
        System.out.print(persona);
    }

}

class Persona{
    public static String saludar(String nombre){

        String saludo = "hola".concat(" ").concat(nombre);
        return saludo; 
    }
}