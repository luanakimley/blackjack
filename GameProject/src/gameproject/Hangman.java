/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojectcanov2020;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Luana Kimley SD1b
 */
public class LuanaGame4
{

    public static void main(String[] args)
    {

//      Hangman Game
//      Purpose: to guess the word entered by the other player in 10 attempts
//      Logic:
//      1. There are 2 players, 1 player to determine the secret word and 1 player to guess
//      2. To win, guessing player will need to guess the word in 10 attempts
//      3. Every round, the guessing player is allowed to guess 1 letter, if the letter is in the word, it will be printed out in the order it is in
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Hangman game!\n");

        boolean play = true;

        while (play)
        {
//          Player 1 to enter the secret word that will be guesses
            System.out.println();
            System.out.println("Enter the secret word - no repeated letters, max 10 letters, all lowercase:");
            String secret = keyboard.nextLine();

            if (secret.length() >= 1 && secret.length() <= 10)
            {

                String showSecret = "";

//          For loop to print out "_" as long as the secret word            
                for (int i = 1; i <= secret.length(); i++)
                {
                    showSecret += "_";
                }

//          Prints blank spaces (so that the guessing player will not be able to see secret word entered)            
                for (int i = 1; i <= 30; i++)
                {
                    System.out.println("\n");
                }

//          Shows the secret word in "_"             
                System.out.println("Secret word: ");
                System.out.println(showSecret);

                System.out.println("\nTime to guess!\n");

                String guess;
                int attempt = 0;

//          While loop for 10 attempts
                while (attempt < 10)
                {
//              Guessing player to input letter guessed
                    System.out.println();
                    System.out.println("Attempts left: " + (10 - attempt));
                    System.out.println("Enter guess (only 1 letter!): ");
                    guess = keyboard.nextLine();

//              Determine if input is valid or no                
                    if (guess.length() > 1 || guess.length() < 1)
                    {
                        System.out.println("Guess 1 letter!");
                    }
                    else
                    {

                        attempt++;

//                  newShowSecret string to add guessing player's input to showSecret                  
                        String newShowSecret = "";

//                  Determines the position of the letter guessed in the secret word                    
                        int position = secret.indexOf(guess);

                        for (int i = 0; i < secret.length(); i++)
                        {
//                      Determines if the letter guessed is in the secret word                        
                            if (i == position)
                            {
//                          If yes, it will be added to it's corresponding position in the word
                                newShowSecret += secret.charAt(i);
                            }
                            else
                            {
//                          If no, "_" will be printed                             
                                newShowSecret += showSecret.charAt(i);
                            }
                        }

                        showSecret = newShowSecret;

                        System.out.println();
                        System.out.println(showSecret);

//                  If word guessed then you win                    
                        if (showSecret.equalsIgnoreCase(secret))
                        {
                            System.out.println();
                            System.out.println("The word is: " + secret);
                            System.out.println("You win!");
                            System.out.println("You guessed the word in " + attempt + " attempt(s).");
                            System.out.println();
                            break;
                        }
                    }

                }

//          If out of attempts you lose            
                if (attempt == 10)
                {
                    System.out.println("\nOut of attempts, you lose!");
                    System.out.println("The word is: " + secret);
                }

//          Play again?
                
                String playAgain;
                
                do
                {
                    System.out.println("\nPlay again? (y/n)");
                    playAgain = keyboard.nextLine();
                    
                    if (playAgain.equalsIgnoreCase("y"))
                    {
                        play = true;
                        break;
                    }
                    else if (playAgain.equalsIgnoreCase("n"))
                    {
                        play = false;
                        System.out.println("\nGame over. Goodbye!");
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid input!");
                    }
                } while (!playAgain.equalsIgnoreCase("y") || !playAgain.equalsIgnoreCase("n"));
            }
            else
            {
                System.out.println("Invalid input! Check the rules.");
            }
        }

    }
}

//      Issues with the game: 
//      - Does't allow words with repeated letters 
//      - Can't validate the input for the words (check if there is a double letter, if it is a number)

//      Tests:

//      #1
//      secret = towel
//      showSecret = _____

//      Attempts left = 10
//      guess = t
//      showSecret = t____

//      Attempts left = 9
//      guess = j
//      showSecret = t____

//      Attempts left = 8
//      guess = l
//      showSecret = t___l

//      Attempts left = 7
//      guess = o
//      showSecret = to__l

//      Attempts left = 6
//      guess = h
//      showSecret = to__l

//      Attempts left = 5
//      guess = b
//      showSecret = to__l

//      Attempts left = 4
//      guess = j
//      showSecret = to__l

//      Attempts left = 3
//      guess = n
//      showSecret = to__l

//      Attempts left = 2
//      guess = r
//      showSecret = to__l

//      Attempts left = 1
//      guess = i
//      showSecret = to__l

//      Out of attempts, you lose!
//      The word is: towel

//      Play again?
//      playAgain = n
//      Game over. Goodbye!

//      #2
//      secret = towel
//      showSecret = ___

//      Attempts left = 10
//      guess = t
//      showSecret = t__

//      Attempts left = 9
//      guess = o
//      showSecret = to_

//      Attempts left = 8
//      guess = e
//      showSecret = toe

//      The word is: toe
//      You win!

//      Play again?
//      y

//      Enter the secret word - no repeated letters, max 10 letters, all lower cases:

//      - Code is working -
