package interview_questions;

public class Fibonacci_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(new Fibonacci_9().getFibonacci(6));
	}
	
	public long getFibonacci(int n){
		if( n <= 0){
			throw new IndexOutOfBoundsException("Error input number");
		}
		long[] result = {0 , 1};
		if(n < 2){
			return result[n];
		}
		long fibNOne = 0;
		long fibNTwo = 1;
		long fibN = 0;
		
		for (int i = 2; i <= n; i++) {
			fibN = fibNOne + fibNTwo ;
			fibNOne = fibNTwo ;
			fibNTwo = fibN;
		}
		
		return fibN;
	}

}
