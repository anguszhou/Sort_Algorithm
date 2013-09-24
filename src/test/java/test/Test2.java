package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test2 {
	
	public void deleteStr(char[]str1, char[] str2){
		HashMap<Character,Integer> map = new HashMap();
		
		for (int i = 0; i < str1.length; i++) {
			if(map.containsKey(str1[i])){
				map.put(str1[i],map.get(str1[i])+1);
			}else{
				map.put(str1[i], 1);
			}
			
		}
		for (int i = 0; i < str2.length; i++) {
			if(map.containsKey(str2[i])){
				if(map.get(str2[i]) > 1){
					map.put(str2[i], map.get(str2[i])-1);
				}else if(map.get(str2[i]) == 1){
					map.remove(str2[i]);
				}
			}
			
				
		}
		for (Entry<Character,Integer> c : map.entrySet()) {
			for (int i = 0; i < c.getValue(); i++) {
				System.out.println(c.getKey());
			}
			
		}
	}
	
	public static void main(String[] args){
		char[] str1 = {'T','h','i','s',' ','i','s',' ','a',' ','b','o','o','k'};
		char[] str2 = {'b','a','b','k'};
		Test2 aa = new Test2();
		aa.deleteStr(str1, str2);
		//new A();
		/*int intArray[];
		
		intArray = new int[3];
		intArray[1]=1;
		intArray[2]=2;
		intArray[3]=3;
		
		int a[]={1,2,3,4,5};
		
		int[][]aa=new int[2][];
		aa[0]=new int[3];
		aa[1]=new int[3];
		
		int x =100;*/

	}
}

class B extends Object{
	static {System.out.println("load b");}
	public B(){
		System.out.println("creat b");
	}
}

class A extends B{
	static {System.out.println("load a");}
	public A(){
		System.out.println("creat a");
	}
}