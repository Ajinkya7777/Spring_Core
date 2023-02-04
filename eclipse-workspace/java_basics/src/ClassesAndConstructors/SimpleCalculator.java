package ClassesAndConstructors;

public class SimpleCalculator {
	private double firstNumber=0;
	private double secondNumber=0;
	
	public void setFirstNumber(double firstNumber)
	{
		this.firstNumber=firstNumber;
	}
	public void setSecondNumber(double secondNumber)
	{
		this.secondNumber=secondNumber;
	}
	public double getFirstNumber()
	{
		return this.firstNumber;
		
	}
	public double getSecondNumber()
	{
		return this.secondNumber;
	}
	public double getAdditionResult()
	{
		double addition = firstNumber+secondNumber;
		return addition;
	}
	public double getSubtractionResult()
	{
		double substraction = firstNumber-secondNumber;
		return substraction;
	}
	public double getMultiplicationResult()
	{
		double multiplication = firstNumber*secondNumber;
		return multiplication;
	}
	public double getDivisionResult()
	{    if(secondNumber!=0)
	{
		double divison = firstNumber/secondNumber;
		return divison;
	}
	return 0.0;
		
	}
	

}
