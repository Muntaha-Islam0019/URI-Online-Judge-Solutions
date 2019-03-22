import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1080 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner (System.in) ;
        
        int [] arr = new int [100] ;
        
        for ( int count = 0 ; count < arr.length ; count++ ) { 
            
            arr [count] = sc.nextInt() ;
            
        }
        
        int max = arr [0] ;
        int index = 0 ;
        
        for ( int count = 1 ; count < arr.length ; count++ ) {
            
            if (arr [count] > max) {
                max = arr [count] ;
                index = count ;
            }
            
        }
        
        System.out.println ( max ) ;
        System.out.println ( index + 1 ) ;
    }
}