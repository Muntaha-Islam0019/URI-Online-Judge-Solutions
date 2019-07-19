import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void reverse(int[] a, int n) {
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while(testCases-- != 0) {

            int valueCount = scanner.nextInt();
            int[] values = new int[valueCount];

            int index = 0;
            while(valueCount-- != 0) {
                values[index] = scanner.nextInt();
                index++;
            }

            Arrays.sort(values);

            int[] copyOfValues = Arrays.copyOf(values, values.length);
            reverse(copyOfValues, copyOfValues.length);

            for(int i = 0; i < values.length; i++) {

                if(copyOfValues[i] % 2 != 0) {
                    System.out.print(copyOfValues[i] + " ");
                }

                if(values[i] % 2 != 0) {
                    System.out.print(values[i] + " ");
                }
            }

            System.out.println();
        }
    }
}
