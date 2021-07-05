package com.kodilla.rps;

import com.kodilla.rps.strings.RPSGameStrings;

import java.util.Random;

public class RPPGame3 {

    private double playerWinsCounter;
    private double computerWinsCounter;
    public int gameCounter;
    private boolean closeThisGame = false;
    private boolean isRoundFinish = false;
    private boolean isThisGame = false;

    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    Random random = new Random();
    InGameMenu inGameMenu = new InGameMenu();
    
    public int runGame3(int gameVersion, int numberOfWins) {
        while (!isRoundFinish) {
            gameCounter++;

            while (!isThisGame){
                String playerChoice = "";
                String computerChoice = "";
                int rpsPlayerChoiceInt = 0;
                int rpsComputerChoiceInt = random.nextInt(3) + 1;

                char rpsPlayerChoiceChar = inGameMenu.runInGameMenu(gameVersion, gameCounter);

                switch (rpsPlayerChoiceChar) {
                    case '1':
                        playerChoice = rpsGameStrings.ROCK_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '2':
                        playerChoice = rpsGameStrings.PAPER_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '3':
                        playerChoice = rpsGameStrings.SCISSORS_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case 'n':
                        gameCounter = 0;
                        playerWinsCounter = 0;
                        computerWinsCounter = 0;
                        runGame3(gameVersion, numberOfWins);
                        break;
                    case 'x':
                        isThisGame = true;
                        isRoundFinish = true;
                        rpsComputerChoiceInt = 0;
                        rpsPlayerChoiceInt = 0;
                        closeThisGame = true;
                        break;
                    default:
                        gameCounter = gameCounter - 1;
                        runGame3(gameVersion, numberOfWins);
                        break;
                }

                switch (rpsComputerChoiceInt) {
                    case 1:
                        computerChoice = rpsGameStrings.ROCK_STRING;
                        System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                        break;
                    case 2:
                        computerChoice = rpsGameStrings.PAPER_STRING;
                        System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                        break;
                    case 3:
                        computerChoice = rpsGameStrings.SCISSORS_STRING;
                        System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                        break;
                    default:
                        break;
                }

                switch (rpsPlayerChoiceInt) {
                    case 1:
                        switch (rpsComputerChoiceInt) {
                            case 1:
                                System.out.println(rpsGameStrings.TIE_STRING);
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.YOU_WIN_STRING);
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                        }
                        isThisGame = true;
                        break;
                    case 2:
                        switch (rpsComputerChoiceInt) {
                            case 1:
                                System.out.println(rpsGameStrings.YOU_WIN_STRING);
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.TIE_STRING);
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                        }
                        isThisGame = true;
                        break;
                    case 3:
                        switch (rpsComputerChoiceInt) {
                            case 1:
                                System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                                computerWinsCounter = computerWinsCounter + 1;
                                break;
                            case 2:
                                System.out.println(rpsGameStrings.YOU_WIN_STRING);
                                playerWinsCounter = playerWinsCounter + 1;
                                break;
                            case 3:
                                System.out.println(rpsGameStrings.TIE_STRING);
                                break;
                        }
                        isThisGame = true;
                        break;
                    default:
                        break;
                }
            }
            
            if (playerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
                System.out.println(rpsGameStrings.YOU_WON_GAME_STRING);
                isRoundFinish = true;
            } else if (computerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
                System.out.println(rpsGameStrings.YOU_LOST_GAME_STRING);
                isRoundFinish = true;
            } else if (closeThisGame) {
                System.out.println();
                return 0;
            } else {
                System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
                isThisGame = false;
            }
        }
        return numberOfWins;
    }
}
