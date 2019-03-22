import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1079 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner (System.in) ;
        
        int n = sc.nextInt() ;
        
        for ( int count = 1 ; count <= n ; count ++ ) {
            
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();
            
            double d1WithWeight = d1 * 2 ;
            double d2WithWeight = d2 * 3 ;
            double d3WithWeight = d3 * 5 ;
            
            double sum = d1WithWeight + d2WithWeight + d3WithWeight ;
            
            double average = sum / 10 ;
            
            System.out.printf ( "%.1f\n",average ) ;
            
        }
    }
}