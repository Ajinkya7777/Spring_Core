import java.util.Arrays;

public class RefrenceTrap {
	
	private String[] names;
	 
	public RefrenceTrap(String[] names) {
	//	this.names= Arrays.copyOf(names, names.length);
		this.names=names;
	}
	public RefrenceTrap(RefrenceTrap rf) {
		this.names=rf.names;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	
	

}
