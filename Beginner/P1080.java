import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1080 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
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