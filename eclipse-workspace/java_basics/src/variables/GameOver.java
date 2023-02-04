package variables;


public class GameOver {

	public static void main(String[] args) {
//		boolean gameOver= true;
//		int score = 800;
//		int levelCompleted = 3;
//		int bonus = 200;
//		
//		
//		if (gameOver) {
//			int finalScore= score + (bonus*levelCompleted);
//		 System.out.println("final score is : " +finalScore);
//		}
//		
//		score = 10000;
//		levelCompleted=8;
//		bonus=200;
//		if(gameOver)
//		{
//			int secondScore=score + (bonus*levelCompleted);
//			System.out.println("final score is : " +secondScore);
//		}
		System.out.println("final score is "+gameOver(true,800,5,100));
		
		System.out.println("final score is "+gameOver(true,10000,8,200));
 
		System.out.println("final score is " +gameOver(false,10000,8,200));
//
//	
	}

	public static int gameOver(boolean gameover,int score,int levelCompleted,int bonus)
	
	{
		if(gameover) {
		
		int finalScore=(score + (bonus*levelCompleted))+(1000);
		//System.out.println("final score is : "+ finalScore);
		return finalScore;
		}
		else {
			System.out.println("game is yet to over");
			return -1;
		}
	}
	
	
}
