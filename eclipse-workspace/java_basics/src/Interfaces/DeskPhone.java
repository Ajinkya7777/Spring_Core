package Interfaces;

public class DeskPhone implements ITelephone{
	
	

	private int myNumber;
	private boolean isRinging;
	
	
	public DeskPhone(int myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}

	@Override
	public void powerOn() {
		 
		System.out.println(" No action taken, desk phone does not have a power button");
		
	}

	public void dial(int phoneNumber) {
		 
		System.out.println(" Now ringing " + phoneNumber + " on deskphone");
		 
	}

	@Override
	public void answer() {
		 if (isRinging) {
			System.out.println(" answering the desk phone");
		} else {
			System.out.println(" not ringing ");
		}
		
	}

	@Override
	public boolean isRinging() {
		 
		return isRinging;
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		
		if (phoneNumber== myNumber) {
			isRinging = true;
			System.out.println(" my phone is ringing");
		}
		else {
			isRinging=false;	
		}
		return isRinging;
		 
		
	}
	
	

}
