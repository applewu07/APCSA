import java.util.Scanner;

public class TicTacToe {
    private static final int size = 3;
    private static final char empty = '-';
    private static char[][] board = new char[size][size];
    private static int round;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            initializeBoard();
            round = 1;
            boolean gameWon = false;
            char currentPlayer = 'X';

            while (!gameWon && round <= size * size) {
                displayBoard();
                System.out.println("Round " + round + ". Player " + currentPlayer + ", it's your move.");
                makeMove(scanner, currentPlayer);

                if (checkWin(currentPlayer)) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins! Congratulations!");
                    gameWon = true;
                } else {
                    if (currentPlayer == 'X') {
                        currentPlayer = 'O';
                    } else {
                        currentPlayer = 'X';
                    }
                    round++;
                }
            }

            if (!gameWon) {
                displayBoard();
                System.out.println("It's a draw!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing Tic Tac Toe!");
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = empty;
            }
        }
    }

    private static void displayBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void makeMove(Scanner scanner, char player) {
        boolean validMove = false;
        while (!validMove) {
            System.out.print("Enter your move (row,column): ");
            String input = scanner.nextLine();
            try {
                String[] parts = input.split(",");
                int row = Integer.parseInt(parts[0].trim()) - 1;
                int col = Integer.parseInt(parts[1].trim()) - 1;

                if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == empty) {
                    board[row][col] = player;
                    validMove = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter in the format row,column (e.g., 1,2).");
            }
        }
    }

    private static boolean checkWin(char player) {
        
        for (int i = 0; i < size; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
