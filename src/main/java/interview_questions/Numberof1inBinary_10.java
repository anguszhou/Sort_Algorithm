package interview_questions;

import java.util.Random;

public class Numberof1inBinary_10 {
	
	public static void main(String[] args){
		Numberof1inBinary_10 n = new Numberof1inBinary_10();
		Random r = new Random();
		int num = r.nextInt(10);
		int i = n.getNumberof1_method3(num);
		System.out.println(num + " : "+i);
	}

	/**
	 * if n is negative , it will be 0xFFFFF
	 * 1101 0000 -> 1110 1000 -> 1111 0100
	 * ->1111 1010 ...-> 1111 1111  
	 */
	public int getNumberof1_method1(int n){
		int count = 0;
		while(n != 0){
			if((n & 1) != 0){
				count ++;
			}
			n = n >>1;
		}
		return count;
	}
	
	/**
	 * iterator the times which int has (32) 
	 */
	public int getNumberof1_method2(int n){
		int flag = 1 , count = 0;
		while(flag != 0){
			if((n & flag) != 0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
	
	/**
	 * iterator the times which number has 1 in binary 
	 */
	public int getNumberof1_method3(int n){
		int count = 0;
		while(n != 0 ){
			int tmp = n - 1;
			n = n & tmp;
			count++;
		}
		
		return count;
	}
}
