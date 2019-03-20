import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1046 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
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