
public class HighScore {

	static int highScore = 0;
	static int seat=0;
	public static void main(String[] args) {
		int[] randomNOArray = new int[10];
		for (int i = 0; i < randomNOArray.length; i++) {
			randomNOArray[i] = randomNo();
			System.out.println(" No." + (i + 1) + "  " + randomNOArray[i]);

		}
		for (int i = 0; i < randomNOArray.length; i++) {
			if (randomNOArray[i] > highScore) {
				highScore = randomNOArray[i];
				seat =i+1;
			}
		}
		System.out.println("\n The HighScore is: " + highScore+" Impressive");
		System.out.println(" It's the gentleman in seat : "+seat+". Give that man a cookie!");

	}

	private static int randomNo() {

		int randomNo = (int) (Math.random() * (49999 - 0 + 0) + 0);
		return randomNo;
	}

}
