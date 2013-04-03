package sort.unit_test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import sort.Sort;
import sort.swap.QuickSort;

public class Test_Quick_Sort {

	@Test
	public void testQuickSort() {
		QuickSort<Integer> s = new QuickSort<Integer>();
		Integer[] array = s.getIntegerRandArray(10, 100);
		Integer[] arraycopy = array.clone();
		
		System.out.println("QuickSort before :");
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i]+" , ");
		}
		
		Arrays.sort(arraycopy , new Sort());
		s.quickSort(array , array.length , 0 , array.length-1);
		
		System.out.println();
		System.out.println("QuickSort after :");
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i]+" , ");
		}
		
		for(int i = 0 ; i < arraycopy.length ; i++){
			assertEquals(array[i], arraycopy[i]);
		}
	}

}
