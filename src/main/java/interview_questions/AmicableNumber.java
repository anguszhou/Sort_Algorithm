package interview_questions;

public class AmicableNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmicableNumber aa = new AmicableNumber();
		aa.printAmicableNum(5000000);
	}
	
	public void printAmicableNum(int size){
		int sum[] = new int[size+1];
		//init sum[i]=1  O(n)
		for (int i = 0; i <= size; i++) {
			sum[i] = 1;
		}
		
		/*
		*预处理，预处理是logN（调和级数）*N。 
		*@litaoye：调和级数1/2+1/3+1/4......的和近似为ln(n)， 
		*因此O(n*(1/2+1/3+1/4......))=O(n*ln(n))=O(N*log(N))。 
		*/
		for (int i = 2; i+i <= size; i++) {
			//except itself
			int j = i+i;
			//add i for every multiple num
			while(j <= size){
				sum[j] += i;
				j += i;
			}
		}
		
		//O(n)  
		//一次遍历，因为知道最小是220和284因此从220开始 
		for (int i = 2; i <= size; i++) {
			//去重，不越界，满足亲和 
			if(sum[i] > i && sum[i] <= size && sum[sum[i]] == i){
				System.out.println(i+" : "+sum[i]);
			}
		}
	}
}
