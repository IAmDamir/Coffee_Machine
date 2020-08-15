import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'a') {
            return true;
        } else if (ch == 'E' || ch == 'e') {
            return true;
        } else if (ch == 'I' || ch == 'i') {
            return true;
        } else if (ch == 'O' || ch == 'o') {
            return true;
        } else return ch == 'U' || ch == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}