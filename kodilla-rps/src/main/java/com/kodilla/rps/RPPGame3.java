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
    KeyboardReader keyboardReader = new KeyboardReader();
    
    public int runGame3(int numberOfWins) {
        while (!isRoundFinish) {
            gameCounter++;


            while (!isThisGame){
                System.out.println("\n" + "\n" +
                        rpsGameStrings.gameCountString() + gameCounter + "\n" +
                        rpsGameStrings.gameChoseString() + "\n"+
                        rpsGameStrings.rockString() + "\n" +
                        rpsGameStrings.paperString() + "\n" +
                        rpsGameStrings.scissorsString() + "\n" + "\n" +
                        rpsGameStrings.stopGame() + "\n" +
                        rpsGameStrings.resetGame()
                );

                String playerChoice = "";
                String computerChoice = "";
                int rpsPlayerChoiceInt = 0;
                char[] rpsPlayerChoiceList = keyboardReader.readKeyboardToChar();
                char rpsPlayerChoiceChar = rpsPlayerChoiceList[0];
                int rpsComputerChoiceInt = random.nextInt(3) + 1;


                switch (rpsPlayerChoiceChar) {
                    case '1':
                        playerChoice = rpsGameStrings.rockString();
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '2':
                        playerChoice = rpsGameStrings.paperString();
                        rpsPlayerChoiceInt = Integer.valueOf(rpsPlayerChoiceChar);
                        break;
                    case '3':
                        playerChoice = rpsGameStrings.scissorsString();
                        rpsPlayerChoiceInt = Integer.valueOf(rpsPlayerChoiceChar);
                        break;
                    case 'n':
                        gameCounter = 0;
                        playerWinsCounter = 0;
                        computerWinsCounter = 0;
                        runGame3(numberOfWins);
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
                        runGame3(numberOfWins);
                        break;
                }

                switch (rpsComputerChoiceInt) {
                    case 1:
                        computerChoice = rpsGameStrings.rockString();
                        System.out.println(rpsGameStrings.yourChoiceString() + playerChoice + rpsGameStrings.computerChoiceString() + computerChoice);
                        break;
                    case 2:
                        computerChoice = rpsGameStrings.paperString();
                        System.out.println(rpsGameStrings.yourChoiceString() + playerChoice + rpsGameStrings.computerChoiceString() + computerChoice);
                        break;
                    case 3:
                        computerChoice = rpsGameStrings.scissorsString();
                        System.out.println(rpsGameStrings.yourChoiceString() + playerChoice + rpsGameStrings.computerChoiceString() + computerChoice);
                        break;
                    default:
                        break;
                }

                switch (rpsPlayerChoiceInt) {
                    case 1:
                        switch (rpsComputerChoiceInt) {
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
                        switch (rpsComputerChoiceInt) {
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
                        switch (rpsComputerChoiceInt) {
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
                    default:
                        break;
                }
            }
            
            if (playerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                System.out.println(rpsGameStrings.youWonString());
                isRoundFinish = true;
            } else if (computerWinsCounter == numberOfWins) {
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                System.out.println(rpsGameStrings.youLostString());
                isRoundFinish = true;
            } else if (closeThisGame) {
                System.out.println();
                return 0;
            } else {
                System.out.println(rpsGameStrings.scoreString() + playerWinsCounter + " : " + computerWinsCounter);
                isThisGame = false;
            }
        }
        return numberOfWins;
    }
}
