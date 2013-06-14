package interview_questions;

public class VerifySquenceOfBST_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] tmp = {5,7,6,9,11,10,8};
		int[] tmp = {7,4,6,5};
		VerifySquenceOfBST_24 vs = new VerifySquenceOfBST_24();
		System.out.println(vs.verifySquenceOfBST(tmp, 0, tmp.length-1));
	}

	public boolean verifySquenceOfBST(int[] squence , int start , int end){
		if(squence == null || end < start  ){
			throw new NullPointerException("Input is null.");
		}
		
		int root = squence[end];
		int i = start ;
		for(; i < end ; i++){
			if(squence[i] > root){
				break;
			}
		}
		int j = i ;
		for( ; j < end ; j++){
			if(squence[j] < root)
				return false;
		}
		
		boolean left = true;
		if(i > start){
			left = verifySquenceOfBST(squence, start, i-1);
		}
		boolean right = true;
		if(i < end -1 ){
			right = verifySquenceOfBST(squence, i, end-1);
		}
		
		return (left && right);
	}
}
