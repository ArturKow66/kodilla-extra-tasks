package com.kodilla.sudoku;

public class SudokuGame {

    public boolean resolveSudoku() {
        return true;
    }

    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
