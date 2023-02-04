package controlFlowStatements;

public class SwitchWithChar {
	public static void main(String[] args) {
		
		char a='f';
		switch (a)
		{
		case 'a':
			System.out.println(" character is a");
			break;
		case 'b':
			System.out.println(" character is b");
			break; 
		case 'c':
			System.out.println(" character is c");
			break;
		case 'd':
			System.out.println(" characteracter is d");
			break;
		case 'e':
			System.out.println(" characteracter is e");
			break;
		default:
			System.out.println(" characteracter a,b,c,d,e is not typed");
			break;
			
			
		}
		String weekDay= "Mondaya";
		
		switch(weekDay){
			
		case "Monday":
			System.out.println("it's Monday");
			break;
		case "Tuesday": case "Wednesday": case "Thursday": case "Friday": case "Saturday" : case "Sunday":
			System.out.println("it's Monday");
			break;
			
			default:
				System.out.println("not sure");
		}
	}

}
