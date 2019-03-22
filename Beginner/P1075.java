import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1075 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner (System.in) ;
        
        int n = sc.nextInt() ;
        
        for ( int count = 1 ; count <= 10000 ; count ++ ) {
            
            int rest = count % n ;
            
            if ( rest == 2 ) {
                System.out.println (count) ;
            }
            
        }
    }
}
