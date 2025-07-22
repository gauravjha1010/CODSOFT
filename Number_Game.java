import java.util.Random;
import java.util.Scanner;
public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        String nextRound="yes";
        int countRound=1;
        int roundWon=0;
        System.out.println("\nNumber Guessing Game\nDescription:\n1. Guesse a number in the range [1-100].\n2. At each round of the game, you'll have only five chance to guess the number which the computer have already guessed.\n3. If you guessed the number correctly, you won else keep playning for further attempts.");
        do { 
            int isguessed=-1;
            System.out.println("\nRound - "+countRound);
            int randNum=rand.nextInt(100)+1;
            int yourChance=0;
            int maxChance=5;
            countRound++;
            while(yourChance<maxChance){
                System.out.print("Enter your number: ");
                int guessNum=sc.nextInt();
                yourChance++;
                if(randNum==guessNum){
                    roundWon++;
                    System.out.println("Yeah! You gussed the correct number and you took "+yourChance+" attempt for this.");
                    System.out.println("Total Round Won: "+roundWon);
                    isguessed=1;
                    break;
                }
                else if(guessNum<randNum){
                    if(yourChance<=4){
                        System.out.println("Too low! Try higher number.....");
                    }
                    else{
                        System.out.println("Too low!");
                    }
                }
                else{
                    if(yourChance<=4){
                        System.out.println("Too high! Try lower number.....");
                    }
                    else{
                        System.out.println("Too high!");
                    }
                }
            }
            if(isguessed==-1){
                System.out.println("Sorry! You have reached your limit, The number was "+randNum);
                System.out.println("Total Round Won: "+roundWon);
            }
            System.out.print("Want to play next round ? (yes/no): ");
            nextRound=sc.next();
        } while (nextRound.equals("yes") || nextRound.equals("Yes"));
        
    }
}