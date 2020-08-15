import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean check = false;
        long l = 2L;
        while (l < number) {
            if (number % l == 0) {
                check = true;
            }
            if (number == 2) {
                check = false;
            }
            l++;
        }
        return check;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}