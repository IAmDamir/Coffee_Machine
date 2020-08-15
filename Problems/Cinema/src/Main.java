import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] matrix = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        scanner.close();

        int c;
        for (int i = 0; i < y; i++) {
            c = 0;
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] == 0) {
                    c++;
                    if (c == k) {
                        System.out.println(i + 1);
                        return;
                    }
                } else {
                    c = 0;
                }
            }
        }

        System.out.println(0);
    }
}