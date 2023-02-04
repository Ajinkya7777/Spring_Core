package java_arrays;

public class MultidimesionalArray {

	public static void main(String[] args) {
		
		int[] array2d[] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12,13}};
		
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				
				
				System.out.print(array2d[i][j]+"\t");
			//	System.out.println(array2d[j].length);
			//	System.out.println(array2d[i].length);
				
				
				
			}
		
			System.out.println();
		}
		
	//System.out.println(array2d.length);
	}

}
