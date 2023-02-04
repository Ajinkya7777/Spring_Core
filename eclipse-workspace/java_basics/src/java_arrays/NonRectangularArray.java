package java_arrays;

public class NonRectangularArray {

	public static void main(String[] args) {
	boolean[][] isOpen=new boolean[5][];
      isOpen[0]=new boolean[5];
      isOpen[1]=new boolean[4];
      isOpen[2]=new boolean[3];
      isOpen[3]=new boolean[2];
      isOpen[4]=new boolean[1];
	
//      for (int i = 0; i < isOpen.length; i++) {
//		for (int j = 0; j < isOpen[i].length; j++) {
//			System.out.print(isOpen[i][j] + "\t");
//		}
//	System.out.println();
//      }
       
      for (boolean[] bs : isOpen) {
		for (boolean bs2 : bs) {
			System.out.print(bs2+ "\t");
		}
		System.out.println();
	}
	}

}
