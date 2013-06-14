package interview_questions;

import java.util.Stack;

public class IsPopOrder_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] push = {1,2,3,4,5};
		int[] pop = {4,3,5,1,2};
		IsPopOrder_22 isp = new IsPopOrder_22();
		System.out.println(isp.isPopOrder(push, pop, 5));
	}
	public boolean isPopOrder(int[]push , int[]pop , int len){
		boolean result = false;
		if(push == null || pop== null || len <=0 ){
			throw new NullPointerException("Input is error.");
		}
		Stack tmp = new Stack();
		int i , j ;
		for( i = 0, j=0 ; i < pop.length ; i++){
			while(tmp.empty() || (Integer)tmp.peek() != pop[i]){
				if( j >= push.length){
					break;
				}
				tmp.push(push[j]);
				j++;
			}
			if((Integer)tmp.peek() != pop[i]){
				break;
			}
			tmp.pop();
		}
		if(tmp.empty() && (i == j) &&(i == len)){
			result = true;
		}
		
		return result;
	}
}
