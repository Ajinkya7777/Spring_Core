import java.util.Arrays;

public class LotteryTickets {

	public static void main(String[] args) {

		
		int[] ticket= {34,43,45,65,21,54};
		int[] tickets=Arrays.copyOf(ticket, ticket.length);
		tickets[2]=54;
			
			System.out.print("ticket 1 Numbers:");
		   printTickerNumber(ticket);
		   System.out.print("ticket 2 Numbers:");
		   printTickerNumber(tickets);

	}

	private static void printTickerNumber(int[] ticket) {
		for (int i = 0; i< ticket.length; i++) {
			
			System.out.print(ticket[i] + " ");
		}
		System.out.print("\n\n");
	}

}
