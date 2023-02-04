package controlFlowStatements;

/*Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). 
If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, 
such as 2 in 12 and 23; otherwise, the method should return false.
*/
public class SharedDigit {
	

	public static boolean hasSharedDigit(int no1, int no2)

	{
		int reminderNo1 = 0;
		int reminderNo11 = 0;
		int reminderNo2 = 0;
		int reminderNo22 = 0;
		int count1 =0;
		int count2 =0;

		if ((no1 >= 10 && no1 <= 99) && (no2 >= 10 && no2 <= 99)) {
			
			//if(count==0)
		//	{
			while (no1 > 0) {   //12
				if(count1==0) {
				reminderNo1 = no1 % 10; //12%10==2
				//no1 = no1 / 10;
				count1++;
				}
				else {
					reminderNo11=no1%10; //1%10=1
					break;
				}
				no1 = no1 / 10; //12/10=1
				//count++;
			//	System.out.println(" no1 "+reminderNo1);
			}

			//}
			while (no2 > 0) { //13
				if(count2==0) {
				reminderNo2 = no2 % 10; //13%10=3
				count2++;
				}
				else {
					reminderNo22=no2%10; //1%10=1
					break;
				}
			//	System.out.println("no2 " +reminderNo2);
				no2 = no2 / 10; //13/10=1

			}
			 if (reminderNo1 == reminderNo2) { //2==
				return true;
			}
			else if (reminderNo1 == reminderNo22) {
				return true;
			}
			else if (reminderNo11 == reminderNo2) {
				return true;
			}
			else if (reminderNo11 == reminderNo22) {
				return true;
			}
			
		}

		return false;
	}

}
