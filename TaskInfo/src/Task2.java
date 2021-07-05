import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        ArrayInput(arr, n);
        ArrayOutput(arr, n);
        Sorting(arr);
        ArrayOutput(arr, n);
    }

    private static void ArrayInput(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
    }

    private static void ArrayOutput(int[] arr, int n2) {
        for (int i = 0; i < n2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void Sorting(int[] arr) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    Swap(arr, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    private static void Swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
