import java.lang.Math;

public class primeNumbers implements calculatingNumbers {
    static int amount = 0;
    public static int count(int number) { // Print the number of 2s that divide n
            while (number % 2 == 0) {
                System.out.print(2 + " ");
                number /= 2;
                amount++;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) { // n must be odd at this point.  So we can skip one element (Note i = i +2)
                while (number % i == 0) { // While i divides n, print i and divide n
                    System.out.print(i + " ");
                    number /= i;
                    amount++;
                }
            }

            if (number > 2) {  // This condition is to handle the case when n is a prime number greater than 2
                System.out.print(number);
                amount++;
            }
            return amount;
    }
}