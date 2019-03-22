import java.util.Scanner ;
public class P1131 {
    public static void main ( String [] args ) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        int matches = 0 , intWin = 0 , greWin = 0 , draw = 0 , res = 0 ;
        
        while ( res != 2 ) {
            
            int inter = sc.nextInt() ;
            int gremio = sc.nextInt() ;
            matches++ ;
            
            if ( inter > gremio ) {
                intWin++ ; 
            } else if ( inter < gremio ) {
                greWin++ ;
            } else {
                draw++ ;
            }
            
            System.out.println ( "Novo grenal (1-sim 2-nao)" ) ;
            res = sc.nextInt() ;
            
            if ( res == 2 ) {
                System.out.println ( matches + " grenais" ) ;
                System.out.println ( "Inter:" + intWin ) ;
                System.out.println ( "Gremio:" + greWin ) ;
                System.out.println ( "Empates:" + draw ) ;
                
                if ( intWin > greWin ) {
                    System.out.println ( "Inter venceu mais" ) ;
                } else if ( intWin < greWin ) {
                    System.out.println ( "Gremio venceu mais" ) ;
                }
            }
        }
    }
}