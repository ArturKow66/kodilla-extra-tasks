package com.kodilla.rps;

public class NewGameRunner {

    public void runNewGame(int gameVersion, int howManyWins) {
        RPSGame rpsGame = new RPSGame();
        rpsGame.runGame(gameVersion, howManyWins);
    }
}
