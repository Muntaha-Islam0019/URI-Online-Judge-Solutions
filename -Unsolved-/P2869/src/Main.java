/*I've wasted 5.5 hours already.
* I dunno who you are(solution).
* Though, one day, I'm gonna find you.
* And I'm gonna kill(solve) you.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int[] convert_Integer_ArrayList(List<Integer> integers) {

        int[] ret = new int[integers.size()];

        Iterator<Integer> iterator = integers.iterator();

        for (int i = 0; i < ret.length; i++) {
            ret[i] = iterator.next();
        }

        return ret;
    }

    /*private static ArrayList<Integer> prime_Factorization(int number) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                arrayList.add(i);
                number = number / i;
            }
        }

        if (number > 2) {
            arrayList.add(number);
        }

        return arrayList;
    }*/

    private static int smallest_Number_With_N_Divisors(int n) {

        /*int[] arr = convert_Integer_ArrayList(prime_Factorization(n));*/

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= n / 2; i++) {
            if (n % i == 0)
                if (i % 2 == 0)
                    arrayList.add(i);
        }

        int[] arr = convert_Integer_ArrayList(arrayList);



        return n;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- != 0) {
            System.out.println(smallest_Number_With_N_Divisors(scanner.nextInt()));
        }
    }
}
