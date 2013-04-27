package interviewOfValueBook;

public class Operator_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 0xA5;
		System.out.println(a);
		int b =  (char) (~a>>4+1);
		System.out.println(b);
	}

}
