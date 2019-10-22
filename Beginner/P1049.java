import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class P1049 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner input = new Scanner ( System.in ) ;
         
         String a = input.nextLine() ;
         String b = input.nextLine() ;
         String c = input.nextLine() ;
         
         if ( a.equals("vertebrado") ) {
             if (b.equals("ave") ) {
                 if (c.equals("carnivoro")) {
                     System.out.println ("aguia") ;
                 }
                 else if (c.equals("onivoro")) {
                     System.out.println ("pomba") ;
                 }
             }
             else if (b.equals("mamifero") ) {
                 if (c.equals("onivoro")) {
                     System.out.println ("homem") ;
                 }
                 else if (c.equals("herbivoro")) {
                     System.out.println ("vaca") ;
                 }
             }
         }
         
         else if ( a.equals("invertebrado") ) {
             if (b.equals("inseto") ) {
                 if (c.equals("hematofago")) {
                     System.out.println ("pulga") ;
                 }
                 else if (c.equals("herbivoro")) {
                     System.out.println ("lagarta") ;
                 }
             }
             else if (b.equals("anelideo") ) {
                 if (c.equals("hematofago")) {
                     System.out.println ("sanguessuga") ;
                 }
                 else if (c.equals("onivoro")) {
                     System.out.println ("minhoca") ;
                 }
             }
         }
 
    }
 
}