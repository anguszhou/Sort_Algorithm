package interview_questions;

public class Singleton_2 extends Thread{

	private Singleton_2(){
		System.out.println("new a singleton object.");
	}
	private static Object lock = new Object();
	
	private static Singleton_2 instance = null;
	
	public static Singleton_2 getInstance(){
		if(instance == null){
			synchronized (lock) {
				if(instance == null){
					instance = new Singleton_2();
				}
			}
		}
		return instance;
	}
	
	public void run(){
		System.out.println("thread start.");
		System.out.println("thread stop.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton_2.getInstance();
	
		//test for implements Runnable
		for (int i = 0; i < 10; i++) {
			Test t = new Test();
			Thread thread = new Thread(t);
			thread.start();
		}
		
		//test for extend Thread
		for (int i = 0; i < 10; i++) {
			Singleton_2.getInstance().start();
		}
		
	}

}


class Test implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start thread.");
	}
	
}