package com.kodilla.rps;

import com.kodilla.rps.strings.RPSGameStrings;

import java.util.ArrayList;

public class InGameChoice {
    private String playerChoice;
    private int gameCounter;
    private int returnWinsCounter;
    private int rpsPlayerChoiceInt;



    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    RPSGame5 rpsGame5 = new RPSGame5();


    public int runInGameChoice(int gameVersion, int numberOfWins, char rpsPlayerChoiceChar) {
        try {
            rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
        } catch (NullPointerException a) {
            System.out.println();
        }

        ArrayList<Object> choicesArrayList = new ArrayList<>();
        if (gameVersion == 1) {
            for (int i = 0; i<3 ; i++) {
                choicesArrayList.add(i +1);
            }
        } else if (gameVersion == 2) {
            for (int i = 0; i<5 ; i++) {
                choicesArrayList.add(i +1);
            }
        }


        if (choicesArrayList.contains(rpsPlayerChoiceInt)) {
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
                case '4':
                    if (gameVersion == 2) {
                        playerChoice = rpsGameStrings.SPOCK_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    }
                    break;
                case '5':
                    if (gameVersion == 2) {
                        playerChoice = rpsGameStrings.LIZARD_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    }
                    break;

                case 'n':
                    //menuChoice.runMenuChoice('n');
                    gameCounter = 0;
                    returnWinsCounter = 0;
                    rpsGame5.runGame5(gameVersion, numberOfWins);
                    break;
                case 'x':
                    /*
                    isThisGame = true;
                    isRoundFinish = true;
                    rpsComputerChoiceInt = 0;
                    rpsPlayerChoiceInt = 0;
                    closeThisGame = true;*/
                    break;
                default:
                    /*gameCounter = gameCounter - 1;
                    runGame5(gameVersion, numberOfWins);*/
                    break;
            }
        }
        return rpsPlayerChoiceInt;
    }
}
