import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P2862 {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
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