import java.io.IOException;
import java.util.* ;

public class P1011 {
 
    public static void main(String[] args) throws IOException {
 
 Scanner input = new Scanner ( System.in ) ;
 
 double r = input.nextDouble () ; 
 double pi = 3.14159 ;
 
 double vol = (4/3.0) * pi * r * r * r ;
 
 System.out.printf ( "VOLUME = %.3f\n" , vol ) ;
 
    }
 
}