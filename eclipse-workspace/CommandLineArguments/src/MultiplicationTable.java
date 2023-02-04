
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int row=Integer.parseInt(args[0]);
		int column= Integer.parseInt(args[1]);
		
		int[][] tables= new int[row][column];
		
	
		for (int i = 0; i < tables[row].length; i++) {
               
			for (int j = 0; j < tables[column].length; j++) {
				
				tables[i][j]= (i+1)*(j+1);
	
}
		}
		
		for (int[] is : tables) {
			for (int is2 :is) {
				System.out.print(is2 +"\t");
				
			}
			System.out.println();
			
		}

	}

}
