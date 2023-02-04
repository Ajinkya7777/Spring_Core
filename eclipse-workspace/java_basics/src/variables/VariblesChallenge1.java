package variables;

public class VariblesChallenge1 {

	public static void main(String[] args) {
		byte b= 12;
		int c = 12;
		short s = 12;
		int a= 10;
		
		long l= 50000L+a*(b+c+s);
         System.out.println(l);
         
         short s2 = (short) (10000 + 10 * (b*s*c));
	 System.out.println(s2);
	}

}
