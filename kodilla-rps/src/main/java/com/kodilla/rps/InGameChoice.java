package com.kodilla.rps;

import com.kodilla.rps.strings.RPSGameStrings;


public class InGameChoice {
    private String playerChoiceString;
    private int rpsPlayerChoiceInt = 0;
    private int numberOfOptions;
    private boolean isReset;
    private boolean isExit;
    private boolean isRepeat;
    private boolean isOptionInteger;


    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    InGameChoiceInfo inGameChoiceInfo = new InGameChoiceInfo(false, false, false, false, 0, "");

    public boolean isOptionInteger(char rpsPlayerChoiceChar) {
        try {
            rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
            isOptionInteger = true;
        } catch (Exception a) {
            System.out.println("Exception: " + a);
            isOptionInteger = false;
        }
        return isOptionInteger;
    }

    public InGameChoiceInfo runInGameChoice(int gameVersion, char rpsPlayerChoiceChar) {

        if (gameVersion == 1) {
            numberOfOptions = 3;
        } else if (gameVersion == 2) {
            numberOfOptions = 5;
        }

        isOptionInteger = isOptionInteger(rpsPlayerChoiceChar);

        if (isOptionInteger) {
            if (rpsPlayerChoiceInt <= numberOfOptions) {
                switch (rpsPlayerChoiceChar) {
                    case '1':
                        playerChoiceString = rpsGameStrings.ROCK_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '2':
                        playerChoiceString = rpsGameStrings.PAPER_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '3':
                        playerChoiceString = rpsGameStrings.SCISSORS_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '4':
                        playerChoiceString = rpsGameStrings.SPOCK_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                    case '5':
                        playerChoiceString = rpsGameStrings.LIZARD_STRING;
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        break;
                }
            }
        } else {
            switch (rpsPlayerChoiceChar) {
                case 'n':
                    isReset = true;
                    break;
                case 'x':
                    isExit = true;
                    break;
                default:
                    isRepeat = true;
                    break;
            }
        }
        return inGameChoiceInfo = new InGameChoiceInfo(isReset, isExit, isRepeat, isOptionInteger, rpsPlayerChoiceInt, playerChoiceString);
    }
}