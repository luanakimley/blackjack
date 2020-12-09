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
public class BlackJack
{

    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the BlackJack game!");

//      Rules:
//      - Cards with ranks 2-10 will have the value of the number
//      - Cards with rank J, Q, K will have the value of 10
//      - Ace card can have the value of 1 or 11, based on needs
//      - If the player card value reaches 21, it will be a BlackJack and player wins
//      - If the player card value exceeds 21, player busts and dealer wins

//      How to play:
//      - The player will be dealt 2 cards at first
//      - The dealer will also be dealt 2 cards (only 1 shown to the player)
//      - Player will have choice to hit or stay
//      - If player hits they will take another card
//      - If player stays both the player and dealer opens card and whoever has more value wins
//      - Dealer will need to hit until player chooses to stay or until dealer's card value reaches 17-21 or until dealer busts
//      - If dealer's card value reaches 17, both the dealer & player must stay and the one with greater value wins
//      

        boolean play = true;

        while (play)
        {
//      Variables for player's & dealer's cards
            int numCard, numCard2, numDCard, numDCard2;
            String card1, card2, Dcard1, Dcard2;

//      Shuffle the cards
            numCard = 1 + rand.nextInt(13);
            numCard2 = 1 + rand.nextInt(13);
            numDCard = 1 + rand.nextInt(13);
            numDCard2 = 1 + rand.nextInt(13);

//      Variables for the values of the player's card        
            int value;
            int pValue = 0;
            int pValue2 = 0;

//      Determining player's card face & it's value     
            switch (numCard)
            {
                case 1:
                    card1 = "A";
                    if (pValue < 11)
                    {
                        value = 11;
                        pValue += value;
                    }
                    else
                    {
                        value = 1;
                        pValue += value;
                    }
                    break;
                case 11:
                    card1 = "J";
                    value = 10;
                    pValue += value;
                    break;
                case 12:
                    card1 = "Q";
                    value = 10;
                    pValue += value;
                    break;
                case 13:
                    card1 = "K";
                    value = 10;
                    pValue += value;
                    break;
                default:
                    card1 = Integer.toString(numCard);
                    value = numCard;
                    pValue += value;
                    break;
            }

            switch (numCard2)
            {
                case 1:
                    card2 = "A";
                    if (pValue < 11)
                    {
                        value = 11;
                        pValue2 += value;
                    }
                    else
                    {
                        value = 1;
                        pValue2 += value;
                    }
                    break;
                case 11:
                    card2 = "J";
                    value = 10;
                    pValue2 += value;
                    break;
                case 12:
                    card2 = "Q";
                    value = 10;
                    pValue2 += value;
                    break;
                case 13:
                    card2 = "K";
                    value = 10;
                    pValue2 += value;
                    break;
                default:
                    card2 = Integer.toString(numCard2);
                    value = numCard2;
                    pValue2 += value;
                    break;
            }

            int ptotalValue = pValue + pValue2;

//      Variables for player's card suit        
            int numSuit, numSuit2;
            String suit = "", suit2 = "";
            numSuit = 1 + rand.nextInt(4);
            numSuit2 = 1 + rand.nextInt(4);

//      Determining player's card suit
            switch (numSuit)
            {
                case 1:
                    suit = "Spades";
                    break;
                case 2:
                    suit = "Hearts";
                    break;
                case 3:
                    suit = "Clubs";
                    break;
                case 4:
                    suit = "Diamonds";
                    break;
            }

            switch (numSuit2)
            {
                case 1:
                    suit2 = "Spades";
                    break;
                case 2:
                    suit2 = "Hearts";
                    break;
                case 3:
                    suit2 = "Clubs";
                    break;
                case 4:
                    suit2 = "Diamonds";
                    break;
            }

//      Outputs the player's first 2 card & total value of the cards
            System.out.println();
            System.out.println("Your cards are: ");
            System.out.println(card1 + " of " + suit);
            System.out.println(card2 + " of " + suit2);
            System.out.println("Total card value: " + ptotalValue);

//      Variables for the dealer's card value         
            int dValue = 0;
            int dValue2 = 0;

//      Determining dealer's card face & value        
            switch (numDCard)
            {
                case 1:
                    Dcard1 = "A";
                    if (dValue < 11)
                    {
                        value = 11;
                        dValue += value;
                    }
                    else
                    {
                        value = 1;
                        dValue += value;
                    }
                    break;
                case 11:
                    Dcard1 = "J";
                    value = 10;
                    dValue += value;
                    break;
                case 12:
                    Dcard1 = "Q";
                    value = 10;
                    dValue += value;
                    break;
                case 13:
                    Dcard1 = "K";
                    value = 10;
                    dValue += value;
                    break;
                default:
                    Dcard1 = Integer.toString(numDCard);
                    value = numDCard;
                    dValue += value;
                    break;
            }

            switch (numDCard2)
            {
                case 1:
                    Dcard2 = "A";
                    if (dValue < 11)
                    {
                        value = 11;
                        dValue2 += value;
                    }
                    else
                    {
                        value = 1;
                        dValue2 += value;
                    }
                    break;
                case 11:
                    Dcard2 = "J";
                    value = 10;
                    dValue2 += value;
                    break;
                case 12:
                    Dcard2 = "Q";
                    value = 10;
                    dValue2 += value;
                    break;
                case 13:
                    Dcard2 = "K";
                    value = 10;
                    dValue2 += value;
                    break;
                default:
                    Dcard2 = Integer.toString(numDCard2);
                    value = numDCard2;
                    dValue2 += value;
                    break;
            }

            int dtotalValue = dValue + dValue2;

//      Variables for the dealer's suit        
            int numDSuit, numDSuit2;
            String Dsuit = "", Dsuit2 = "";
            numDSuit = 1 + rand.nextInt(4);
            numDSuit2 = 1 + rand.nextInt(4);

//      Determining dealer's suit        
            switch (numDSuit)
            {
                case 1:
                    Dsuit = "Spades";
                    break;
                case 2:
                    Dsuit = "Hearts";
                    break;
                case 3:
                    Dsuit = "Clubs";
                    break;
                case 4:
                    Dsuit = "Diamonds";
                    break;
            }

            switch (numDSuit2)
            {
                case 1:
                    Dsuit2 = "Spades";
                    break;
                case 2:
                    Dsuit2 = "Hearts";
                    break;
                case 3:
                    Dsuit2 = "Clubs";
                    break;
                case 4:
                    Dsuit2 = "Diamonds";
                    break;
            }

//      Outputs dealer's 1st card (the second card is hidden)
            System.out.println();
            System.out.println("Dealer's card is: ");
            System.out.println(Dcard1 + " of " + Dsuit);
            //Test: prints hidden dealer card to check if the value is correct
            //System.out.println(Dcard2 + Dsuit2);

//      While loop to keep the loop going while card value less than 21
            while (ptotalValue < 21 && dtotalValue <= 21)
            {
//          Option to hit or stay
                System.out.println();
                System.out.println("Hit or Stay? ('h': hit; 's': stay)");
                String choice = keyboard.nextLine();

//          If hit, player will get another card            
                if (choice.equals("h"))
                {
                    numCard = 1 + rand.nextInt(13);

                    switch (numCard)
                    {
                        case 1:
                            card1 = "A";
                            if (ptotalValue < 11)
                            {
                                value = 11;
                                ptotalValue += value;
                            }
                            else
                            {
                                value = 1;
                                ptotalValue += value;
                            }
                            break;
                        case 11:
                            card1 = "J";
                            value = 10;
                            ptotalValue += value;
                            break;
                        case 12:
                            card1 = "Q";
                            value = 10;
                            ptotalValue += value;
                            break;
                        case 13:
                            card1 = "K";
                            value = 10;
                            ptotalValue += value;
                            break;
                        default:
                            card1 = Integer.toString(numCard);
                            value = numCard;
                            ptotalValue += value;
                            break;
                    }

                    numSuit = 1 + rand.nextInt(4);

                    switch (numSuit)
                    {
                        case 1:
                            suit = "Spades";
                            break;
                        case 2:
                            suit = "Hearts";
                            break;
                        case 3:
                            suit = "Clubs";
                            break;
                        case 4:
                            suit = "Diamonds";
                            break;
                    }

//              Outputs new card & updated total value                
                    System.out.println();
                    System.out.println("You got: ");
                    System.out.println(card1 + " of " + suit);
                    System.out.println();
                    System.out.println("Total card value: " + ptotalValue);
                    System.out.println("Dealer's hidden card is: " + Dcard2 + " of " + Dsuit2);

//              If dealer's total value is less than 17, dealer will hit again               
                    if (dtotalValue < 17)
                    {

                        numDCard2 = 1 + rand.nextInt(13);

                        switch (numDCard2)
                        {
                            case 1:
                                Dcard2 = "A";
                                if (dtotalValue < 11)
                                {
                                    value = 11;
                                    dtotalValue += value;
                                }
                                else
                                {
                                    value = 1;
                                    dtotalValue += value;
                                }
                                break;
                            case 11:
                                Dcard2 = "J";
                                value = 10;
                                dtotalValue += value;
                                break;
                            case 12:
                                Dcard2 = "Q";
                                value = 10;
                                dtotalValue += value;
                                break;
                            case 13:
                                Dcard2 = "K";
                                value = 10;
                                dtotalValue += value;
                                break;
                            default:
                                Dcard2 = Integer.toString(numDCard);
                                value = numDCard;
                                dtotalValue += value;
                                break;
                        }

                        numDSuit2 = 1 + rand.nextInt(4);

                        switch (numDSuit2)
                        {
                            case 1:
                                Dsuit2 = "Spades";
                                break;
                            case 2:
                                Dsuit2 = "Hearts";
                                break;
                            case 3:
                                Dsuit2 = "Clubs";
                                break;
                            case 4:
                                Dsuit2 = "Diamonds";
                                break;
                        }
                        //Test: prints out dealer card & total to check if the value is correct
                        //System.out.println("d card " + Dcard2 + Dsuit2);
                        //System.out.println("d total: " + dtotalValue);
                    }
                    else if (dtotalValue >= 17) // Else if dealer total value is more than 17, both player and dealer will need to stay
                    {
                        System.out.println();
                        System.out.println("Total card value: " + ptotalValue);
                        System.out.println("Dealer's card value: " + dtotalValue);

                        if (ptotalValue > dtotalValue)
                        {
                            System.out.println();
                            System.out.println("You win!");
                            break;
                        }
                        else if (ptotalValue == dtotalValue)
                        {
                            System.out.println();
                            System.out.println("Draw.");
                            break;
                        }
                        else
                        {
                            System.out.println();
                            System.out.println("You lose.");
                            break;
                        }

                    }
                }
                else if (choice.equals("s")) // Else if player choose to stay
                {
                    System.out.println();
                    System.out.println("Dealer's card is: " + Dcard2 + " of " + Dsuit2);
                    System.out.println();
                    System.out.println("Total card value: " + ptotalValue);
                    System.out.println("Dealer's card value: " + dtotalValue);

                    if (ptotalValue > dtotalValue)
                    {
                        System.out.println();
                        System.out.println("You win!");
                        break;
                    }
                    else if (ptotalValue == dtotalValue)
                    {
                        System.out.println();
                        System.out.println("Draw.");
                        break;
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("You lose.");
                        break;
                    }
                }
                else
                {
                    System.out.println("Invalid input. Check your spelling & capitalization!");
                }

            }

//      Determine player win or lose when value is more than 21
            if (ptotalValue == 21)
            {
                System.out.println();
                System.out.println("BlackJack. You win!");
            }
            else if (ptotalValue > 21)
            {
                System.out.println();
                System.out.println("Busted. You lose.");
            }
            else if (dtotalValue > 21)
            {
                System.out.println();
                System.out.println("Dealer's card is: " + Dcard2 + " of " + Dsuit2);
                System.out.println();
                System.out.println("Dealer total value: " + dtotalValue);
                System.out.println("Dealer busted. You win!");
            }
            
//          Play again?
            System.out.println();
            System.out.println("Play again? (y/n)");
            String playAgain = keyboard.nextLine();
            
            if (playAgain.equals("n"))
            {
                play = false;
                System.out.println();
                System.out.println("Good game. Goodbye!");
            }
            else if (playAgain.equals("y"))
            {
                play = true;
            }
            else
            {
                System.out.println("Invalid input! Try again.");
            }
        
        }
    }
}

//      Issues with the game
//      - The cards in the game are not only from 1 deck so card repetition can occur
