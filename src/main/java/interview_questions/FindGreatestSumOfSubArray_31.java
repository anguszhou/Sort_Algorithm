package interview_questions;

public class FindGreatestSumOfSubArray_31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 *f(i) ={ num[i]        , i = 0  or f(i-1) <= 0
	 *      { f(i-1)+num[i] , i!= 0 or f(i-1) > 0
	 */
	public int findGreatestSumOfSubArray(int[] num , int len){
		if(num == null || len <= 0 ){
			throw new NullPointerException("Invalid input");
		}
		int nCurSum = 0 ;
		int nGreatestSum = 0;
		
		for(int i = 0 ; i < len ; i++){
			if(nCurSum <= 0){
				nCurSum = num[i];
			}else{
				nCurSum += num[i];
			}
			
			if(nGreatestSum < nCurSum){
				nGreatestSum = nCurSum;
			}
		}
		
		return nGreatestSum;
	}
}
