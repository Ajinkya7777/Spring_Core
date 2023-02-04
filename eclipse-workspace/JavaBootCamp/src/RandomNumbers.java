
public class RandomNumbers {

	public static void main(String[] args) {
		
		int[][] randomNo=new int[100][10];
//		int[][] array = {
//			    {48, 56, 56, 76, 0, 81, 51, 81, 99, 70},
//			    {38, 52, 73, 6, 10, 56, 1, 71, 47, 9},
//			    {85, 35, 47, 98, 91, 25, 69, 52, 2, 93}
//			};
		
		//int randomNumber=randomNumber();
	//	System.out.println(randomNumber);

		for (int i = 0; i < randomNo.length; i++) {
			for (int j = 0; j < randomNo[i].length; j++) {
				randomNo[i][j]=randomNumber();
			}
		}
		print2DArray(randomNo);
	}

	private static void print2DArray(int[][] randomNo) {
		for (int i = 0; i < randomNo.length; i++) {
			for (int j = 0; j < randomNo[i].length; j++) {
				System.out.print(randomNo[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}

	private static int randomNumber() {
		int randomNo=(int)(Math.random()*(99-0+0)+0);
		return randomNo;
	}

}
