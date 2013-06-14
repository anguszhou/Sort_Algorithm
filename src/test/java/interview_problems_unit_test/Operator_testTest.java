package interview_problems_unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Operator_testTest {

	@Test
	public void test1() {
		System.out.println("test1");
		char a = 0xA5;
		int b =  (char) (~a>>4+1);
		System.out.println(b);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		short a = 100;
		int b =  (char) (a>>34);
		System.out.println(b);
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
		int b = -100;
		System.out.println(b>>>1);
	}
	@Test
	public void test4() {
		System.out.println("testf");

	}
}
