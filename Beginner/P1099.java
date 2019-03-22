import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1099 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner ( System.in ) ;
        int tCase = sc.nextInt() ;
        
        for (int count = 1 ; count <= tCase ; count++) {
            
            int num1 = sc.nextInt() ;
            int num2 = sc.nextInt() ;
            
            int sum = 0 ;
            
            if (num1 < num2) {
                for (int c = num1+1 ; c < num2 ; c++) {
                    if ( c % 2 != 0 ) {
                        sum += c ;
                    }
                }
            } else if (num2 < num1) {
                for (int c = num2+1 ; c < num1 ; c++) {
                    if ( c % 2 != 0 ) {
                        sum += c ;
                    }
                }
            }
            
            System.out.println (sum) ;
        }
    }
}
            