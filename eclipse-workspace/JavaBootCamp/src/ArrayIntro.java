
public class ArrayIntro {

	public static void main(String[] args) {
		
		String[] seats = new String[5];
		String[] seat = new String[5];
		 
		seats[0]="Harry";
		seats[1]="Roy";
		seats[2]="Ron";
		seats[3]="Harsh";
		seats[4]="Seamus";

		System.out.println(" It's time to take your 5th year Exams");
		System.out.println(seats[0]+", you will take seat 0");
		System.out.println(seats[1]+", you will take seat 1");
		System.out.println(seats[2]+", you will take seat 2");
		System.out.println(seats[3]+", you will take seat 3");
		System.out.println(seats[4]+", you will take seat 4\n");

		seat[0]="Ajinkya";
		seat[1]="Mack";
		seat[2]="LOL";
		seat[3]="BtW";
		seat[4]="WTF";
		
		for (int i = 0; i < seat.length; i++) {
			System.out.println(seat[i]+", you will take seat 4");
			
		}
	}

}
