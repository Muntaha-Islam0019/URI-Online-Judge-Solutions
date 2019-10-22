import java.util.Scanner;

public class P1144 {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int N;
        N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for ( int j = i , k = (j*j) , l = (j*j*j) ; j==i ; j++ ) {
                
                System.out.println ( j + " " + k + " " + l ) ;
                System.out.println ( j + " " + (k+1) + " " + (l+1) ) ;
            }
        }
        
    }
    
}