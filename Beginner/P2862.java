import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class P2862 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        while(testCase-- > 0) { 
            
            int tempNum = sc.nextInt();
            
            if(tempNum > 8000) System.out.println("Mais de 8000!");
            else System.out.println("Inseto!");
        }
    }
}