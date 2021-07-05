package com.kodilla.rps;

import com.kodilla.rps.strings.NewGameStrings;

public class NewGameCreator {

    private boolean isThereName;
    private boolean isThereNumber;
    private Player player;
    private int howManyWins;

    NewGameStrings newGameStrings = new NewGameStrings();
    KeyboardReader keyboardReader = new KeyboardReader();

    public NewGameCreator(boolean isThereName, boolean isThereNumber, Player player) {
        this.isThereName = isThereName;
        this.isThereNumber = isThereNumber;
        this.player = player;
    }

    public boolean isThereName() {
        return isThereName;
    }

    public boolean setThereName(boolean thereName) {
        isThereName = thereName;
        return thereName;
    }

    public boolean isThereNumber() {
        return isThereNumber;
    }

    public void setThereNumber(boolean thereNumber) {
        isThereNumber = thereNumber;
    }

    public boolean createNewGameStep1() {
        while (!isThereName()) {
            if (!isThereName()) {
                System.out.println(newGameStrings.ENTER_NAME_STRING);
                String playerName = keyboardReader.readKeyboard();
                player.setPlayerName(playerName);
                System.out.println(newGameStrings.HELLO_PLAYER_STRING + player.getPlayerName());
                NewGameCreator.this.setThereName(true);
            } else {
                System.out.println(newGameStrings.IF_NO_NAME_STRING);
            }
        }
        return NewGameCreator.this.setThereName(true);
    }
    public boolean createNewGameStep2() {
        while (!isThereNumber()) {
            if (!isThereNumber()) {
                System.out.println(newGameStrings.HOW_MANY_WINS_STRING);
                player.setNumberOfWins(Integer.parseInt(keyboardReader.readKeyboard()));
                int k = player.getNumberOfWins();

                if (k > 0) {                                                  //try to catch?
                    System.out.println(newGameStrings.NUMBER_OF_WINS_STRING + k );
                    howManyWins = k;
                    NewGameCreator.this.setThereNumber(true);
                } else {
                    System.out.println(newGameStrings.IF_NO_WINS_TO_PLAY_STRING);
                }
            }
        }
        return isThereNumber;
    }

    public int runNewGame3() {
        RPPGame3 rppGame3 = new RPPGame3();
        return rppGame3.runGame3(howManyWins);
    }

    public int runNewGame5() {
        RPSGame5 rpsGame5 = new RPSGame5();
        return rpsGame5.runGame5(howManyWins);
    }
}
