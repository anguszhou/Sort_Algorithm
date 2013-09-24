package test;

import static org.junit.Assert.*;
import interview_questions.StrToInt_49;

import org.junit.Test;

public class problemTest extends Thread{
	
	
	char tmp;
	public problemTest(char a){
		this.tmp =a ;
	}
	
	public void run(){
		try {
			sleep(10);
			System.out.println(this.tmp);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		
		char str[] = {'a','b','c','d','e','f','g','h','i'};
		for (int i = 0; i < str.length; i++) {
			problemTest a = new problemTest(str[i]);
			a.start();
		}
		
	/*	Thread A = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					int i = 0;
					while(i < 1000000) {
						i++;
					}
					System.out.println("A1");
				} catch (Exception e) {
					System.out.println("B1");
				}
				
			}
			
		});
		A.start();
		A.interrupt();
		
		Thread B = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					Thread.sleep(5000);
					System.out.println("A2");
				} catch (Exception e) {
					System.out.println("B2"+e.getClass());
				}
				
			}
			
		});
		B.start();
		B.interrupt();
		
		Thread C = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					wait(50000);
					System.out.println("A3");
				} catch (Exception e) {
					System.out.println("B3"+e.getClass());
				}
				
			}
			
		});
		C.start();
		C.interrupt();
		
		Thread E = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					synchronized(this) {
						this.wait(5000);
					}
					System.out.println("A4");
				} catch (Exception e) {
					System.out.println("B4"+e.getClass());
				}
				
			}
			
		});
		E.start();
		E.interrupt();
		
		try{
			E.start();
			System.out.println("A5");
		} catch (Exception e) {
			System.out.println("B5"+e.getClass());
		}*/

	}
	/*@Test
	public void test1() {
		short a = 128;
		byte b = (byte)a;
		System.out.println(a+":"+b);
	}*/
/*
	@Test
	public void test2() {
		String s = "hello";
		String t = "hello";
		char c[]={'h','e','l','l','o'};
		System.out.println(s.equals(t));
		System.out.println(s.equals(c));
		System.out.println(s==t);
		System.out.println(t.equals(new String("hello")));
		System.out.println(t == new String("hello"));
	}*/

}
