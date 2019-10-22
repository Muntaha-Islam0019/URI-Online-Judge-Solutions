import java.io.IOException;
import java.util.* ;

public class P1002 {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input = new Scanner ( System.in ) ;
         
         double R = input.nextDouble () ;
         double n = 3.14159 ;
         double A = n * Math.pow (R,2) ;
         
         System.out.printf ( "A=%.4f\n" , A ) ;
         
    }
 
}