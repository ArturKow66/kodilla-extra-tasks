package com.kodilla.rps;

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
        counter = counter + 1;
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
    public void testResolute() {
        //Given

        //When

        //Then

    }

    @Test
    public void testScoreKeeper() {
        //Given

        //When

        //Then

    }

    @Test
    public void testNewRound() {
        //Given

        //When

        //Then

    }

    @Test
    public void testQuitGame() {
        //Given

        //When

        //Then

    }

    @Test
    public void testStartNewGame() {
        //Given

        //When

        //Then

    }
}
