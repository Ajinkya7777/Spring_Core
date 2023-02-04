package variables;

//public class TeenNumberChecker {
//
//	public static boolean hasTeen(int no1, int no2, int no3) {
//		if (no1<=12 || no1>=20) {
//			
//			return false;
//			
//		} else if(no2<=12 || no2>=20) {
//   
//			return false;
//		}
//		else if (no3<=12 || no3>=20) {
//			return false;
//		}
//		
//		else 
//			{return true;
//			}
//		
//		}
//	public static boolean isTeen(int no4)
//	
//	{
//		if(no4<=12 || no4>=20)
//		{
//			return false;
//		}
//		else 
//		{
//			return true;
//		}
//}
//}

public class TeenNumberChecker {

	public static boolean hasTeen(int no1, int no2, int no3) {
		if ((no1>=13 || no1<=19) && !(no1<=12 || no1>=20)) { 
			
			return true;
			
		} else if((no2>=13 || no2<=19) && !(no2<=12 || no2>=20)) {
   
			return true;
		}
		else if ((no3>=13 || no3<=19) && !(no3<=12 || no3>=20)) {
			return true;
		}
		
		else 
			{return false;
			}
		
		}
	public static boolean isTeen(int no4)
	
	{
		if(no4<=12 || no4>=20)
		{
			return false;
		}
		else 
		{
			return true;
		}
}
}

