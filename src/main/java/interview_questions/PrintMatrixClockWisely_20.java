package interview_questions;

public class PrintMatrixClockWisely_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMatrixClockWisely_20 pm = new PrintMatrixClockWisely_20();
		int columns = 5, rows = 5;
		int [][]tmp = pm.factoryMatrix(columns, rows);
		pm.printMatrix(tmp, columns, rows);
		System.out.println("~~~~~~~~");
		pm.printMatrixColckWisely(tmp, columns, rows);
	}
	
	public void printMatrix(int[][] num , int columns, int rows){
		for(int i = 0 ; i < rows ; i++){
			for(int j=0 ; j < columns ; j++){
				System.out.print(num[i][j]+" , ");
			}
			System.out.println();
		}
	}

	public int[][] factoryMatrix(int columns, int rows){
		int[][] num = new int[rows][columns];
		int tmp = 1;
		for(int i = 0 ; i < rows ; i++){
			for(int j=0 ; j < columns ; j++){
				num[i][j] = tmp;
				tmp++;
			}
		}
		return num;
	}
	
	public void printMatrixColckWisely(int[][] num , int columns, int rows){
		if(num == null || columns <= 0 || rows <=0){
			return;
		}
		int start = 0 ; 
		while(columns > start*2 && rows > start*2){
			printMatrixInCircle(num , columns , rows, start);
			start ++;
		}
	}

	private void printMatrixInCircle(int[][] num, int columns, int rows,
			int start) {
		// TODO Auto-generated method stub
		int endX = columns - start - 1;
		int endY = rows - start - 1;
		
		//from left to right
		for(int i = start ; i <= endX ; i++){
			printNum(num[start][i]);
		}
		
		//from up to low
		if(start < endY){
			for(int i = start+1 ; i <= endY ; i++){
				printNum(num[i][endY]);
			}
		}
		
		//from right to left
		if(start < endX && start < endY){
			for(int i = endX -1  ; i >= start ; i--){
				printNum(num[endY][i]);
			}
		}
		
		//from low to up
		if(start < endX && start < endY - 1){
			for(int i = endY -1  ; i > start ; i--){
				printNum(num[i][start]);
			}
		}
	}

	private void printNum(int i) {
		// TODO Auto-generated method stub
		System.out.print(i+" , ");
	}
}
