package StatergyPattern;
//dependent class

final public class BlueDart implements Courier {
	 public BlueDart() {
		System.out.println(" Bluedart:: 0 param constructor ");
	}
	@Override
		public String delivery(int oid) {
		
		return oid+"id order is delivered by blue dart";
	}

}
