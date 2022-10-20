public class numbersOfCharacters implements calculatingNumbers {
    public static int count(int number) {
        int amount = 0;
        long temp = 1;
        while (temp <= number) {
            amount++;
            temp *= 10;
        }
        return amount;
    }
}