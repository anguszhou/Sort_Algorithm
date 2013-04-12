package interview_questions;

public class Print1ToMaxOfNDigits_12 {

	
	private char[] num = null;
	/**
	 * intput n , print from 1 to max of n 
	 * 
	 * e.p. n = 3 , print from 1 to 999
	 *      n = 5 , print form 1 to 99999
	 */
	public static void main(String[] args) {
		
		Print1ToMaxOfNDigits_12 pp = new Print1ToMaxOfNDigits_12();
		pp.print1ToMaxNDigits2(4);

	}
	
	public void print1ToMaxNDigit(int n){
		if(n <= 0){
			throw new IndexOutOfBoundsException("Input num is not a positive number.");
		}
		num = new char[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = '0';
		}
		
		while(!increaseNum(num)){
			printNum(num);
			System.out.println();
		}
 	}

	private void printNum(char[] num) {
		// TODO Auto-generated method stub
		boolean isBeginof1 = true;
		for (int i = 0; i < num.length; i++) {
			if(isBeginof1 && num[i] != '0'){
				isBeginof1 = false;
			}
			if(!isBeginof1){
				System.out.print(num[i]);
			}
		}
	}

	private boolean increaseNum(char[] num) {
		// TODO Auto-generated method stub
		boolean isOverFlow = false;
		int nTakeOver = 0;
		
		for (int i = num.length	-1 ; i >= 0; i--) {
			int nSum = num[i] - '0' + nTakeOver;
			if(i == num.length -1){
				nSum++;
			}
			
			if(nSum >= 10){
				if(i == 0){
					isOverFlow = true;
				}else{
					nTakeOver = 1;
					nSum -= 10;
					num[i] = (char) (nSum + '0');
				}				
			}else{
				num[i] = (char) (nSum + '0');
				break;
			}
		}
		return isOverFlow;
	}

	public void print1ToMaxNDigits2(int n){
		if(n <= 0){
			throw new IndexOutOfBoundsException("Input num is not a positive number.");
		}
		
		num = new char[n];
		for (int i = 0; i < 10; i++) {
			num[0] = (char) (i + '0');
			printCoreRecursively(0);
		}
	}

	private void printCoreRecursively(int index) {
		// TODO Auto-generated method stub
		if(index == num.length -1){
			printNum(num);
			System.out.println();
			return;
		}
		for (int i = 0; i < 10; i++) {
			num[index +1] = (char) (i + '0');
			printCoreRecursively(index+1);
		}
	}
}
