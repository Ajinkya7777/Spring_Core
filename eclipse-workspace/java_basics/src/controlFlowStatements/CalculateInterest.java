package controlFlowStatements;



public class CalculateInterest {
	
	public static void main(String[] args) {
		
		
		double amount=10000;
		
		System.out.println(" forward order for loop");
		
for (int i = 2; i <=8; i++) {
			
	System.out.println("10,000 at "+ i +" % Interest = "+ String.format("%.2f", calculateInterest(amount,i)));
			
		}

System.out.println(" backwards order for loop");

for (int i = 8; i >=2; i--) {
	
	System.out.println("10,000 at "+ i +"% Interest = "+ String.format("%.2f", calculateInterest(amount,i)));
			
		}
		
	}

	private static double calculateInterest(double amount, double rateOfInterest) {
		// TODO Auto-generated method stub
		return (amount*(rateOfInterest/100));
	}
	


  

//	double d= 12.3d;
//	int i = (int)d;
//	int d1= 12;
//	double i1= d;
	
//	int no1= 2;
//	double no2 =2;
//	
//	int no1Ops= (no1/100);
//	
//	double no2Ops=no2/100;
//	System.out.println(no1Ops); output =0
//	System.out.println(no2Ops); output =0.02
	
}

