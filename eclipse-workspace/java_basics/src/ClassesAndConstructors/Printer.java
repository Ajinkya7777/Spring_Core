package ClassesAndConstructors;

public class Printer {
	
	private int tonerLevel;
	private int noOfPagesPrinted;
	private boolean duplex;
	
	
	public int fillUpTheToner()
	{
		if(tonerLevel<100)
		{
			tonerLevel=100;
		}
		return tonerLevel;
	}
	
	public int printingPage() {
		
		noOfPagesPrinted=noOfPagesPrinted+1;
		return noOfPagesPrinted;
	}
	
	
	public Printer(int tonerLevel,int noOfPagesPrinted,boolean duplex) {
		this.tonerLevel=tonerLevel;
		this.noOfPagesPrinted=noOfPagesPrinted;
		this.duplex=duplex;
	}
	
	
//	public void setTonerLevel(int tonerLevel) {
//		this.tonerLevel=tonerLevel;
//		//return this.tonerLevel;
//	}
//
//	public void setNoOfPagesPrinted(int noOfPagesPrinted) {
//		this.noOfPagesPrinted = noOfPagesPrinted;
//	}
//
//	public void setDuplex(boolean duplex) {
//		this.duplex = duplex;
//	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNoOfPagesPrinted() {
		return noOfPagesPrinted;
	}

	public boolean isDuplex() {
		return duplex;
	}

}
