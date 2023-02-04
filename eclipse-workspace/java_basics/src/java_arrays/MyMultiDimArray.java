package java_arrays;

public class MyMultiDimArray {

	public static void main(String[] args) {
         int row = 3;
         int col=3;
         int val=0;
		int[][] my2dar = new int[row][col];
		
		for(int ri=0;ri<row;ri++)
		{
			for(int ci=0;ci<col;ci++)
			{
				my2dar[ri][ci]= val++;
			}
		}

		
		for(int ri=0;ri<my2dar.length;ri++)
		{
			for(int ci=0;ci<my2dar[row].length;ci++)
			{
				System.out.println("my2dar["+ri+"]["+ci+"] :" + my2dar[ri][ci]);
			}
		}
	}

}
