import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        WinningStrategy winningStrategy = new SimpleWinningStrategy();
        GameObserver gameObserver = new GameConsoleObserver();

        GameState state;
        char currentPlayer = 'X'; // Começa com o jogador X

        while (!winningStrategy.isWin(board, currentPlayer)) {
            gameObserver.update(board);

            // Alternar entre os jogadores
            state = (currentPlayer == 'X') ? new XTurnState() : new OTurnState();
            state.handleInput(board, currentPlayer);

            // Trocar o jogador atual
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        gameObserver.update(board);
        System.out.println("Player " + currentPlayer + " venceu!");
    }
}
