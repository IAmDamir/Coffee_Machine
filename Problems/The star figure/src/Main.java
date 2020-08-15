import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String[][] array = new String[n][n];
        for (int i = 0, j = 0; i < n; i++, j = 0 ) {
            for (; j < n; j++) {
                array[i][j] = ".";
            }
        }
        int a = 0, b;
        for (b = n/2; a < n; a++) {
            array[a][b] = "*";
            array[b][a] = "*";
        }
        int c = 0;
        for (;c < n; c++) {
            array[c][c] = "*";
        }
        int x = 0,z = n - 1;
        for (;x < n; x++, z--) {
            array[x][z] = "*";
        }
        for (int i = 0, j = 0; i < n; i++, j = 0) {
            for (; j < n; j++) {
                System.out.print(array[i][j] + " ");
                if (j == n - 1) {
                    System.out.println("");
                }
            }
        }
    }
}