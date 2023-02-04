package variables;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
	
		int a=getDurationString(3945);
		if(a<0)
		{
			System.out.println("invalid output");
		}

	}
	public static int getDurationString(int minutes,int seconds)
	{
		if(minutes>=0 && seconds>=0 && seconds<=59)
		{
		  int hours =  (minutes /60);
		  //int minute =   (seconds/60);
		  int remainingMinutes= minutes%60;
		  int remainingSeconds= seconds%60;
		  System.out.println(+hours +" hour " + remainingMinutes + " minutes " + remainingSeconds + " seconds = " +minutes + " Minutes : " +seconds+" seconds");
		  return 1;
		}
		else {
			return -1;
		}
	}
	public static int getDurationString(int seconds)
	
	{
		if(seconds>=0)
		{
			int minutes= seconds/60;
			int second=seconds%60;
			return getDurationString(minutes,second);
		}
		else {
			return -1;
		}
	}
	
}
