import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1044 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         int A =  input.nextInt() ;
         int B =  input.nextInt() ;
         
         if ( B%A == 0 || A%B == 0 ) { 
             System.out.println ( "Sao Multiplos" ) ;
         }
         else {
             System.out.println ( "Nao sao Multiplos" ) ;
         }
 
    }
 
}