public class SimpleWinningStrategy implements WinningStrategy {
    @Override
    public boolean isWin(char[][] board, char player) {
        // Verifica se o jogador 'player' venceu com uma linha horizontal
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Verifica se o jogador 'player' venceu com uma linha vertical
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Verifica se o jogador 'player' venceu com uma diagonal
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
}
