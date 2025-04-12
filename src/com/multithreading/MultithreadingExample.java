package com.multithreading;

public class MultithreadingExample extends Thread {
	
	public void run() {
		System.out.println("Thread is running");
		
	}
	
	public static void main(String[] args) {
		MultithreadingExample t1 =  new MultithreadingExample();
		Thread mainThread = new Thread();
		System.out.println("MAIN THREAD STATE :" +  mainThread.getState());
		
		
		System.out.println("State after CREATION :" +  t1.getState());
		t1.start();
		System.out.println("State after START :" +  t1.getState());
		System.out.println("MAIN THREAD STATE :" +  mainThread.getState());

		
		try {
			t1.join();
			System.out.println("Main thread state while waiting for worker thread: " + mainThread.getState());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("After t1 joins main thread :" + t1.getState());
		System.out.println("main thread state after t1 has terminated :" + mainThread.getState());
	}

}
 