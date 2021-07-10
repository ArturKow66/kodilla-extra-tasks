package com.kodilla.rps;

import com.kodilla.rps.game.NewGameCreator;
import com.kodilla.rps.game.inGame.InGameChoice;
import com.kodilla.rps.game.inGame.InGameChoiceInfoLogic;
import com.kodilla.rps.game.inGame.display.strings.RPSGameStrings;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RPSRunnerTestSuite {
    int counter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @BeforeEach
    public void before() {
        counter += 1;
        System.out.println("Test nr: " + counter);
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: End");
    }

    @Test//ok
    public void testNewPlayer() {
        //Given
        Player player1 = new Player("Artur", 5);

        //When
        //Then
        Assertions.assertEquals("Artur", player1.getPlayerName());
        Assertions.assertEquals(5, player1.getNumberOfWins());

    }

    @Test//ok
    public void testIsOptionInteger() {
        //Given
        InGameChoice inGameChoice = new InGameChoice();

        //When
        boolean isOptionInteger1 = inGameChoice.isOptionInteger('1');
        boolean isOptionInteger2 = inGameChoice.isOptionInteger('a');

        //Then
        Assertions.assertEquals(true, isOptionInteger1);
        Assertions.assertNotEquals(true, isOptionInteger2);

    }

    @Test//?
    public void testReadKeyboard() {
        //Given
        KeyboardReader keyboardReader= new KeyboardReader();

        //When
        System.out.println("Enter: As");
        //String as = keyboardReader.readKeyboard();                      //jak przetestować input z klawiatury?

        //Then
        //Assertions.assertEquals("As", as);
    }

    @Test//?
    public void testCreateGameStep2() {
        //Given
        NewGameCreator newGameCreator = new NewGameCreator(false, false, new Player("", 0));

        //When
        System.out.println("Input: 3");
        //int newGameStep2 = newGameCreator.createNewGameStep2();         //jak przetestować input z klawiatury?

        //Then
        //Assertions.assertEquals(3, newGameStep2);

    }

    @Test//p -2
    public void testRunInGameChoice() {
        //Given
        InGameChoice inGameChoice = new InGameChoice();
        RPSGameStrings rpsGameStrings = new RPSGameStrings();

        //When
        int gameVersion1 = 1;
        int gameVersion2 = 2;

        char playerChoice1 = '1';
        char playerChoice2 = '2';
        char playerChoice3 = '3';
        char playerChoice4 = '4';
        char playerChoice5 = '5';

        char playerChoiceX = 'x';
        char playerChoiceN = 'n';

/*
        InGameChoiceInfoLogic inGameChoiceInfoLogic1 = inGameChoice.runInGameChoice(gameVersion1, playerChoice1);
        InGameChoiceInfoLogic inGameChoiceInfoLogic2 = inGameChoice.runInGameChoice(gameVersion1, playerChoice2);
        InGameChoiceInfoLogic inGameChoiceInfoLogic3 = inGameChoice.runInGameChoice(gameVersion1, playerChoice3);
        InGameChoiceInfoLogic inGameChoiceInfoLogic4 = inGameChoice.runInGameChoice(gameVersion2, playerChoice1);
        InGameChoiceInfoLogic inGameChoiceInfoLogic5 = inGameChoice.runInGameChoice(gameVersion2, playerChoice2);
        InGameChoiceInfoLogic inGameChoiceInfoLogic6 = inGameChoice.runInGameChoice(gameVersion2, playerChoice3);
        InGameChoiceInfoLogic inGameChoiceInfoLogic7 = inGameChoice.runInGameChoice(gameVersion2, playerChoice4);
        InGameChoiceInfoLogic inGameChoiceInfoLogic8 = inGameChoice.runInGameChoice(gameVersion2, playerChoice5);
        InGameChoiceInfoLogic inGameChoiceInfoLogic9 = inGameChoice.runInGameChoice(gameVersion1, playerChoice4);
        InGameChoiceInfoLogic inGameChoiceInfoLogic10 = inGameChoice.runInGameChoice(gameVersion1, playerChoice5);

        InGameChoiceInfoLogic inGameChoiceInfoLogicX = inGameChoice.runInGameChoice(gameVersion1, playerChoiceX);
        InGameChoiceInfoLogic inGameChoiceInfoLogicN = inGameChoice.runInGameChoice(gameVersion1, playerChoiceN);


        String playerChoiceString1 = inGameChoiceInfoLogic1.getPlayerChoiceString();
        String playerChoiceString2 = inGameChoiceInfoLogic2.getPlayerChoiceString();
        String playerChoiceString3 = inGameChoiceInfoLogic3.getPlayerChoiceString();
        String playerChoiceString4 = inGameChoiceInfoLogic4.getPlayerChoiceString();
        String playerChoiceString5 = inGameChoiceInfoLogic5.getPlayerChoiceString();
        String playerChoiceString6 = inGameChoiceInfoLogic6.getPlayerChoiceString();
        String playerChoiceString7 = inGameChoiceInfoLogic7.getPlayerChoiceString();
        String playerChoiceString8 = inGameChoiceInfoLogic8.getPlayerChoiceString();
        String playerChoiceString9 = inGameChoiceInfoLogic9.getPlayerChoiceString();
        String playerChoiceString10 = inGameChoiceInfoLogic10.getPlayerChoiceString();


        boolean isExit = inGameChoiceInfoLogicX.isExit();
        boolean isReset = inGameChoiceInfoLogicN.isReset();

        String playerChoiceStringExpected1 = rpsGameStrings.ROCK_STRING;
        String playerChoiceStringExpected2 = rpsGameStrings.PAPER_STRING;
        String playerChoiceStringExpected3 = rpsGameStrings.SCISSORS_STRING;
        String playerChoiceStringExpected4 = rpsGameStrings.ROCK_STRING;
        String playerChoiceStringExpected5 = rpsGameStrings.PAPER_STRING;
        String playerChoiceStringExpected6 = rpsGameStrings.SCISSORS_STRING;
        String playerChoiceStringExpected7 = rpsGameStrings.SPOCK_STRING;
        String playerChoiceStringExpected8 = rpsGameStrings.LIZARD_STRING;
        String playerChoiceStringNotExpected1 = rpsGameStrings.SPOCK_STRING;
        String playerChoiceStringNotExpected2 = rpsGameStrings.LIZARD_STRING;

        boolean isResetExpected = true;
        boolean isExitExpected = true;

        //Then
        Assertions.assertEquals(playerChoiceStringExpected1, playerChoiceString1);
        Assertions.assertEquals(playerChoiceStringExpected2, playerChoiceString2);
        Assertions.assertEquals(playerChoiceStringExpected3, playerChoiceString3);
        Assertions.assertEquals(playerChoiceStringExpected4, playerChoiceString4);
        Assertions.assertEquals(playerChoiceStringExpected5, playerChoiceString5);
        Assertions.assertEquals(playerChoiceStringExpected6, playerChoiceString6);
        Assertions.assertEquals(playerChoiceStringExpected7, playerChoiceString7);
        //Assertions.assertEquals(playerChoiceStringExpected8, playerChoiceString8);

        System.out.println(playerChoiceString9);
        Assertions.assertNotEquals(playerChoiceStringNotExpected1, playerChoiceString9);
        System.out.println(playerChoiceString10);
        //Assertions.assertNotEquals(playerChoiceStringNotExpected2, playerChoiceString10);

        Assertions.assertEquals(isExitExpected, isExit);
        Assertions.assertEquals(isResetExpected, isReset);
*/
    }

    @Test//ok
    public void testRepeatInGameChoice() {
   /*     //Given
        InGameChoiceInfoLogic inGameChoiceInfoLogic = new InGameChoiceInfoLogic(false, false, false, false, 4,null);

        //When
        boolean isRepeatExpected = true;
        int rpsPlayerChoiceInt = 0;
        String playerChoiceString = "";
        inGameChoiceInfoLogic.repeatInGameChoice();

        //Then
        Assertions.assertEquals(isRepeatExpected, inGameChoiceInfoLogic.isRepeat());
        Assertions.assertEquals(rpsPlayerChoiceInt, inGameChoiceInfoLogic.getRpsPlayerChoiceInt());
        Assertions.assertEquals(playerChoiceString, inGameChoiceInfoLogic.getPlayerChoiceString());*/
    }
}