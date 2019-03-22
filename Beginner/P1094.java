import java.util.Scanner;

public class P1094 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int tCase = sc.nextInt() , nOfAnimals = 0 , nOfCoelho = 0 , nOfratos = 0 , nOfsapos = 0;
        
        for ( int count = 1 ; count <= tCase ; count ++ ) {
            
            int amount = sc.nextInt();
            String s = sc.next();
            
            nOfAnimals += amount;
            if (s.equals("C")) {
                nOfCoelho += amount;
            }
            else if (s.equals("R")) {
                nOfratos += amount;
            }
            else if (s.equals("S")) {
                nOfsapos += amount;
            }
            
        }
        
        sc.close();
        
        double pOfCoelho , pOfratos , pOfsapos;
        pOfCoelho = (((double)nOfCoelho / (double)nOfAnimals) * 100.0);
        pOfratos = (((double)nOfratos / (double)nOfAnimals) * 100.0);
        pOfsapos = (((double)nOfsapos / (double)nOfAnimals) * 100.0);
        
        System.out.printf ( "Total: %d cobaias\n" , nOfAnimals );
        System.out.printf ( "Total de coelhos: %d\n" , nOfCoelho );
        System.out.printf ( "Total de ratos: %d\n" , nOfratos );
        System.out.printf ( "Total de sapos: %d\n" , nOfsapos );
        System.out.printf ( "Percentual de coelhos: %.2f" , pOfCoelho );
        System.out.print(" %\n");
        System.out.printf ( "Percentual de ratos: %.2f" , pOfratos );
        System.out.print(" %\n");
        System.out.printf ( "Percentual de sapos: %.2f" , pOfsapos );
        System.out.print(" %\n");
    }
}