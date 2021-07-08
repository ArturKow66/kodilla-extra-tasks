package com.kodilla.rps.game.inGame;

public class InGameChoiceInfoLogic {
    private boolean isReset;
    private boolean isExit;
    private boolean isRepeat;
    private boolean isOptionInteger;


    public InGameChoiceInfoLogic
            (
                    boolean isReset,
                    boolean isExit,
                    boolean isRepeat,
                    boolean isOptionInteger
            ) {
        this.isReset = isReset;
        this.isExit = isExit;
        this.isRepeat = isRepeat;
        this.isOptionInteger = isOptionInteger;
    }

    public boolean isReset() {
        return isReset;
    }

    public void setIsReset(boolean reset) {
        isReset = reset;
    }

    public boolean isExit() {
        return isExit;
    }

    public void setIsExit(boolean exit) {
        isExit = exit;
    }

    public boolean isRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean repeat) {
        isRepeat = repeat;
    }

    public boolean isOptionInteger() {
        return isOptionInteger;
    }

    public void setIsOptionInteger(boolean optionInteger) {
        isOptionInteger = optionInteger;
    }

}