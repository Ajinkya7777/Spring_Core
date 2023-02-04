package controlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {
		int start = 4;
		int end=24;
		int count=0;

		while(start<=end)
		{
			start++;
			boolean b=isEven(start);
			
			if(b==false) {
			continue;
			}
			System.out.println(start +" is even no");		
			 if( b==true)
			{
				count = count +1;
				if(count==5)
				{
					break;
				}
			}
			
			}System.out.println(" we have got " +count+ " even numbers");
			
	}
	
	public static boolean isEven(int no) {
		if(no % 2==0)
		{
			return true ;
		}
		else {
			return false ;
		}
		
	}

}
