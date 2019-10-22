import java.io.IOException;
import java.util.* ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1037 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        Scanner input = new Scanner ( System.in ) ;
        
        double x = input.nextDouble() ;
        
        if ( x >= 0 && x <=25 ) {
            System.out.println ( "Intervalo [0,25]" ) ;
        }
        else if ( x > 25 && x <= 50 ) {
            System.out.println ( "Intervalo (25,50]" ) ;
        }
        else if ( x > 50 && x <= 75 ) {
            System.out.println ( "Intervalo (50,75]" ) ;
        }
        else if ( x > 75 && x <=100 ) {
            System.out.println ( "Intervalo (75,100]" ) ;
        }
        else {
            System.out.println ( "Fora de intervalo" ) ;
        }
 
    }
 
}