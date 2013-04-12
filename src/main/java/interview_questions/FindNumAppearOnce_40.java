package interview_questions;

public class FindNumAppearOnce_40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,2,3,4,5,6,7,8,3,1,6,8,7,2};
		FindNumAppearOnce_40 f= new FindNumAppearOnce_40();
		int[] result = f.findNumAppearOnce(data, data.length);
		System.out.println(result[0]+" : "+ result[1]);
	}
	
	/**
	 * there are two num in data only appear once,
	 * and others in data appear twince.
	 * 
	 *  num xor num = 0
	 */
	public int[] findNumAppearOnce(int[] data , int length){
		int[] result = new int[2];
		if(data == null || length < 2){
			throw new IndexOutOfBoundsException("Input array error.");
		}
		int tmp = 0;
		for (int i = 0; i < data.length; i++) {
			tmp ^= data[i] ;
		}
		int indexof1 = findFirstBitof1(tmp);
		
		for (int i = 0; i < data.length; i++) {
			if( isBit1(data[i], indexof1 )){
				result[0] ^= data[i];
			}else{
				result[1] ^= data[i];
			}
		}
		return result;
	}

	private int findFirstBitof1(int tmp) {
		// TODO Auto-generated method stub
		int indexBit = 0 , copytmp = tmp;
		
		while((tmp & 1)==0 && indexBit <= 32){
			tmp = tmp >> 1;
			indexBit++;
		}

		return indexBit;
	}
	
	private boolean isBit1(int num , int indexBit){
		num = num >> indexBit;
		return (num & 1) == 1 ? true : false;
	} 
}
