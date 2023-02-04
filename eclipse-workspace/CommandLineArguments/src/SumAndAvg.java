
public class SumAndAvg {

	public static void main(String[] args) {
	
		int sum = 0;
		double avg=0.0d;
		
		for (int i = 0; i < args.length; i++) {
			sum+=Integer.parseInt(args[i]);
		
	}
		System.out.println(sum);
		avg=sum/(float)args.length;
		
		System.out.println(avg);

	}

}
