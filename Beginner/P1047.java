import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1047 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         int startHr = input.nextInt() ;
         int startM = input.nextInt() ;
         
         
         int endHr = input.nextInt() ;
         int endM = input.nextInt() ;
         
         int sumHr = endHr - startHr ;
         int sumM = endM - startM ;
         
         if (sumHr < 0)
     {
         sumHr = 24 + (endHr - startHr);
     }
     
     if (sumM < 0)
     {
         sumM = 60 + (endM - startM);
         sumHr -- ;
     }

     if (startHr == endHr && startM == endM)
     {
      System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
     }

     else System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", sumHr , sumM );
  
    }
 
}