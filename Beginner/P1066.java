import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1066 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aqu�
         */
        
        Scanner sc = new Scanner (System.in) ;
        int [] arr = new int [5] ;
        
        for ( int count = 0 ; count < 5 ; count++ ) {
            arr[count] = sc.nextInt() ;
        }
        
        sc.close();
        
        int even = 0 , odd = 0 , pos = 0 , neg = 0 ;
        
        for ( int count = 0 ; count < 5 ; count++ ) {
            
            if ( arr[count] % 2 == 0 ) {
                even++ ;
            }
            if ( arr[count] % 2 != 0 ) {
                odd++ ;
            }
            if ( arr[count] > 0 ) {
                pos++ ;
            }
            if ( arr[count] < 0 ) {
                neg++ ;
            }
        }
        
        System.out.println ( even + " valor(es) par(es)" ) ;
        System.out.println ( odd + " valor(es) impar(es)" ) ;
        System.out.println ( pos + " valor(es) positivo(s)" ) ;
        System.out.println ( neg + " valor(es) negativo(s)" ) ;
    }
}
        
        