import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P1070 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int oddCount = 1;
        
        for (int count = x ; oddCount <= 6 ; count ++) {
            if (count % 2 != 0) {
                System.out.println(count);
                oddCount++;
            }
        }
    }
 
}