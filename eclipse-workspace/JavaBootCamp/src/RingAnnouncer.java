
public class RingAnnouncer {

	public static void main(String[] args) {
	 int win=0;
	 int loss=0;
		String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
		for (int i = 0; i < record.length; i++) {
			if (record[i].equalsIgnoreCase("win")) {
				win++;
			}
			else {
				loss++;
			}
		}

			System.out.println(" With a profeessional record of "+win+" wins and " +loss+" losses.");
			System.out.println(" He is the pride of oracle : Java Fury!");
			
	}

}
