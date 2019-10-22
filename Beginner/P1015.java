import java.util.* ;
public class P1015 {
    public static void main ( String [] args ) {

        Scanner input = new Scanner ( System.in ) ;
        
        float x1 = input.nextFloat () ;
        float y1 = input.nextFloat () ;
        
        float x2 = input.nextFloat () ;
        float y2 = input.nextFloat () ;
        
        float dis = (float) Math.sqrt ( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) ) ;
        
        System.out.printf ( "%.4f\n" , dis ) ;
        
    }
    
}
        