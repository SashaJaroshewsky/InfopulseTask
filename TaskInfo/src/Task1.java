import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        System.out.println("Enter m: ");
        m = scanner.nextInt();

        int[][] arr = new int[n][m];
        ArrayInput(arr, n, m);
        ArrayOutput(arr, n, m);

        int max = arr[0][0];
        int I = 0;
        int J = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    I = i;
                    J = j;
                }
            }
        }
        System.out.println("Max = " + max);
        float c = (float) -1.49;
        float d = (float) 23.4;
        float y = (float) Math.sqrt(Math.abs((Math.sin(c)) - ((4 * Math.log(d)) / (Math.pow(I, J)))));
        System.out.println("y = " + y);
    }

    private static void ArrayInput(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 50);
            }
        }
    }

    private static void ArrayOutput(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
