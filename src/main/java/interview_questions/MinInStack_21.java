package interview_questions;

import java.util.Random;
import java.util.Stack;

public class MinInStack_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinInStack_21 mis = new MinInStack_21();
		Random r = new Random();
		int size = r.nextInt(10);
		for(int i = 0 ; i < size ; i++){
			int tmp = r.nextInt(100);
			mis.push(tmp);
			System.out.print(tmp+" , ");
		}
		System.out.println();
		System.out.println(mis.min());
	}
	
	Stack m_data = new Stack();
	Stack m_min = new Stack();
	
	public void push(int value){
		m_data.push(value);
		
		if(m_min.size() == 0 || (Integer)m_min.peek() > value){
			m_min.push(value);
		}else{
			m_min.push(m_min.peek());
		}
	}
	
	public int pop(){
		if(m_data.empty() || m_min.empty()){
			throw new NullPointerException("Stack is empty");
		}
		m_min.pop();
		return (Integer)m_data.pop();
	}
	
	public int min(){
		if(m_data.empty() || m_min.empty()){
			throw new NullPointerException("Stack is empty");
		}
		return (Integer)m_min.peek();
	}
}
