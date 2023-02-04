package controlFlowStatements;

public class IsEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   System.out.println(isEven(100));
   System.out.println(isEvenUsingDoWhile(-100));
	}
	
	public static boolean isEven(int no)
	{
//		if(no % 2==0)
//		{
//			return +no +" is even " ;
//		}
//		else {
//			return +no+" is not even" ;
//		}
		
		
		System.out.println("using while loop");
	while(no>0)
	{

		if(no % 2==0)
		{
			return true ;
		}
		else {
			return false ;
		}
	
	}
	return false;

	}
	
	public static boolean isEvenUsingDoWhile(int no) {
		
		do
		{
			if(no % 2==0)
			{
				return true ;
			}
			else {
				return false ;
			}
		
		}while(no>0);
		

		}
		
	

}
