public class StringLearning {
    
    public static void main(String[] args) {
        // Lenght
        String lenghtString = "Buen dia";
        System.out.println("The length of the txt string is: " + lenghtString.length());
        System.out.println("La longuitud de mi string es: " + lenghtString.length());
        
        // Upper and lower case
        String cadenaStr = "Hello World";
        System.out.println(cadenaStr.toUpperCase());
        System.out.println(cadenaStr.toLowerCase());

        // find palabra en un str ( tomo la posicion de la primera letra)
        String txt = "Aguante boca amigazoo";
        System.out.println(txt.indexOf("boca")); // Outputs 7

        String functStr = ConcatenationStrings.concatStrAndInt();
        System.out.println(functStr);   
    }
}


class ConcatenationStrings{
    public static String concaTwoStr(){
        String firstName = "John";
        String lastName = "Doe";
        return firstName + " " + lastName;
    }
    public static String concaTwoStrWithFunction(){
        String firstName = "John";
        String lastName = "Doe";
        return firstName.concat(lastName);
    }

    public static String concatStrAndInt(){
        String x = "10";
        int y = 20;
        return x + y;  // z will be 1020 (a String)
    }
}