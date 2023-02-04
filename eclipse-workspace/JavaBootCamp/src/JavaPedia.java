import java.util.Scanner;

public class JavaPedia {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int figure = 0;
		System.out.println("*************JAVAPEDIA******************\n");
		System.out.println("How many historical figures will you register?\n");
		int noOfFigures = scan.nextInt();
		String[][] database = new String[noOfFigures][3];
		scan.nextLine();

		for (int i = 0; i < database.length; i++) {
			System.out.println("\tFigure:" + "" + (++figure) + "");
			for (int j = 0; j < database[i].length; j++) {
				switch (j) {
				case 0:
					System.out.print("\t\tName:");
					database[i][j] = scan.nextLine();
					break;
				case 1:
					System.out.print("\t\tDate Of Birth:");
					database[i][j] = scan.nextLine();
					break;
				case 2:
					System.out.print("\t\tOccupation:");
					database[i][j] = scan.nextLine();
					break;

				default:
					break;

				}
			}
			System.out.println("\n");
		}
		
		print2DArray(database);
		System.out.println(" \nwho do you want information on?" );
		String search=scan.nextLine();
		for (int i = 0; i < database.length; i++) {
			for (int j = 0; j < database[i].length; j++) {
				if (search.equalsIgnoreCase(database[i][j])) {
					System.out.print("Name:"+database[i][0]+"\n");
					System.out.print("Date Of birth:"+database[i][1]+"\n");
					System.out.print("Occupation:"+database[i][2]+"\n");
					
				}
			}
		}
	}

	private static void print2DArray(String[][] database) {
		System.out.println(" These are the values stored:\n");
		for (int i = 0; i < database.length; i++) {
			System.out.print((i+1)+". ");
			for (int j = 0; j < database[i].length; j++) {
				System.out.print("\t"+database[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		
	}

}
