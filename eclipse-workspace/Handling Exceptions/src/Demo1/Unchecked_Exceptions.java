package Demo1;

public class Unchecked_Exceptions {

	public static void main(String[] args) {
		int x=Integer.MAX_VALUE;
		int y =3;
		int z=1;
		int sum1 = x+y;
		System.out.println(sum1);
		int sum = Math.addExact(z, y);
		System.out.println(sum);
		
		byte b=(byte)Integer.MAX_VALUE;
		byte a= Byte.MAX_VALUE;
//		System.out.println(a);
//		System.out.println(a+b);
		byte add= (byte) Math.addExact(a, b);
		System.out.println(add);
	
		//int sum0 = Math.addExact(x, y);

	}

}
