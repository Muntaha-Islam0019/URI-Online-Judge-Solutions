import java.io.IOException;
import java.util.* ;

public class P1005 {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input = new Scanner ( System.in ) ;
         
         double A = input.nextDouble () ;
         double B = input.nextDouble () ;
         double SUM = A + B ;
         double MEDIA = SUM / 2 ;
         
         System.out.printf ( "MEDIA = %.5f\n" , MEDIA) ;
         
    }
 
}