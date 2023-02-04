package variables;
//primitive data types

public class ByteShortIntLong {

	public static void main(String[] args) {
		byte byteSize = Byte.SIZE;
		System.out.println("byte size : " + byteSize);
		System.out.println();

		short shortSize = Short.SIZE;
		System.out.println("short size :" + shortSize);

		System.out.println();
		int intSize = Integer.SIZE;
		System.out.println("int size :" + intSize);

		System.out.println();
		long longSize = Long.SIZE;
		System.out.println("long size :" + longSize);

		System.out.println();
		byte myMaxByte = Byte.MAX_VALUE;
		byte myMinByte = Byte.MIN_VALUE;
		System.out.println("myMaxByte :" + myMaxByte);
		System.out.println("myMinByte :" + myMinByte);

		System.out.println();
		short myMaxShort = Short.MAX_VALUE;
		short myMinShort = Short.MIN_VALUE;
		System.out.println("myMaxShort :" + myMaxShort);
		System.out.println("myMinShort :" + myMinShort);
		System.out.println();
		int myMaxInteger = Integer.MAX_VALUE;
		int myMinInteger = Integer.MIN_VALUE;
		System.out.println("myMaxInteger :" + myMaxInteger);
		System.out.println("myMinInteger :" + myMinInteger);
		System.out.println();
		long myMaxLong = Long.MAX_VALUE;
		long myMinLong = Long.MIN_VALUE;
		System.out.println("myMaxLong :" + myMaxLong);
		System.out.println("myMinLong :" + myMinLong);

		byte b = 12 + 1;
		byte b1 = (byte) (12 + 22 + b);

		short s = 12;
		short s2 = (short) (12 + s); // when we perform operations jdk(java) will consider the int as by default data
										// type so we need to
										// type cast the result in short same for respective data types it is called
										// widening data type.

		long l = 13;
		long l2 = 433L;
		long l3 = myMaxInteger + 1;

		int i = (int) myMaxInteger + 1;
		int i2 = (int) (myMaxInteger + 12L);
		double k= 12d;
		long m =(long) k;

		double d= 12.3d;
		int i23 = (int)d;
		int d1= 12;
		double i1= d;
		
		int no1= 2;
		double no2 =2;
		
		int no1Ops= no1/100;
		
		double no2Ops=no2/100;
		System.out.println(no1Ops);
		System.out.println(no2Ops);
		
		//There are two types of type casting one is called auto type casting or widening casting
//		 and other one is narrowing typecasing explicit typecasting 
//		 
//		Type Casting in Java
		/*
		Widening Casting
			byte -> short -> char -> int -> long -> float -> double
		Narrowing Casting
			double -> float -> long -> int -> char -> short -> byte
			
			int a=10;
		double b=a,d=25.5385;
		int c=(int)d;
		System.out.println("Int : "+a);
		System.out.println("Double : "+b);
		System.out.println("Double : "+d);
		System.out.println("Int : "+c);
		
		System.out.println(Character.SIZE);
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Character.BYTES);
		System.out.println(Byte.BYTES);
		System.out.println(Short.BYTES);
		
		char c='a';
int a =c;
   short s= (short)c;
 
	*/
		
		
//		
	}
}