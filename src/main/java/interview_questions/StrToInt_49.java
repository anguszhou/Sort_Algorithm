package interview_questions;

public class StrToInt_49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StrToInt_49 ss = new StrToInt_49();
		System.out.println(ss.strToInt("asdfsdf"));
		System.out.println(ss.strToInt("-"));
		System.out.println(ss.strToInt("+"));
		System.out.println(ss.strToInt(""));
		System.out.println(ss.strToInt(null));
		System.out.println(ss.strToInt("436457323413124"));
		System.out.println(ss.strToInt("-235436"));

	}

	public int strToInt(String str){
		if(str == null || str.length() == 0){
			throw new IndexOutOfBoundsException("Input null or blank.");
			//System.out.println("Input null or blank.");
		}
		boolean minus = false;
		if(str.startsWith("+")){
			str = str.substring(1);
		}else if(str.startsWith("-")){
			str = str.substring(1);
			minus = true;
		}
		long result = 0 ;
		if(str.length() != 0){
			result = strToIntCore(str,minus);
		}
		return (int) result;
	}

	private long strToIntCore(String str, boolean minus) {
		// TODO Auto-generated method stub
		long num = 0;
		
		for (int i = 0; i < str.length() ; i++) {
			char c = str.charAt(i);
			if( c <= '9' && c >= '0'){
				num = num*10 + c - '0' ;
			}else{
				//System.out.println("Input error with not number char.");
				throw new IndexOutOfBoundsException("Input error with not number char.");
			}
		}
		if(num > 0x7FFFFFFF){
			throw new IndexOutOfBoundsException("string out of int size");
		}
		if(minus){
			num = 0 - num;
		}
		return num;
	}
}
