package Interfaces;

public interface ITelephone {
	
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean isRinging();
	public boolean callPhone(int phoneNumber);

}
