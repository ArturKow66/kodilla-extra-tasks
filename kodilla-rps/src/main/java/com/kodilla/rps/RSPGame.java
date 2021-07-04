package com.kodilla.rps;

import com.kodilla.rps.strings.RPSGameStrings;

import java.util.Random;
import java.util.Scanner;

public class RSPGame {

    private double playerWinsCounter;
    private double computerWinsCounter;
    public int gameCounter;
    private boolean isRoundFinish = false;
    private boolean isThisGame = false;

    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    public void runGame(int numberOfWins) {
        while (!isRoundFinish) {
            gameCounter++;

            while (!isThisGame){
                System.out.println("\n" + "\n" +
                        rpsGameStrings.gameCountString() + gameCounter + "\n" +
                        rpsGameStrings.gameChoseString() + "\n"+
                        rpsGameStrings.rockString() + "\n" +
                        rpsGameStrings.paperString() + "\n" +
                        rpsGameStrings.scissorsString());

                int rpsPlayerChoice = scanner.nextInt();
                int rpsComputerChoice = random.nextInt(3) + 1;

                String playerChoice = "";

                switch (rpsPlayerChoice) {
                    case 1:
                        playerChoice = rpsGameStrings.rockString();
                        break;
                    case 2:
                        playerChoice = rpsGameStrings.paperString();
                        break;
                    case 3:
                        playerChoice = rpsGameStrings.scissorsString();
                        break;
                }
                System.out.println(rpsGameStrings.yourChoiceString() + playerChoice);

                switch (rpsPlayerChoice) {
                    case 1:
                        switch (rpsComputerChoice) {
                            case 1:
                                System.out.println(rpsGameStrings.tieString());
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.computerWinString());
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.youWinString());
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                        }
                        isThisGame = true;
                        break;
                    case 2:
                        switch (rpsComputerChoice) {
                            case 1:
                                System.out.println(rpsGameStrings.youWinString());
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.tieString());
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.computerWinString());
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                        }
                        isThisGame = true;
                        break;
                    case 3:
                        switch (rpsComputerChoice) {
                            case 1:
                                System.out.println(rpsGameStrings.computerWinString());
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.youWinString());
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.tieString());
                                break;
                        }
                        isThisGame = true;
                        break;
                }
            }
            
            if (playerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.youWonString());
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                isRoundFinish = true;
            } else if (computerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.youLostString());
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                isRoundFinish = true;
            } else {
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                isThisGame = false;
            }
        }
    }
}
