package variables;



//public class DecimalComparator {
//	 
//	public static boolean areEqualByThreeDecimalPlaces (double n1, double n2)
//	
//	{
//		
//	int n11=(int)(n1*1000); 
//	int	n12=(int)(n2*1000);
//		if (n11-n12==0) {
//			return true;
//		} else {
//			
//			return false;
//
//		}
//		
//			
//		
//	}
//		
//	}

	public class DecimalComparator{
	    
	    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
	        int myFirstCheck = (int)(myFirstDouble * 1000);
	        int mySecondCheck = (int)(mySecondDouble * 1000);
	        if(myFirstCheck - mySecondCheck == 0){
	            
	            return true;
	        } else 
	        
	        return false;
	        
	    }
	    
	 
	}

