import java.io.IOException;
import java.util.Scanner ;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1050 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
         Scanner input = new Scanner (System.in) ;
         
         int a = input.nextInt() ;
         
         switch (a) {
             case 61 : 
                 System.out.println ("Brasilia") ; 
                 break ;
             case 71 : 
                 System.out.println ("Salvador") ; 
                 break ;
             case 11 : 
                 System.out.println ("Sao Paulo") ; 
                 break ;
             case 21 : 
                 System.out.println ("Rio de Janeiro") ; 
                 break ;
             case 32 : 
                 System.out.println ("Juiz de Fora") ; 
                 break ;
             case 19 : 
                 System.out.println ("Campinas") ; 
                 break ;
             case 27 : 
                 System.out.println ("Vitoria") ; 
                 break ;
             case 31 : 
                 System.out.println ("Belo Horizonte") ; 
                 break ;
             default : 
                 System.out.println ("DDD nao cadastrado") ; 
                 break ;
                 
         }
 
    }
 
}