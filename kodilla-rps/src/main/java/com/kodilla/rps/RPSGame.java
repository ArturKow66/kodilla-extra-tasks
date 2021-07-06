package com.kodilla.rps;

public class RPSGame {
    private int gameCounter;
    private int rpsComputerChoiceInt;
    private int winner;
    private boolean closeThisGame = false;
    private boolean isRoundFinish = false;
    private boolean isThisGame = false;

    InGameMenuDisplay inGameMenuDisplay = new InGameMenuDisplay();
    InGameChoice inGameChoice = new InGameChoice();
    InGameChoiceDisplay inGameChoiceDisplay = new InGameChoiceDisplay();
    LogicEngine logicEngine = new LogicEngine();
    ScoreKeeperDisplay scoreKeeperDisplay = new ScoreKeeperDisplay();

    public void runGame(int gameVersion, int numberOfWins) {
        while (!isRoundFinish) {
            gameCounter++;

            while (!isThisGame){
                char rpsPlayerChoiceChar = inGameMenuDisplay.runInGameMenu(gameVersion, gameCounter);
                InGameChoiceInfo inGameChoiceInfo = inGameChoice.runInGameChoice(gameVersion, rpsPlayerChoiceChar);

                if(inGameChoiceInfo.isOptionInteger()) {
                    rpsComputerChoiceInt = inGameChoiceDisplay.runInGameChoiceDisplay(gameVersion, inGameChoiceInfo.getPlayerChoiceString());
                    winner = logicEngine.runLogicEngine(inGameChoiceInfo.getRpsPlayerChoiceInt(), rpsComputerChoiceInt);
                    isThisGame = true;
                }
            }
            isRoundFinish = scoreKeeperDisplay.runScoreKeeper(winner, numberOfWins);
            isThisGame = !isThisGame;
        }
    }
}
