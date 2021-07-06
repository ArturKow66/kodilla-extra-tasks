package com.kodilla.rps;

public class InGameChoiceInfo {
    private boolean isReset;
    private boolean isExit;
    private boolean isRepeat;
    private boolean isOptionInteger;
    private int rpsPlayerChoiceInt;
    private String playerChoiceString;

    public InGameChoiceInfo(boolean isReset, boolean isExit, boolean isRepeat, boolean isOptionInteger, int rpsPlayerChoiceInt, String playerChoiceString) {
        this.isReset = isReset;
        this.isExit = isExit;
        this.isRepeat = isRepeat;
        this.isOptionInteger = isOptionInteger;
        this.rpsPlayerChoiceInt = rpsPlayerChoiceInt;
        this.playerChoiceString = playerChoiceString;
    }

    public boolean isReset() {
        return isReset;
    }

    public boolean isExit() {
        return isExit;
    }

    public boolean isRepeat() {
        return isRepeat;
    }

    public boolean isOptionInteger() {
        return isOptionInteger;
    }

    public int getRpsPlayerChoiceInt() {
        return rpsPlayerChoiceInt;
    }

    public String getPlayerChoiceString() {
        return playerChoiceString;
    }
}
/*
case 'n':
        menuChoice.runMenuChoice('n');
        gameCounter = 0;
        returnWinsCounter = 0;
        rpsGame.runGame(gameVersion, numberOfWins);
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
        runGame5(gameVersion, numberOfWins);
        break;

 */