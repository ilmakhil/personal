package last;

public class transpose {

	public static void main(String[] args) {
		  int i, j;
	      int row = 3;
	      int col = 2;
	      int arr[][] = {{2, 5}, {1, 8}, {6, 9} };
	      System.out.println("The original matrix is: ");
	      for(i = 0; i < row; i++) {
	         for(j = 0; j < col; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	         System.out.print("\n");
	      }
	      System.out.println("The matrix transpose is: ");
	      for(i = 0; i < col; i++) {
	         for(j = 0; j < row; j++) {
	            System.out.print(arr[j][i] + " ");
	         }
	         System.out.print("\n");
	      }
		

	}

}
