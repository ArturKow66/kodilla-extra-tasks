package com.kodilla.rps;

public class RPSRunner {

    public static void main(String[] args){

        boolean isGameEnd = false;
        boolean isTheEnd;
        int chosenOption;

        while (!isGameEnd) {
            MainMenu mainMenu = new MainMenu(0);
            isTheEnd = false;

            while (!isTheEnd) {
                chosenOption = mainMenu.runMainMenu();
                NewGameCreator newGame = new NewGameCreator(false, false, new Player("", 0));

                switch (chosenOption) {
                    case 1:
                        newGame.createNewGameStep1();
                        newGame.createNewGameStep2();
                        newGame.runNewGame3();
                        break;
                    case 2:
                        newGame.createNewGameStep1();
                        newGame.createNewGameStep2();
                        newGame.runNewGame5();
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
