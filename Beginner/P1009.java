import java.util.* ;
public class P1009 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        String name = input.next () ; 
        double salary = input.nextDouble () ;
        double sold = input.nextDouble () ;
        
        double earn = salary + ( sold * 0.15 ) ; 
        
        System.out.printf ( "TOTAL = R$ %.2f\n" , earn ) ;
        
    }
    
}
        
