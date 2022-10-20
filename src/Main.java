import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        System.out.println("Number of characters in decimal notation for this number: " + numbersOfCharacters.count(number));
        System.out.println("\nThe number of different primes that are factors of a given number: " + primeNumbers.count(number));
    }
}