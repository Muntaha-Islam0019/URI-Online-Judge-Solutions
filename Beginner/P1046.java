import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1046 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         int start = input.nextInt() ;
         int end = input.nextInt() ;
         int sum = end - start ;
         
         if (sum < 0)
     {
         sum = 24 + (end - start);
     }

     if (start == end)
     {
      System.out.printf("O JOGO DUROU 24 HORA(S)\n");
     }

     else System.out.printf("O JOGO DUROU %d HORA(S)\n", sum);
  
    }
 
}