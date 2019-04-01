import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String kutas = "Piszesz tekst ze zmiennej";
//        System.out.println(kutas);
//        String kutasUP = kutas.toUpperCase();
//        System.out.println(kutasUP);

        Scanner scanner = new Scanner(System.in);  // Reading from System.in
        while (true) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt(); // Scans the next token of the input as an int.
//once finished

            Calculator calculator = new Calculator();
            System.out.println("You entered " + n + ", this is your lucky number");
            System.out.println("Your number to the power of 2 equals " + calculator.calculatePower(n));
            System.out.println("Your number accumulated with itself equals " + calculator.calculateSum(n));
            System.out.println("Your number substracted with 1 equals " + calculator.calculateSubstract(n));
            System.out.println("Your number divided by itself lowered by 1 equals " + calculator.calculateDivision(n));
        }
    }
}
