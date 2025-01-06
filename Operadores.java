public class Operadores {
    public static void main(String[] args) {
        
        int resultSuma = OperationArimeth.suma();
        int resultResta = OperationArimeth.resta();
        int resultMultipli = OperationArimeth.multiplication();
        float resultDivision = OperationArimeth.division();
        float resultResto = OperationArimeth.resto();
        int resultIncrement = OperationArimeth.increment();
        int resultDecrement = OperationArimeth.decrement();

        System.out.println("Resultado de la suma: " + resultSuma);
        System.out.println("Resultado de la resta: " + resultResta);
        System.out.println("Resultado de la multiplicación: " + resultMultipli);
        System.out.println("Resultado de la división: " + resultDivision);
        System.out.println("Resultado del resto (módulo): " + resultResto);
        System.out.println("Resultado del incremento: " + resultIncrement);
        System.out.println("Resultado del decremento: " + resultDecrement);


        // Operation Assignment

        System.out.println("Asignación: " + OperationAssignment.asignarValor(5));
        System.out.println("Suma: " + OperationAssignment.sumarYAsignar(5, 3));
        System.out.println("Resta: " + OperationAssignment.restarYAsignar(5, 3));
        System.out.println("Multiplicación: " + OperationAssignment.multiplicarYAsignar(5, 3));
        System.out.println("División: " + OperationAssignment.dividirYAsignar(5, 3));
        System.out.println("Módulo: " + OperationAssignment.moduloYAsignar(5, 3));
        System.out.println("AND: " + OperationAssignment.andYAsignar(5, 3));
        System.out.println("OR: " + OperationAssignment.orYAsignar(5, 3));
        System.out.println("XOR: " + OperationAssignment.xorYAsignar(5, 3));
        System.out.println("Desplazar a la derecha: " + OperationAssignment.desplazarDerechaYAsignar(8, 2));
        System.out.println("Desplazar a la izquierda: " + OperationAssignment.desplazarIzquierdaYAsignar(8, 2));

        // Operation Comparation

        System.out.println("Igual: " + OperationComparation.esIgual(5, 5));
        System.out.println("Diferente: " + OperationComparation.esDiferente(5, 3));
        System.out.println("Mayor que: " + OperationComparation.esMayorQue(5, 3));
        System.out.println("Menor que: " + OperationComparation.esMenorQue(5, 3));
        System.out.println("Mayor o igual que: " + OperationComparation.esMayorOIgualQue(5, 3));
        System.out.println("Menor o igual que: " + OperationComparation.esMenorOIgualQue(5, 5));

        // Operation Logical

        System.out.println("AND lógico: " + OperationLogical.andLogico(3)); // true
        System.out.println("OR lógico: " + OperationLogical.orLogico(6));  // false
        System.out.println("NOT lógico: " + OperationLogical.notLogico(7)); // true

    }    
}

class OperationArimeth{

    public static int suma(){
        final int numberOne = 2;
        final int numberTwo = 3;
        return numberOne + numberTwo;
    }

    public static int resta(){
        final int numberOne = 2;
        final int numberTwo = 3;
        return numberOne - numberTwo;
    }
    public static int multiplication(){
        final int numberOne = 2;
        final int numberTwo = 3;
        return numberOne * numberTwo;
    }
    public static float division(){
        final int numberOne = 2;
        final int numberTwo = 3;
        return numberOne / numberTwo;
    }
    public static float resto(){
        final int numberOne = 2;
        final int numberTwo = 3;
        return numberOne % numberTwo;
    }
    public static int increment(){
        int numberOne = 2;
        // final int numberTwo = 3;
        return ++numberOne;
    }    
    public static int decrement(){
        int numberOne = 2;
        // final int numberTwo = 3;
        return ++numberOne;
    }    
}

class OperationAssignment{
    public static int asignarValor(int x) {
        x = 5;
        return x;
    }

    public static int sumarYAsignar(int x, int y) {
        x += y; // x = x + y
        return x;
    }

    public static int restarYAsignar(int x, int y) {
        x -= y; // x = x - y
        return x;
    }

    public static int multiplicarYAsignar(int x, int y) {
        x *= y; // x = x * y
        return x;
    }

    public static int dividirYAsignar(int x, int y) {
        x /= y; // x = x / y
        return x;
    }

    public static int moduloYAsignar(int x, int y) {
        x %= y; // x = x % y
        return x;
    }

    public static int andYAsignar(int x, int y) {
        x &= y; // x = x & y
        return x;
    }

    public static int orYAsignar(int x, int y) {
        x |= y; // x = x | y
        return x;
    }

    public static int xorYAsignar(int x, int y) {
        x ^= y; // x = x ^ y
        return x;
    }

    public static int desplazarDerechaYAsignar(int x, int y) {
        x >>= y; // x = x >> y
        return x;
    }

    public static int desplazarIzquierdaYAsignar(int x, int y) {
        x <<= y; // x = x << y
        return x;
    }
}

class OperationComparation{
    public static boolean esIgual(int x, int y) {
        return x == y; // x == y
    }

    public static boolean esDiferente(int x, int y) {
        return x != y; // x != y
    }

    public static boolean esMayorQue(int x, int y) {
        return x > y; // x > y
    }

    public static boolean esMenorQue(int x, int y) {
        return x < y; // x < y
    }

    public static boolean esMayorOIgualQue(int x, int y) {
        return x >= y; // x >= y
    }

    public static boolean esMenorOIgualQue(int x, int y) {
        return x <= y; // x <= y
    }
}

class OperationLogical{
    public static boolean andLogico(int x) {
        return x < 5 && x < 10; // Devuelve true si ambas condiciones son verdaderas
    }

    public static boolean orLogico(int x) {
        return x < 5 || x < 4; // Devuelve true si al menos una condición es verdadera
    }

    public static boolean notLogico(int x) {
        return !(x < 5 && x < 10); // Invierte el resultado de la condición
    }
}
