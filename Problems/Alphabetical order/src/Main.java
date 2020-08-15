import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] txt = scanner.nextLine().split(" ");
        scanner.close();
        int bln;
        boolean answer = true;
        for (int i = 1; i < txt.length; i++) {
            bln = txt[i].compareTo(txt[i - 1]);
            if (bln < 0) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}