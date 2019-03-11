import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1042 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         int [] arr = new int [3] ;
         
         // Taking input
         for ( int inp = 0 ; inp < arr.length ; inp ++ ) {
             arr [inp] = input.nextInt() ;
         }
         
         int [] arr2 = arr.clone() ;
         
         // Sorting
         for ( int i = 0 ; i < arr.length ; i ++ ) {
             for ( int j = i ; j < arr.length ; j ++ ) {
                 
                 if ( arr[i] > arr [j] ) {
                 int temp = arr[i] ;
                 arr[i] = arr [j] ;
                 arr[j] = temp ;
                 }
                 
             }
         }
         
         // Output with sort
         for ( int inp = 0 ; inp < arr.length ; inp ++ ) {
             System.out.println ( arr [inp] ) ;
         }
         
         System.out.println () ;
 
         // Output without sort
         for ( int inp = 0 ; inp < arr2.length ; inp ++ ) {
             System.out.println ( arr2 [inp] ) ;
         }
    }
 
}