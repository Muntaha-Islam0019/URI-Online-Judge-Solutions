import java.io.IOException;
import java.util.* ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1035 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner input = new Scanner ( System.in ) ;
        
        int A = input.nextInt() ;
        int B = input.nextInt() ;
        int C = input.nextInt() ;
        int D = input.nextInt() ;
        
        if ( B>C && D>A && C+D > A+B && C>=0 && A%2==0 ) {
            System.out.println ( "Valores aceitos" ) ;
        }
        else {
            System.out.println ( "Valores nao aceitos" ) ;
        }
 
    }
 
}