import java.io.IOException;
import java.util.* ;

public class P1012 {
 
    public static void main(String[] args) throws IOException {
 
 Scanner input = new Scanner ( System.in ) ;
 
 double A = input.nextDouble () ;
 double B = input.nextDouble () ;
 double C = input.nextDouble () ;
 
 double areaoftriAC = 0.5 * A * C ;
 double areaofcirC = 3.14159 * C * C ;
 double areaoftraABC = ((A + B) / 2 ) * C ;
 double areaofsquB = B * B ;
 double areaofrecAC = A * B ;
 
 System.out.printf ( "TRIANGULO: %.3f\n" , areaoftriAC ) ;
 System.out.printf ( "CIRCULO: %.3f\n" , areaofcirC ) ;
 System.out.printf ( "TRAPEZIO: %.3f\n" , areaoftraABC ) ;
 System.out.printf ( "QUADRADO: %.3f\n" , areaofsquB ) ;
 System.out.printf ( "RETANGULO: %.3f\n" , areaofrecAC ) ;
 
    }
 
}