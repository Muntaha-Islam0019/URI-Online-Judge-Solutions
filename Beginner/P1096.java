public class P1096 {
    public static void main (String [] args) {
        
        for ( int i = 1 ; i <= 9 ; i++ ) {
            for ( int j = 7 ; j >= 5 ; j-- ) {
                if ( i % 2 != 0 ) {
                    System.out.printf( "I=%d J=%d\n" , i , j ) ;
                }
            }
        }
        
    }
}