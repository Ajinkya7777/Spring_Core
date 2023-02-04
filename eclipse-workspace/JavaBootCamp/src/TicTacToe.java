import java.util.Scanner;

public class TicTacToe {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// char[][] board = new char[3][3];
		char[][] board = new char[3][3];
		System.out.println(" Let's play tic tac toe");
		printBoard(board);

		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println("Turn: X");
				int[] spot = askUser(board);
				// System.out.println(spot[0][1]);

				board[spot[0]][spot[1]] = 'X';
				// printBoard(board);

			} else {
				System.out.println("Turn: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
			}
			printBoardUpdated(board);
		}

	}

	private static void printBoardUpdated(char[][] board) {
		System.out.println("\n");

		for (int i = 0; i < board.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < board[i].length; j++) {
				// System.out.print("\t");
				System.out.print(board[i][j] + " ");
			}
			System.out.println("\n\n");
		}
		
	}

	private static int[] askUser(char[][] board) {

		System.out.print(" Pick a row and column number:");

		int row = scan.nextInt();
		int column = scan.nextInt();
		while (board[row][column] != '-') {
			System.out.println(" Sorry! spot taken,try again.");
			 row=scan.nextInt();
			 column=scan.nextInt();
		}

		return new int[] { row, column };
	}

	private static void printBoard(char[][] board) {
		System.out.println("\n");

		for (int i = 0; i < board.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < board[i].length; j++) {
				// System.out.print("\t");
				System.out.print("-" + " ");
			}
			System.out.println("\n\n");
		}

	}
}
