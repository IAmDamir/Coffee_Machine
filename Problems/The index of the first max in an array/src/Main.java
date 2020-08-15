import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int max = 0;
        int maxNum = 0;
        for (int num = 0; num < len; num++) {
            array[num] = scanner.nextInt();
            if (max < array[num]) {
                max = array[num];
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}