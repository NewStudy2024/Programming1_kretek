import java.util.Scanner;

public class Main {
    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        for (int turn = 0; turn < 9; turn++) {
            int row, col;
            while (true) {
                System.out.print("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static void printBoard() {
        System.out.println("\nBoard:");
        for (char[] row : board) {
            System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        }
        System.out.println();
    }

    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
        return false;
    }
}
