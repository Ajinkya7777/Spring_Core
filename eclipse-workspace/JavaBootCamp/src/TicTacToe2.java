import java.util.Scanner;

public class TicTacToe2 {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// char[][] board = new char[3][3];
		char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' }

		};
		System.out.println(" Let's play tic tac toe");
		printBoard(board);

		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println("Turn: X");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'X';
			} else {
				System.out.println("Turn: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
			}
			printBoard(board);
			int count = checkWin(board);
			System.out.println("count : " + count);
			if (count == 3) {
				System.out.println(" X wins!!");
				break;
			} else if (count == -3) {
				System.out.println(" O wins!!");
				break;
			}
			else if(i==8) {
				System.out.println("It's a tie!");
			}
		}

	}

	private static int checkWin(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
				} else if (board[i][j] == 'O') {
					count--;
				}
			}
			if (count == 3 || count == -3) {

				return count;
			} else {
				count = 0;
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] == 'X') {
					count++;
				} else if (board[j][i] == 'O') {
					count--;
				}

			}
			if (count == 3 || count == -3) {

				return count;
			} else {
				count = 0;
			}
		}
		for (int i = 0; i < 3; i++) {

			if (board[i][i] == 'X') {
				count++;
			} else if (board[i][i] == 'O') {
				count--;
			}
		}
		if (count == 3 || count == -3) {
			return count;
		} else {
			count = 0;
		}

		for (int i = 0; i < board.length; i++) {
			int rowIndex = 2 - i;
			if (board[rowIndex][i] == 'X') {
				count++;
			} else if (board[rowIndex][i] == 'O') {
				count--;
			}
		}
		if (count == 3 || count == -3) {
			return count;
		} else {
			count = 0;
		}
		return count;

	}

	private static int[] askUser(char[][] board) {

		System.out.print(" Pick a row and column number:");

		int row = scan.nextInt();
		int column = scan.nextInt();
		while (board[row][column] != '-') {
			System.out.println(" Sorry! spot taken,try again.");
			row = scan.nextInt();
			column = scan.nextInt();
		}

		return new int[] { row, column };
	}

	private static void printBoard(char[][] board) {
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
}
