package sort.unit_test;

import static org.junit.Assert.*;

import interview_questions.GetLeastNumbers_30;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;


import sort.swap.QuickSort;

public class Test_GetLeastNumbers_30 {
	
	private int size = 20;
	private int scope = 100;

	@Test
	public void test_GetLeastNumber_usePartition() {
		QuickSort s = new QuickSort();
		Integer[] data = s.getIntegerRandArray(size, scope);
		Integer[] copydata = data.clone();
		
		System.out.println("rand array :");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		
		System.out.println();
		Arrays.sort(copydata);
		System.out.println("after sore data:");
		for (int i = 0; i < copydata.length; i++) {
			System.out.print(copydata[i]+" , ");
		}
		
		System.out.println();
		GetLeastNumbers_30 gg = new GetLeastNumbers_30();
		Random r = new Random();
		int k = r.nextInt(size-1)+1;
		System.out.println("least of "+k+" number");
		int[] result = gg.getLeastNumbers(data, data.length, k);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" , ");
		}
	}

}
