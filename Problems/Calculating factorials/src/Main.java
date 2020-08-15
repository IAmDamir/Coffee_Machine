import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long answer = 1L;
        long counter = 1L;
        while (counter < n) {
            counter++;
            answer *= counter;
        }
        return answer;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}