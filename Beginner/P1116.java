import java.io.IOException;

import java.util.Scanner;

 

public class P1116 {

 

    public static void main(String[] args) throws IOException {

        int N;

        int X, Y;

        float result;

        Scanner input =new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            X = input.nextInt();

            Y = input.nextInt();

                if (Y == 0) {

                    System.out.print("divisao impossivel\n");

                }else {

                    result =(float) X / Y;

                    System.out.printf("%.1f\n",result);

                }

                 

        }

    }

}
