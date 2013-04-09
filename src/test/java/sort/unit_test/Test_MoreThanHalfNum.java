package sort.unit_test;

import static org.junit.Assert.assertEquals;

import interview_questions.MoreThanHalfNum_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.xml.datatype.DatatypeFactory;

import org.junit.Test;



public class Test_MoreThanHalfNum {
	int size_scope = 20;
	int num_scope = 100;
	
	private int[] createRandomArray(int num_scope , int size_scope){
		int[] data = new int[size_scope];
		Random r = new Random();
		int same = r.nextInt(size_scope/2)+size_scope/2;
		Set<Integer> set = new HashSet();
		while(true){
			int value = r.nextInt(num_scope);
			set.add(value);
			if(set.size() == size_scope-same+1){
				break;
			}
		}
		int index=0;
		for (Integer  i: set) {
			data[index] = i;
			index++;
		}
		for(;index < data.length ; index++){
			data[index] = data[index-1];
		}
		shuffle(data);
		return data;
	}

	private int[]shuffle(int[] data){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		Random r = new Random();
		int index = data.length;
		
		for (int i = 0; i < data.length; i++) {
			int rand = r.nextInt(index--);
			data[i] = list.get(rand);
			list.remove(rand);
		}
		return data;
	}
	
	private int[] integerToInt(Integer[] temp) {
		// TODO Auto-generated method stub
		int[] array = new int[temp.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}
 		return array;
	}

	@Test
	public void test_MoreThanHalfNum() {
		int[] data = createRandomArray(num_scope, size_scope);
		MoreThanHalfNum_29 mm = new MoreThanHalfNum_29();
		int result = mm.moreThanHalfNum(data , data.length);
		System.out.println("test MoreThanHalfNum :");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("result is : "+result);
		assertEquals(result, 1);
	}
	
	@Test
	public void test_MoreThanHalfNum2() {
		int[] data = createRandomArray(num_scope, size_scope);
		MoreThanHalfNum_29 mm = new MoreThanHalfNum_29();
		int result = mm.moreThanHalfNum2(data , data.length);
		System.out.println("test MoreThanHalfNum2 :");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" , ");
		}
		System.out.println();
		System.out.println("result is : "+result);
		assertEquals(result, 1);
	}

}
