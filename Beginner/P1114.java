import java.io.IOException;

import java.util.Scanner;


public class P1114 {


    public static void main(String[] args) throws IOException {

        int password = 2002, givenPassword;

        Scanner input = new Scanner(System.in);


        while ((givenPassword = input.nextInt()) != password) {

            System.out.print("Senha Invalida\n");


        }


        System.out.print("Acesso Permitido\n");


    }

}