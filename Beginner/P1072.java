import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1072 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        int inCount = 0;
        int outCount = 0;
        
        for ( int c = 1 ; c <= n ; c ++ ) {
            int x = sc.nextInt();
            if (x>=10 && x<=20){
                inCount++;
            }
            else {
                outCount++;
            }
        }
        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
    }
}