package interview_questions;

import sort.Sort;

public class RecorderOddEven_14 {

	/**
	 * move all odd number to the front of even number in array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s = new Sort();
		int[]data = s.integerToInt(s.getIntegerRandArray(10, 100));
		System.out.println("before : ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		
		System.out.println();
		System.out.println("after : ");
		data = new RecorderOddEven_14().recorderOddEven(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
	}

	public int[] recorderOddEven(int[] data){
		if(data == null){
			throw new IncompatibleClassChangeError("Error input array.");
		}
		int odd = 0 , even = data.length - 1;
		while(odd < even){
			while(odd < even && isOdd(data[odd])){
				odd++;
			}
			while(odd < even && !isOdd(data[even])){
				even--;
			}
			if(odd < even){
				int tmp = data[odd];
				data[odd] = data[even];
				data[even] = tmp;
			} 
		}
		return data;
	}

	private boolean isOdd(int i) {
		// TODO Auto-generated method stub
		if( (i & 0x1) != 0)
			return true;
		return false;
	}
}
