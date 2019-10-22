import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1048 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         double p = input.nextDouble() ;
         
         double pBack = p ;
         int rate = 0 ; 
         
         if ( p >= 0.0 && p <= 400.0 ) {
             rate = 15 ;
         }
         else if ( p >= 400.01 && p <= 800.0 ) {
             rate = 12 ;
         }
         else if ( p >= 800.01 && p <= 1200.0 ) {
             rate = 10 ;
         }
         else if ( p >= 1200.01 && p <= 2000.0 ) {
             rate = 7 ;
         }
         else {
             rate = 4 ;
         }
         
         p = p + ((p*rate)/100) ;
         double r = p - pBack ;
         
         System.out.printf ( "Novo salario: %.2f\n", p ) ;
         System.out.printf ( "Reajuste ganho: %.2f\n", r ) ;
         System.out.println ( "Em percentual: " + rate + " %" ) ;
    }
 
}