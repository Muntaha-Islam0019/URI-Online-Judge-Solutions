import java.util.Scanner;
public class P1021 {
    
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        
        float d;
        int gr,gd;
        d = me.nextFloat();
        gr= (int)d;
        gd = (int)Math.round((d - (int)d) * 100);
        
        //NOTAS
        System.out.println("NOTAS:");
        
        System.out.printf("%d nota(s) de R$ 100.00\n", gr/100);
        gr = gr % 100;
        
        System.out.printf("%d nota(s) de R$ 50.00\n", gr/50);
        gr = gr % 50;
        
        System.out.printf("%d nota(s) de R$ 20.00\n", gr/20);
        gr = gr % 20;
        
        System.out.printf("%d nota(s) de R$ 10.00\n", gr/10);
        gr = gr % 10;
        
        System.out.printf("%d nota(s) de R$ 5.00\n", gr/5);
        gr= gr % 5;
        
        System.out.printf("%d nota(s) de R$ 2.00\n", gr/2);
        gr = gr% 2;
        
        if (gr == 1){
            gd= gr + 100;
        }
        //MOEDAS
        System.out.println("MOEDAS:");
        
        System.out.printf("%d moeda(s) de R$ 1.00\n", gd/100);
        gd = gd % 100;
        
        System.out.printf("%d moeda(s) de R$ 0.50\n", gd/50);
        gd = gd % 50;
        
        System.out.printf("%d moeda(s) de R$ 0.25\n", gd/25);
        gd = gd % 25;
        
        System.out.printf("%d moeda(s) de R$ 0.10\n", gd/10);
        gd = gd % 10;
        
        System.out.printf("%d moeda(s) de R$ 0.05\n", gd/5);
        gd = gd % 5;
        
        System.out.printf("%d moeda(s) de R$ 0.01\n", gd/1);
        gd = gd% 1;
        
        
    }
    
}