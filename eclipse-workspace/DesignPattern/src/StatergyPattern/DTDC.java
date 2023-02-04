package StatergyPattern;
//dependent class
final public class DTDC implements Courier {

	public DTDC() {

		System.out.println(" DTDC:: 0 param constructors");
	}
	@Override
	public String delivery(int oid) {
		
		return oid+"id  order is delivered by DTDC";
	}

}
