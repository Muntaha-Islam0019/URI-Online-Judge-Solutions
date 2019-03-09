import java.util.* ;
public class P1019 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        int x = input.nextInt () ;
        
        int hours = x/3600 ;
        x = x%3600 ;
        
        int minutes = x/60 ;
        
        int seconds = x%60 ;
        
        System.out.printf ( "%d:%d:%d\n" , hours , minutes , seconds ) ;
        
    }
    
}
        
