package src;
import java.util.Scanner;
import java.util.Random;
public class Dice_game {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    int no_dice= 0;
    int turn =0;
    int total =0;
    //taking the input
    public void take_roll(){
        System.out.println("you will now roll the dice ");
        System.out.println("how many dice do you want to roll ");
        no_dice = sc.nextInt();
        if(no_dice<=0){
            System.out.print("sorry, the number of dice should be more than zero ");
            while (no_dice<0){
                no_dice = sc.nextInt();
            }
        }
        for (int i =0; i<no_dice;i++){
            turn = random.nextInt(1,7); /*this line is before the number on the roll line cuz the drawing
            and the turn were giving different values, hence had to be changed*/

            System.out.println("number on the roll: "+ turn);
           draw();
            total += turn;
        }
        System.out.println("your total is "+total);
    }
    public void draw(){
        switch(turn){
            case 1:
                System.out.println("""
                         ---------
                        |         |
                        |         | 
                        |    •    |
                        |         |
                        |         |
                         ---------
                        """);
                break;
            case 2:
                System.out.println("""
                         ---------
                        | •       |
                        |         | 
                        |         |
                        |         |
                        |       • |
                         ---------
                        """);
                break;

            case 3:
                System.out.println("""
                         ---------
                        | •       |
                        |         | 
                        |    •    |
                        |         |
                        |       • |
                         ---------
                        """);
                break;

            case 4:
                System.out.println("""
                         ---------
                        | •     • |
                        |         | 
                        |         |
                        |         |
                        | •     • |
                         ---------
                        """);
                break;


            case 5:
                System.out.println("""
                         ---------
                        | •     • |
                        |         | 
                        |    •    |
                        |         |
                        | •     • |
                         ---------
                        """);
                break;

            case 6:
                System.out.println("""
                         ---------
                        | •     • |
                        |         | 
                        | •     • |
                        |         |
                        | •     • |
                         ---------
                        """);
                break;

        }
        }

        public static void main(String args[]){
            Dice_game game1 = new Dice_game();
            game1.take_roll();
        }
}

