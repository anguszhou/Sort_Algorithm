package interview_questions;

public class Power_11 {

	/**
	 * return pow exponent of num
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power_11 pp = new Power_11();
		System.out.println(pp.power(2, 16));
		System.out.println(pp.power(2, -7));
		System.out.println(pp.power(-2, 7));
		System.out.println(pp.power(-2, -7));
		System.out.println(pp.power(2, 0));
		System.out.println(pp.power(0, 7));
		System.out.println(pp.power(0, -7));
	}

	public double power(double num , int exponent){
		
		if(equal(num , 0.0) && exponent < 0 ){
			throw new IndexOutOfBoundsException("Error input.");
		}
		
		int absExponent = exponent;
		if(exponent < 0){
			absExponent = - exponent;
		}
		double result = powerWithAbsexponent(num , absExponent);
		if(exponent < 0 ){
			result = 1 / result;
		}
		return result;
	}

	private double powerWithAbsexponent(double num, int absExponent) {
		// TODO Auto-generated method stub
		if(absExponent == 0){
			return 1;
		}
		if(absExponent ==1){
			return num;
		}
		
		double result = powerWithAbsexponent(num, absExponent >> 1);
		result *= result;
		
		if( (absExponent & 0x1) == 1){
			result *= num;
		}
		return result;
	}

	private boolean equal(double num, double d) {
		// TODO Auto-generated method stub
		if( (num - d > -0.000000001) && (num - d < 0.0000000001) ){
			return true;
		}
		return false;
	}
}
