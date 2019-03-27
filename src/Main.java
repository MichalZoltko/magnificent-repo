import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String kutas = "Piszesz tekst ze zmiennej";
//        System.out.println(kutas);
//        String kutasUP = kutas.toUpperCase();
//        System.out.println(kutasUP);

        Scanner chuj = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = chuj.nextInt(); // Scans the next token of the input as an int.
//once finished
        chuj.close();
        System.out.println("You entered " + n + " you shithead, to poęga");
        System.out.println("A ta liczba do potęgi drugiej to " + Calkulejtor.calculatePower(n) + " ty cioto");
    }
}
