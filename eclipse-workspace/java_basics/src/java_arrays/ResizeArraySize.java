package java_arrays;

import java.util.Arrays;

public class ResizeArraySize {
	
	public static void main(String[] args) {
		
		int [] originalSize= new int[4];
		
		int[] resize= new int  [5];//[originalSize.length];//originalSize;
		
		//System.arraycopy(originalSize, 0, resize, resize.length, originalSize.length);
		System.arraycopy(originalSize, 0, resize, 0, originalSize.length);
		
		System.out.println(Arrays.toString(resize));
		
		
		
	}

}
