import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = {{" - ", " - ", " - "},
                            {" - ", " - ", " - "},
                            {" - ", " - ", " - "}};

        System.out.println("\t" + Arrays.toString(board[0]));
        System.out.println("\t" + Arrays.toString(board[1]));
        System.out.println("\t" + Arrays.toString(board[2]) + "\n");

        // Take Input from the User
        Scanner input = new Scanner(System.in);
        int row;
        int col;

        // X's 1st turn
        System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
        System.out.print("separated by a space: ");

        row = input.nextInt();
        col = input.nextInt();
        if (board[row - 1][col - 1].equals(" - ")) {
            board[row -1][col - 1] = " X ";
        } else {
            System.out.println("Sorry, that spot is taken.");
        }
        System.out.println("\t" + Arrays.toString(board[0]));
        System.out.println("\t" + Arrays.toString(board[1]));
        System.out.println("\t" + Arrays.toString(board[2]) + "\n");



    }
}