package com.kodilla.rps;

public class RPSRunner {

    private boolean close() {
        return true;
    }

    public static void main(String[] args){

        boolean isGameEnd = false;

        while (!isGameEnd) {
            RPSRunner theGame = new RPSRunner();
            MainMenu mainMenu = new MainMenu(0);
            int chosenOption = mainMenu.runMainMenu();

            switch (chosenOption) {
                case 1:
                    NewGameCreator newGame = new NewGameCreator(false, false, new Player("", 0));
                    newGame.createNewGameStep1();
                    newGame.createNewGameStep2();
                    newGame.runNewGame();
                    break;
                case 2:
                    isGameEnd = theGame.close();
                    break;
            }
        }
    }
}
