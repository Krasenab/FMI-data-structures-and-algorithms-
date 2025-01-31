import java.util.Arrays;
import java.util.Scanner;

public class MyMultidimensionalArray {
	private Scanner sc = new Scanner(System.in);
	private int[][]mArray;
	public MyMultidimensionalArray() 
	{
		
	}
	
	public MyMultidimensionalArray(int[][]multiArray) 
	{
		this.mArray = multiArray;
	}
	
	public void printMatrix(int[][] mArray) 
	{
		for(int a= 0;a<mArray.length;a++) 
		{
			for(int b=0;b<mArray[a].length;b++) 
			{				
				System.out.print(mArray[a][b] + " ");
			}
			System.out.println();
		}
		
	}
	public String getMatrixDimensions() 
	{
		int row = mArray.length;
		int col = mArray[1].length;
		return String.format("You have multidimensional array with row: %d and col: %d\n", row,col);
	}
	
	public int[][] readMatrixFromConosle(int rows, int cols)
	{
		int[][] matrix = new int[rows][];
		
		for(int a=0; a<matrix.length;a++) 
		{
			int[] setAllElemntsOnRow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			matrix[a] = setAllElemntsOnRow;
		}
		return matrix;
	}
	
	public int[] takeАllЕlementVertically(int[][] multiArray)
	{

		int[] result = new int[multiArray[0].length * multiArray[1].length];
		int arrIndex=0;
		for(int col = 0; col<multiArray[1].length;col++) 
		{
			for(int row=0;row<multiArray[0].length;row++) 
			{
				int currentElement = multiArray[row][col];
				result[arrIndex] =multiArray[row][col]; 
				arrIndex++;
			}
		}
		return result;
	}
	
	public void printDiagonalsStratFromLeftBotomToTopRight(int[][]matrix) 
	{
		int lastRow = matrix[0].length-1;
		int col = matrix[1].length;

		for(int a=lastRow;a>=0;a--) 
		{
			String s = "stop";
			for(int b=0; b<matrix[1].length ;b++) 
			{
				
				
				System.out.print(matrix[a][b] + " ");

			}
			System.out.println();
			
		}
	}
}
