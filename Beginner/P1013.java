import java.io.IOException;
import java.util.* ;

public class P1013 {
 
    public static void main(String[] args) throws IOException {
 
 Scanner input = new Scanner ( System.in ) ;
 
int A = input.nextInt();
int B = input.nextInt();
int C = input.nextInt();

int MaiorAB = ( A + B + Math.abs( A-B ) ) / 2 ;
int MaiorABC = ( MaiorAB + C + Math.abs( MaiorAB - C ) ) / 2 ;

System.out.printf ( "%d eh o maior\n" , MaiorABC ) ; 

}

}
