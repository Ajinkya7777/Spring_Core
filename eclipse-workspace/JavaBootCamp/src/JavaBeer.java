
public class JavaBeer {

	public static void main(String[] args) {
		
		sing(99);

	}

	private static void sing(int j) {
		 for (int i=j; i>=1; i--) {
			
			 System.out.println(i+" bottles of beer on the wall,"+ i+" bottles of beer!\r\n" + 
			 		" take one down, pass it around "+ (i-1)+" bottles of beer on the wall!");
		}
		
	}

}
