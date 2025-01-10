import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter username");

        
        // // Numerical input
        // String nombre = input.nextLine();
        // int age = input.nextInt();
        // double salary = input.nextDouble();
        
        // // Output input by user
        // // System.out.println("Name: " + name);
        // System.out.println("Mi username es: "+nombre);
        // System.out.println("Age: " + age);
        // System.out.println("Salary: " + salary);

        // input.close();
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter name, age and salary:");

            // String input
            String name = myObj.nextLine();

            // Numerical input
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();

            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }
}
