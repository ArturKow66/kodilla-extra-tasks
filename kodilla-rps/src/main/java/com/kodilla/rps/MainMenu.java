package com.kodilla.rps;

import com.kodilla.rps.strings.MainMenuOptionsStrings;

import java.util.Scanner;

public class MainMenu {

    public int chosenOption;
    private static boolean isOptionChosen = false;
    MainMenuOptionsStrings mainMenuOptionsStrings = new MainMenuOptionsStrings();
    Scanner scanner = new Scanner(System.in);


    public MainMenu(int chosenOption) {
        this.chosenOption = chosenOption;
    }

    public int runMainMenu() {
        while (!isOptionChosen) {
            System.out.println(mainMenuOptionsStrings.welcomeString());

            while (!isOptionChosen) {
                System.out.println(mainMenuOptionsStrings.optionNewGameString());
                System.out.println(mainMenuOptionsStrings.optionExitString());
                MainMenu.this.chosenOption = scanner.nextInt();

                switch (chosenOption) {
                    case 1:
                        System.out.println(mainMenuOptionsStrings.newGameString());
                        isOptionChosen = true;
                        break;
                    case 2:
                        System.out.println(mainMenuOptionsStrings.exitGameString());
                        isOptionChosen = true;
                        break;
                    default:
                        System.out.println(mainMenuOptionsStrings.choiceString());
                }
            }
        }
        return chosenOption;
    }
}
