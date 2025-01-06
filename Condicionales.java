public class Condicionales {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.1;

        // condicional comun
        if (x < y){
            System.out.println("Es verdadero");
        }
        x = 9;

        // condicional if-else
        if (x < y){
            System.out.println("Es verdadero");
        } else {
            System.out.println("es falso");
        }

        x = 10;
        y = 10;

        // condicional if-else if- else
        if (x == y) {
            System.out.println("Son iguales");
        } else if (x > y) {
            System.out.println("Es True");
        } else {
            System.out.println("es false");
        }

        // condicionales con operadores ternarios

        // variable = (condition) ? expressionTrue :  expressionFalse;

        x = 5;

        String xMenorQueCinco = x < 5 ? "es verdadero (con operadores ternario)" : "es falso (con operadores ternario)";

        System.out.println(xMenorQueCinco);

    }
}
