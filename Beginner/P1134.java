import java.io.IOException;

import java.util.Scanner;

  

public class P1134 {

  

    public static void main(String[] args) throws IOException {

  

       int X = 0, fuel = 0, customerAlcohol = 0, customerGasolin = 0, customerDisel = 0;

        Scanner input = new Scanner(System.in);

         

         

         

        while (X != 4) {

            X = input.nextInt();

            if (X == 1) {

                customerAlcohol+=1;

            }else if (X == 2) {

                customerGasolin += 1;

            }else if (X == 3) {

                customerDisel += 1;

            }

             

        }

        //Alcool: 1 Gasolina: 2 Diesel: 0

        System.out.print("MUITO OBRIGADO\n");

        System.out.print("Alcool: "+customerAlcohol+"\n");

        System.out.print("Gasolina: "+customerGasolin+"\n");

        System.out.print("Diesel: "+customerDisel+"\n");

  

    }

  

}