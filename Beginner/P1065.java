import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1065 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         double [] arr = new double [5] ;
         
         for ( int a = 0 ; a < 5 ; a ++ ) {
             arr [a] = input.nextDouble();
         }
         
         int count = 0 ;
         
         for ( int a = 0 ; a < 5 ; a ++ ) {
             
             if ( arr [a] % 2 == 0 ) {
                 count ++ ;
             }
         }
         
         System.out.printf ( "%d valores pares\n" , count ) ;
    }
 
}