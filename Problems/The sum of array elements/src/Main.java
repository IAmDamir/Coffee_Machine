import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int sum = 0;
        for (int num = 0; num < len; num++) {
            array[num] = scanner.nextInt();
            sum += array[num];
        }
        System.out.println(sum);
    }
}