import java.util.Scanner;

public class OTurnState implements GameState {
    @Override
    public void handleInput(char[][] board, char currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador O, é sua vez.");
        System.out.println("Por favor, digite a linha e coluna para jogar (por exemplo, 1 1 para linha 1, coluna 1):");

        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;

        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = 'O';
        } else {
            System.out.println("Jogada inválida. Por favor, tente novamente.");
            handleInput(board, currentPlayer); // Jogada inválida, solicita outra jogada
        }
    }
}
