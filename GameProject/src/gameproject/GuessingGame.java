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
 * @author Luana Kimley SD1b
 */
public class GuessingGame
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

//      Stating variables        
        int numComp;
        int player1;
        int player2;
        int player1win = 0;
        int player2win = 0;
        String winLoss = "";
        
//      Introducing game
        System.out.println("Wecome to the number guessing game!");
        System.out.println("Player 1 & Player 2 will take turns guessing a number in the range [1,10]");

//      Inputs how many rounds user wants to play        
        System.out.println("How many rounds do you want to play?");
        int numRound = keyboard.nextInt();
        System.out.println();

//      For loop to determine how many rounds        
        for (int round = 1; round <= numRound; round++)
        {
            boolean gameOver = false;
            numComp = 1 + rand.nextInt(10);
            System.out.println("Round #" + round);

//          While game is not over            
            while (gameOver == false)
            {
//              Do while loop for number validation
                do
                {
//                  Player 1 to input number guessed 
                    System.out.println("Player 1 to guess the number: ");
                    player1 = keyboard.nextInt();               
                    if (player1 < 1 || player1 > 10)
                    {
                        System.out.println("Invalid input. Try again!");
                    }
                    
                } while (player1 < 1 || player1 > 10);

//              Determine winner                
                if (player1 == numComp)
                {
                    gameOver = true;
                    winLoss = "win1";
                    player1win++;

                }
                else
                {
//                  Do while loop for number validation
                    do
                    {
                        System.out.println("Player 2 to guess the number: ");
                        player2 = keyboard.nextInt();
                        if (player2 < 1 || player2 > 10)
                        {
                            System.out.println("Invalid input. Try again!");
                        }
                        
                    } while (player2 < 1 || player2 > 10);

//                  Determine winner                    
                    if (player2 == numComp)
                    {
                        gameOver = true;
                        winLoss = "win2";
                        player2win++;
                    }

                }
//              Outputs winner
                if (gameOver)
                {
                    if (winLoss.equals("win1"))
                    {
                        System.out.println("Player 1 wins!");
                        System.out.println();
                    }

                    else
                    {
                        if (winLoss.equals("win2"))
                        {
                            System.out.println("Player 2 wins!");
                            System.out.println();
                        }
                    }

                }

            }

        }
//      Counting number of loss
        int player1lose = numRound - player1win;
        int player2lose = numRound - player2win;

//      Counting win percentage        
        double p1winpercent = (double) player1win / numRound * 100;
        double p2winpercent = (double) player2win / numRound * 100;

//      Outputs statistics        
        System.out.println("======= Statistics =======");
        System.out.println("Number of rounds played: " + numRound);
        System.out.println("");
        System.out.println("Player 1");
        System.out.println("==========================");
        System.out.println("Wins          : " + player1win);
        System.out.println("Loss          : " + player1lose);
        System.out.println("Win percentage: " + String.format("%.2f", p1winpercent) + "%");
        System.out.println("");
        System.out.println("Player 2");
        System.out.println("==========================");
        System.out.println("Wins          : " + player2win);
        System.out.println("Loss          : " + player2lose);
        System.out.println("Win percentage: " + String.format("%.2f", p2winpercent) + "%");
        System.out.println();

    }
}
