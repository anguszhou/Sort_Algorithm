package sort;

public class Sort<T> {
	
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

}
