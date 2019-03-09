import java.util.* ;
public class P1014 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        int X = input.nextInt () ; 
        float Y = input.nextFloat () ;
        
        float con = X / Y ; 
        
        System.out.printf ( "%.3f km/l\n" , con ) ;
    }
}