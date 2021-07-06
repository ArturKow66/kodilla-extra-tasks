package com.kodilla.rps;

import com.kodilla.rps.strings.RPSGameStrings;
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

    @Test
    public void testNewPlayer() {
        //Given
        Player player1 = new Player("Artur", 5);

        //When
        //Then
        Assertions.assertEquals("Artur", player1.getPlayerName());
        Assertions.assertEquals(5, player1.getNumberOfWins());

    }

    @Test
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

    @Test
    public void testReadKeyboard() {
        //Given
        KeyboardReader keyboardReader= new KeyboardReader();

        //When
        System.out.println("Enter: As");
        String as = keyboardReader.readKeyboard();                      //jak przetestować input z klawiatury?

        //Then
        //Assertions.assertEquals("As", as);
    }

    @Test
    public void testCreateGameStep2() {
        //Given
        NewGameCreator newGameCreator = new NewGameCreator(false, false, new Player("", 0));

        //When
        System.out.println("Input: 3");
        int newGameStep2 = newGameCreator.createNewGameStep2();         //jak przetestować input z klawiatury?

        //Then
        //Assertions.assertEquals(3, newGameStep2);

    }

    @Test
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


        InGameChoiceInfo inGameChoiceInfo1 = inGameChoice.runInGameChoice(gameVersion1, playerChoice1);
        InGameChoiceInfo inGameChoiceInfo2 = inGameChoice.runInGameChoice(gameVersion1, playerChoice2);
        InGameChoiceInfo inGameChoiceInfo3 = inGameChoice.runInGameChoice(gameVersion1, playerChoice3);
        InGameChoiceInfo inGameChoiceInfo4 = inGameChoice.runInGameChoice(gameVersion2, playerChoice1);
        InGameChoiceInfo inGameChoiceInfo5 = inGameChoice.runInGameChoice(gameVersion2, playerChoice2);
        InGameChoiceInfo inGameChoiceInfo6 = inGameChoice.runInGameChoice(gameVersion2, playerChoice3);
        InGameChoiceInfo inGameChoiceInfo7 = inGameChoice.runInGameChoice(gameVersion2, playerChoice4);
        InGameChoiceInfo inGameChoiceInfo8 = inGameChoice.runInGameChoice(gameVersion2, playerChoice5);
        //InGameChoiceInfo inGameChoiceInfo9 = inGameChoice.runInGameChoice(gameVersion1, playerChoice4);
        //InGameChoiceInfo inGameChoiceInfo10 = inGameChoice.runInGameChoice(gameVersion1, playerChoice5);

        InGameChoiceInfo inGameChoiceInfoX = inGameChoice.runInGameChoice(gameVersion1, playerChoiceX);
        InGameChoiceInfo inGameChoiceInfoN = inGameChoice.runInGameChoice(gameVersion1, playerChoiceN);


        String playerChoiceString1 = inGameChoiceInfo1.getPlayerChoiceString();
        String playerChoiceString2 = inGameChoiceInfo2.getPlayerChoiceString();
        String playerChoiceString3 = inGameChoiceInfo3.getPlayerChoiceString();
        String playerChoiceString4 = inGameChoiceInfo4.getPlayerChoiceString();
        String playerChoiceString5 = inGameChoiceInfo5.getPlayerChoiceString();
        String playerChoiceString6 = inGameChoiceInfo6.getPlayerChoiceString();
        String playerChoiceString7 = inGameChoiceInfo7.getPlayerChoiceString();
        String playerChoiceString8 = inGameChoiceInfo8.getPlayerChoiceString();
        //String playerChoiceString9 = inGameChoiceInfo9.getPlayerChoiceString();
        //String playerChoiceString10 = inGameChoiceInfo10.getPlayerChoiceString();


        boolean isExit = inGameChoiceInfoX.isExit();
        boolean isReset = inGameChoiceInfoN.isReset();

        String playerChoiceStringExpected1 = rpsGameStrings.ROCK_STRING;
        String playerChoiceStringExpected2 = rpsGameStrings.PAPER_STRING;
        String playerChoiceStringExpected3 = rpsGameStrings.SCISSORS_STRING;
        String playerChoiceStringExpected4 = rpsGameStrings.ROCK_STRING;
        String playerChoiceStringExpected5 = rpsGameStrings.PAPER_STRING;
        String playerChoiceStringExpected6 = rpsGameStrings.SCISSORS_STRING;
        String playerChoiceStringExpected7 = rpsGameStrings.SPOCK_STRING;
        String playerChoiceStringExpected8 = rpsGameStrings.LIZARD_STRING;
        //String playerChoiceStringExpected9 = rpsGameStrings.SPOCK_STRING;
        //String playerChoiceStringExpected10 = rpsGameStrings.LIZARD_STRING;

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
        Assertions.assertEquals(playerChoiceStringExpected8, playerChoiceString8);
        //Assertions.assertEquals(playerChoiceStringExpected9, playerChoiceString9);
        //Assertions.assertEquals(playerChoiceStringExpected10, playerChoiceString10);

        Assertions.assertEquals(isExitExpected, isExit);
        Assertions.assertEquals(isResetExpected, isReset);

    }

    @Test
    public void testStartNewGame() {
        //Given

        //When

        //Then

    }
}
