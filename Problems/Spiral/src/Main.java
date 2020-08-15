import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++, count++) {   //left to right
                array[top][i] = count;
            }
            top++;
            for (int j = top; j <= bottom; j++, count++) {   //top to bottom
                array[j][right] = count;
            }
            right--;
            for (int i = right; i >= left; i--, count++) {   //right to left
                array[bottom][i] = count;
            }
            bottom--;
            for (int j = bottom; j >= top; j--, count++) {   //bottom to top
                array[j][left] = count;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}