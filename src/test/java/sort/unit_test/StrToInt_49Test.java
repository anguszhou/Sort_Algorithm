package sort.unit_test;

import static org.junit.Assert.*;
import interview_questions.StrToInt_49;

import org.junit.Test;

public class StrToInt_49Test {

	public StrToInt_49 ss = new StrToInt_49();
	@Test
	public void test1() {
		System.out.println(ss.strToInt("asdfsdf"));	
	}
	@Test
	public void test2() {
		System.out.println(ss.strToInt("-"));
	}
	@Test
	public void test3() {
		System.out.println(ss.strToInt("+"));
	}
	@Test
	public void test4() {
		System.out.println(ss.strToInt(""));
	}
	@Test
	public void test5() {
		System.out.println(ss.strToInt(null));
	}
	@Test
	public void test6() {
		System.out.println(ss.strToInt("436457323413124"));
	}
	@Test
	public void test7() {
		// 2^31 = 2147483648
		System.out.println(ss.strToInt("-2147483648"));
	}
	@Test
	public void test8() {
		System.out.println(ss.strToInt("2147483647"));
	}
	@Test
	public void test9() {
		System.out.println(ss.strToInt("2147483648"));
	}

}
