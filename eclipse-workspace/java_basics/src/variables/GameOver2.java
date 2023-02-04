package variables;




public class GameOver2 {

	public static void main(String[] args) {
		
		int p1=calculateHighScorePosition(1500);
		int p2=calculateHighScorePosition(900);
		int p3=calculateHighScorePosition(400);
		int p4=calculateHighScorePosition(50);
		int p5=calculateHighScorePosition(1000);
		
		
		displatHighScorePosition("Ajinkya", p1);
		
		displatHighScorePosition("Swati", p2);
		
		displatHighScorePosition("Shubham", p3);
		
		displatHighScorePosition("Gaurav", p4);
		displatHighScorePosition("Ramsey", p5);
		
		

	}

public static void displatHighScorePosition(String playerName,int position)
{
	System.out.println(playerName+" managed to get into position " +position+ " on the  high score table");
	
	}


public static int calculateHighScorePosition(int playerScore)

{
//	if(playerScore>=1000)
//	{
//	return 1;
//	}
//	else if (playerScore>=500 && playerScore<1000) {
//		return 2;
//	}	
//	else if (playerScore>=100 && playerScore<500) {
//		
//		return 3;
//	}
//
////	else
////	{
////		return 4;
////	}
//	return 4;
	
	int position = 4; //assuming that return will be 4 initlally

	if (playerScore>=1000) {
		position=1;
		
	}
	else if (playerScore>=500) {
		position=2;
	}
	else if (playerScore>=100) {
		position=3;
		
	}
	return position;
	}
}


