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
	
	@Override
	public int compare(T object1, T object2) {
		// TODO Auto-generated method stub
		return object1.compareTo(object2);
	}
}
