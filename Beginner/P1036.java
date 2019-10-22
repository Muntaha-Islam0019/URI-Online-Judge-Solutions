import java.io.IOException;
import java.util.* ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1036 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner input = new Scanner ( System.in ) ;
        
        double A = input.nextDouble() ;
        double B = input.nextDouble() ;
        double C = input.nextDouble() ;
        
        double del = B*B - 4*A*C ;
        
        if ( del < 0 || A == 0 ) {
            System.out.println ( "Impossivel calcular" ) ;
        }
        else {
            double R1 = ( -B + Math.sqrt(del) ) / (2*A) ;
            double R2 = ( -B - Math.sqrt(del) ) / (2*A) ;
            
            System.out.printf ( "R1 = %.5f\n" , R1 ) ;
            System.out.printf ( "R2 = %.5f\n" , R2 ) ;
        }
 
    }
 
}