package com.kodilla.rps;

import com.kodilla.rps.strings.MainMenuOptionsStrings;

public class MainMenu {

    public int chosenOption;

    MainMenuOptionsStrings mainMenuOptionsStrings = new MainMenuOptionsStrings();
    KeyboardReader keyboardReader = new KeyboardReader();

    public MainMenu(int chosenOption) {
        this.chosenOption = chosenOption;
    }

    public int runMainMenu() {
        boolean isOptionChosen = false;
        while (!isOptionChosen) {
            System.out.println("\n" + " -*****- " + "\n" + mainMenuOptionsStrings.welcomeString());

            while (!isOptionChosen) {
                System.out.println(
                        mainMenuOptionsStrings.optionGame3String() + "\n" +
                        mainMenuOptionsStrings.optionGame5String() + "\n" +
                        mainMenuOptionsStrings.optionExitString() + "\n"
                );
                MainMenu.this.chosenOption = Integer.parseInt(keyboardReader.readKeyboard());

                switch (chosenOption) {
                    case 1:
                    case 2:
                        System.out.println("\n" + mainMenuOptionsStrings.newPlayerString());
                        isOptionChosen = true;
                        break;
                    case 3:
                        System.out.println("\n" + mainMenuOptionsStrings.exitGameString());
                        isOptionChosen = true;
                        break;
                    default:
                        System.out.println("\n" + mainMenuOptionsStrings.choiceString());
                }
            }
        }
        return chosenOption;
    }
}
