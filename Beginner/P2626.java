import java.util.Scanner;

public class P2626 {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            
            String [] arr = sc.nextLine().split(" ");
            
            /* arr[0] = Dodo
             * arr[1] = leo
             * arr[2] = Pepper
             * */
            
            int winner = checkerOfRockPaperScissors(arr);
            
            if (winner == 0) {
                
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
                
            } else if (winner == 1) {
                
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
                
            } else if (winner == 2) {
                
                System.out.println("Urano perdeu algo muito precioso...");
                
            } else {
                
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
                
            }
        }
    }
    
    /* Returns the index of winner
     * */
    public static int checkerOfRockPaperScissors(String [] arr) {
        
        int winner;
        
        if(arr[0].equals("pedra") && arr[1].equals("tesoura") && arr[2].equals("tesoura")) {
            
            winner = 0;
            
        } else if(arr[0].equals("pedra") && arr[1].equals("pedra") && arr[2].equals("papel")) {
            
            winner = 2;
            
        } else if(arr[0].equals("pedra") && arr[1].equals("papel") && arr[2].equals("pedra")) {
            
            winner = 1;
            
        } else if(arr[0].equals("papel") && arr[1].equals("pedra") && arr[2].equals("pedra")) {
            
            winner = 0;
            
        } else if(arr[0].equals("papel") && arr[1].equals("papel") && arr[2].equals("tesoura")) {
            
            winner = 2;
            
        } else if(arr[0].equals("papel") && arr[1].equals("tesoura") && arr[2].equals("papel")) {
            
            winner = 1;
            
        } else if(arr[0].equals("tesoura") && arr[1].equals("papel") && arr[2].equals("papel")) {
            
            winner = 0;
            
        } else if(arr[0].equals("tesoura") && arr[1].equals("tesoura") && arr[2].equals("pedra")) {
            
            winner = 2;
            
        } else if(arr[0].equals("tesoura") && arr[1].equals("pedra") && arr[2].equals("tesoura")) {
            
            winner = 1;
            
        } else {
            
            winner = -1;
            
        }
        
        return winner;
    }
}