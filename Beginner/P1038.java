import java.io.IOException;
import java.util.* ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1038 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner input = new Scanner ( System.in ) ;
        
        int X = input.nextInt() ;
        int Y = input.nextInt() ;
        double price ;
        
        switch (X) {
            
            case 1 :
                price = 4*Y ;
                break ;
            
            case 2 :
                price = 4.5*Y ;
                break ;
                
            case 3 :
                price = 5*Y ;
                break ;
                
            case 4 :
                price = 2*Y ;
                break ;
                
            case 5 :
                price = 1.5*Y ;
                break ;
                
            default :
                price = 0 ;
                break ;
                
        }
        
        System.out.printf ( "Total: R$ %.2f\n" , price ) ;
                
    }
 
}