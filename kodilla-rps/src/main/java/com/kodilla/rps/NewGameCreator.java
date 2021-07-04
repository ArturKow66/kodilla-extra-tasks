package com.kodilla.rps;

import com.kodilla.rps.strings.NewGameStrings;

import java.util.Scanner;

public class NewGameCreator {

    private boolean isThereName;
    private boolean isThereNumber;
    private Player player;
    private int howManyWins;

    NewGameStrings newGameStrings = new NewGameStrings();
    Scanner scanner = new Scanner(System.in);

    public NewGameCreator() {
    }

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean createNewGameStep1() {
        while (!isThereName()) {
            if (!isThereName()) {
                System.out.println(newGameStrings.enterNameString());
                String playerName = scanner.nextLine();
                player.setPlayerName(playerName);
                System.out.println(newGameStrings.helloPlayerString() + player.getPlayerName());
                NewGameCreator.this.setThereName(true);
            } else {
                System.out.println(newGameStrings.ifNoNameString());
            }
        }
        return NewGameCreator.this.setThereName(true);
    }
    public boolean createNewGameStep2() {
        while (!isThereNumber()) {
            if (!isThereNumber()) {
                System.out.println(newGameStrings.howManyWinsString());
                player.setNumberOfWins(scanner.nextInt());
                int k = player.getNumberOfWins();

                if (k > 0) {                                                  //try to catch?
                    System.out.println(newGameStrings.numberOfWinsString() + k );
                    howManyWins = k;
                    NewGameCreator.this.setThereNumber(true);
                } else {
                    System.out.println(newGameStrings.ifNoWinsString());
                }
            }
        }
        return isThereNumber;
    }

    public void runNewGame() {
        RSPGame rspGame = new RSPGame();
        rspGame.runGame(howManyWins);
    }
}
