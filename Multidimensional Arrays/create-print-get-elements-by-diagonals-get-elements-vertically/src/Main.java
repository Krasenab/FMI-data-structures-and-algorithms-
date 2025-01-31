import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MyMultidimensionalArray myMArray = new MyMultidimensionalArray();
		System.out.println("My matrix with preset elements and size");
		int[][] mArray = new int[][] {{11 ,90 ,7   ,5},
									  {14 ,2  ,7  ,21},
									  {16 ,17 ,18 ,22}
									 };	
		myMArray.printMatrix(mArray);
		
		System.out.println("This matrix is MxN:");
		MyMultidimensionalArray myMArray1 = new MyMultidimensionalArray(mArray);
		System.out.println(myMArray1.getMatrixDimensions());
		

		
		System.out.println("Еnter matrix size values");
		System.out.println("Rows Cols");
		Scanner sc = new Scanner(System.in);
		String[] valuesForMatrix = sc.nextLine().split(" ");
		int row = Integer.parseInt(valuesForMatrix[0]);
		int col =Integer.parseInt(valuesForMatrix[1]);
		MyMultidimensionalArray myMArray2 = new MyMultidimensionalArray();
		int[][] createdMatrix =  myMArray2.readMatrixFromConosle(row, col);		
		System.out.println();
		System.out.println("Your matrix:");
		System.out.println();
		myMArray2.printMatrix(createdMatrix);
		
		
		System.out.println();
		System.out.println("Аll Еlements Vertically");
		int[] getAllElement =  myMArray2.takeАllЕlementVertically(createdMatrix);
		System.out.println(Arrays.toString(getAllElement));
		
		System.out.println();
		
		System.out.println("All elements diagonality start from left botom to right top");
		myMArray2.printDiagonalsStratFromLeftBotomToTopRight(createdMatrix);
	}
  

}
