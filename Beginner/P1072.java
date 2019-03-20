import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1072 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
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