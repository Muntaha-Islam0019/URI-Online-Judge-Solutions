import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1041 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         double x = input.nextDouble() ;
         double y = input.nextDouble() ;
         
         if (x == 0 && y == 0) {
             System.out.println ( "Origem" ) ;
         }
         else if (y == 0) {
             System.out.println ( "Eixo X" ) ;
         }
         else if (x == 0) {
             System.out.println ( "Eixo Y" ) ;
         }
         else if (x > 0 && y > 0) {
             System.out.println ( "Q1" ) ;
         }
         else if (x < 0 && y > 0) {
             System.out.println ( "Q2" ) ;
         }
         else if (x < 0 && y < 0) {
             System.out.println ( "Q3" ) ;
         }
         else if (x > 0 && y < 0) {
             System.out.println ( "Q4" ) ;
         }
 
    }
 
}