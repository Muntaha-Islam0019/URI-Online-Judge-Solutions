import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1071 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sumOfOdd = 0;
        
        if ( x<y ) {
            for (int count = x=1 ; count < y ; count ++) {
                if (count % 2 != 0) {
                    sumOfOdd += count;
                }
            }
            System.out.println(sumOfOdd);
        }
        else {
            for (int count = y+1 ; count < x ; count ++) {
                if (count % 2 != 0) {
                    sumOfOdd += count;
                }
            }
            System.out.println(sumOfOdd);
        }
    }
}