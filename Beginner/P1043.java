import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1043 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner ( System.in ) ;
         
         double A = input.nextDouble() ;
         double B = input.nextDouble() ;
         double C = input.nextDouble() ;
         
         if ( (A+B) > C && (B+C) > A && (C+A) > B ) { 
             double p = (A+B+C) ;
             System.out.printf ( "Perimetro = %.1f\n" , p ) ;
         }
         else {
             double a = ((A+B)*C)/2 ;
             System.out.printf ( "Area = %.1f\n" , a ) ;
         }
 
    }
 
}