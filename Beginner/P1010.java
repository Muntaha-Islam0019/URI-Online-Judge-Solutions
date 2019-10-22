import java.util.* ;
public class P1010 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        int code1 = input.nextInt () ; 
        int unit1 = input.nextInt () ;
        float product1 = input.nextFloat () ;
        
        float calc1 = (float) unit1 * product1 ;
        
        int code2 = input.nextInt () ; 
        int unit2 = input.nextInt () ;
        float product2 = input.nextFloat () ;
        
        float calc2 = (float) unit2 * product2 ;
        
        float sum = calc1 + calc2 ;
        
        System.out.printf ( "VALOR A PAGAR: R$ %.2f\n" , sum ) ;
        
    }
    
}
        
 