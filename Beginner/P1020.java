import java.util.* ;
public class P1020 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        int x = input.nextInt () ;
        
        int years = x/365 ;
        x = x%365 ;
        
        int months = x/30 ;
        
        int days = x%30 ;
        
        System.out.printf ( "%d ano(s)\n" , years ) ;
        System.out.printf ( "%d mes(es)\n" , months ) ;
        System.out.printf ( "%d dia(s)\n" , days ) ;
        
    }
    
}
        
