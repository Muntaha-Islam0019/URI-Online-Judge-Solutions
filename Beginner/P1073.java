import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1073 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        Scanner sc = new Scanner (System.in) ;
        
        int n = sc.nextInt() ;
        
        for ( int count = 1 ; count <= n ; count ++ ) {
            
            if (count % 2 == 0) {
                int sq = count * count ;
                System.out.printf( "%d^2 = %d\n" , count , sq ) ;
            }
            
        }
        
    }
    
}