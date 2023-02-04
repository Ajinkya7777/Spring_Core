package ClassesAndConstructors;

public class ComplexNumber {
	private double real;
	private double imaginary;
	//private ComplexNumber cn;
	
	public ComplexNumber(double real, double imaginary) {
	
		this.real = real;
		this.imaginary = imaginary;
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}
	
    public void add(double real,double imaginary) 
   
    {	
    	real=this.real+real;
    	imaginary=this.imaginary+imaginary;
    	System.out.println(+real+ " " +imaginary);
    	
    }
    public void add(ComplexNumber number) 
    
    {	
    	this.add(number.getReal(),number.getImaginary());
    	
    	
    }
   
    public void subtract(double real, double imaginary)
    {              
       real=this.real+real;
       imaginary=this.imaginary-imaginary;
       System.out.println(+real+ " " +imaginary);
    }
	public void subtract(ComplexNumber number) {
		
		
		this.subtract(number.getReal(),number.getImaginary());
		
	}
	

}
