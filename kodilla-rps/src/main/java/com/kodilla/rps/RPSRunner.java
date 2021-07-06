package com.kodilla.rps;

public class RPSRunner {

    public static void main(String[] args){

        boolean isGameEnd = false;
        boolean isTheEnd;
        int chosenOption;

        while (!isGameEnd) {
            MainMenuDisplay mainMenuDisplay = new MainMenuDisplay(0);
            isTheEnd = false;

            while (!isTheEnd) {
                chosenOption = mainMenuDisplay.runMainMenu();
                NewGameCreator newGame = new NewGameCreator(false, false, new Player("", 0));
                NewGameRunner newGameRunner = new NewGameRunner();

                switch (chosenOption) {
                    case 1:
                    case 2:
                        newGame.createNewGameStep1();
                        int howManyWins = newGame.createNewGameStep2();
                        newGameRunner.runNewGame(chosenOption, howManyWins);
                        break;
                    case 3:
                        isTheEnd = true;
                        isGameEnd = true;
                        break;
                }
            }
        }
    }
}
