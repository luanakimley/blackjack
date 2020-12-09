/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Luana Kimley 
 */
public class DiceGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

//      Stating variables        
        int dicePlayer;
        int diceComp;
        int win = 0;
        int lose = 0;
        int draw = 0;
        int numRound;
        String value;

//      Introducing game
        System.out.println("Welcome to the dice game!");
        System.out.println();

//      Inputs number of round user wants
        System.out.println("How many rounds do you want to play?");
        numRound = keyboard.nextInt();
        System.out.println();

//      For loop for dice roll        
        for (int round = 1; round <= numRound; round ++)
        {
//          Generate random dice number   
            dicePlayer = 1 + rand.nextInt(6);
            diceComp = 1 + rand.nextInt(6);

//          Stating win, lose, or draw against computer            
            if (dicePlayer > diceComp)
            {
                value = "Win";
                win ++;
            }
            
            else if (dicePlayer < diceComp)
            {
                value = "Lose";
                lose ++;
            }
            
            else
            {
                value = "Draw";
                draw ++;
            }

//          Output dice roll & value each round             
            System.out.println("Round #" + round);
            System.out.println("You rolled " + dicePlayer);
            System.out.println("Computer rolled " + diceComp);
            System.out.println(value);
            System.out.println();
        }

//      Calculate win percentage - draw is counted as half win        
        double winPercentage = (double) (win + draw * 0.5) / numRound * 100;
        
//      Determine overall winner
        String winner;
        if (winPercentage > 50)
        {
            winner = "Player";
        }
        
        else if (winPercentage == 50)
        {
            winner = "Draw";
        }
        
        else
        {
            winner = "Computer";
        }
        

//      Output statistics        
        System.out.println();
        System.out.println("======== Statistics ========");
        System.out.println("Number of rounds played: " + numRound);
        System.out.println("Number of Wins         : " + win);
        System.out.println("Number of Loss         : " + lose);
        System.out.println("Number of Draws        : " + draw);
        System.out.println("Win percentage         : " + String.format("%.2f", winPercentage) + "%");
        System.out.println("Overall winner         : " + winner);
    }
}
