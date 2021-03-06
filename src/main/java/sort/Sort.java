package sort;

import java.util.Comparator;
import java.util.Random;

public class Sort<T extends Comparable<T>> implements Comparator<T> , Cloneable{
	
	public static enum FieldType  {INTEGER, INT, LONG, FLOAT, DOUBLE};

	public void swap(T[] data , int from , int to){
		if(from < 0 || from >= data.length || to < 0 || to > data.length){
			System.out.println("Swap Error!");
			throw new IndexOutOfBoundsException("Swap Error!");
		}
		if(from == to){
			return;
		}
		T tmp = data[from];
		data[from] = data[to];
		data[to] = tmp;
	}
	
	public void swapInt(int[] data , int from , int to){
		if(from < 0 || from >= data.length || to < 0 || to > data.length){
			System.out.println("Swap Error!");
			throw new IndexOutOfBoundsException("Swap Error!");
		}
		if(from == to){
			return;
		}
		int tmp = data[from];
		data[from] = data[to];
		data[to] = tmp;
	}
	
	public Double[] getDoubleRandArray(int size , int scope){
		Double [] array = new Double[size];
		Random r = new Random();
		for(int i=0 ; i<size ; i++){
			array[i] = new Double(r.nextDouble()*scope);
		}		
		return array;
	}
	
	public Integer[] getIntegerRandArray(int size , int scope){
		Integer [] array = new Integer[size];
		Random r = new Random();
		for(int i=0 ; i<size ; i++){
			array[i] = new Integer(r.nextInt(scope));
		}		
		return array;
	}
	public  Integer[] intToInteger(int[] data) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[data.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = data[i];
		}
 		return array;
	}
	
	public  int[] integerToInt(Integer[] data) {
		// TODO Auto-generated method stub
		int[] array = new int[data.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = data[i];
		}
 		return array;
	}
	@Override
	public int compare(T object1, T object2) {
		// TODO Auto-generated method stub
		return object1.compareTo(object2);
	}
}
