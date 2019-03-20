import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1064 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         double [] arr = new double [6] ;
         
         for ( int a = 0 ; a < 6 ; a ++ ) {
             arr [a] = input.nextDouble();
         }
         
         int count = 0 ;
         double sum = 0.0 ;
         
         for ( int a = 0 ; a < 6 ; a ++ ) {
             
             if ( arr [a] > 0 ) {
                 count ++ ;
                 sum += arr [a] ;
             }
         }
         
         System.out.printf ( "%d valores positivos\n" , count ) ;
         System.out.printf ( "%.1f\n" , sum/count ) ;
    }
 
}