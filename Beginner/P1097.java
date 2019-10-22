public class P1097 {
    public static void main (String [] args) {
        
        for ( int i = 1 , j = 7 ; i <= 9 ; i+=2 , j+=2 ) {
            for ( int jp = j ; jp >= j-2 ; jp-- ) {
                System.out.printf( "I=%d J=%d\n" , i , jp ) ;
            }
        }
    }
}