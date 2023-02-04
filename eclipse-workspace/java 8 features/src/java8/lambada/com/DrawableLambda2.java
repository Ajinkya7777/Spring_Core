package java8.lambada.com;

public interface DrawableLambda2 {
	public void draw();
	

}

//Without Lambda Expression

 class Drawable
{
	public static void main(String[] args) {
		int width=5;
		
		DrawableLambda2 d= new DrawableLambda2() {
			
			@Override
			public void draw() {
				System.out.println("width is " +width); }
			};
			
			d.draw();
			
	}}