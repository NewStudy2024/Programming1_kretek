import java.util.Random;
import java.util.Scanner;

public class Main{
    private static int boardSize = 10;
    private static int snakeX, snakeY, foodX, foodY;
    private static int score = 0;
    private static char[][] board;
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeGame();

        while (true) {
            printBoard();
            System.out.print("Move (WASD): ");
            char move = scanner.next().charAt(0);

            if (!moveSnake(move)) {
                System.out.println("Game Over! Final Score: " + score);
                break;
            }
        }
        scanner.close();
    }

    private static void initializeGame() {
        board = new char[boardSize][boardSize];
        snakeX = boardSize / 2;
        snakeY = boardSize / 2;
        placeFood();
    }

    private static void placeFood() {
        do {
            foodX = random.nextInt(boardSize);
            foodY = random.nextInt(boardSize);
        } while (foodX == snakeX && foodY == snakeY);
    }

    private static boolean moveSnake(char direction) {
        switch (Character.toUpperCase(direction)) {
            case 'W': snakeX--; break;
            case 'S': snakeX++; break;
            case 'A': snakeY--; break;
            case 'D': snakeY++; break;
            default: return true;
        }

        if (snakeX < 0 || snakeX >= boardSize || snakeY < 0 || snakeY >= boardSize) {
            return false;
        }

        if (snakeX == foodX && snakeY == foodY) {
            score++;
            placeFood();
        }

        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (i == snakeX && j == snakeY) {
                    System.out.print("S ");
                } else if (i == foodX && j == foodY) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + score);
    }
}
