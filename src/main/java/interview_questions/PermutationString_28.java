package interview_questions;

import java.util.ArrayList;
import java.util.List;

public class PermutationString_28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tt = {'a' , 'b' , 'c','d'};
		PermutationString_28 ps = new PermutationString_28();
		//ps.permutation(tt);
		ps.combination(tt);
	}

	public void permutation(char[] str){
		if(str == null){
			return;
		}
		permutation(str , 0);
	}
	private void permutation(char[] str , int begin){
		if(begin == str.length-1){
			printStr(str);
		}else{
			for(int i = begin ; i < str.length ; i++){
				char tmp = str[i] ;
				str[i] = str[begin];
				str[begin] = tmp;
				
				permutation(str , begin+1);
				
				tmp = str[i] ;
				str[i] = str[begin];
				str[begin] = tmp;
			}
		}
	}

	private void printStr(char[] str) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < str.length ; i++){
			System.out.print(str[i] +" , ");
		}
		System.out.println();
	}
	
	public void combination(char[]str){
		if(str == null){
			return ;
		}
		List<Character> com = new ArrayList();
		for(int i = 1 ; i<= str.length ; i++){
			combination(str ,0 , i , com);
		}
		
	}

	private void combination(char[] str, int begin , int size , List<Character> com) {
		// TODO Auto-generated method stub
		if(size == 0){
			printStr(com);
			return ;
		}
		if(begin == str.length){
			return ;
		}
		com.add(str[begin]);
		combination(str, begin+1, size-1, com);
		com.remove((Character)str[begin]);
		combination(str, begin+1, size, com);
	}

	private void printStr(List<Character> com) {
		// TODO Auto-generated method stub
		for(Character c : com){
			System.out.print(c+",");
		}
		System.out.println();
	}
}
