package com.ajinkya.threading;

// 1. extend the THREAD CLASS 

/*public class Application1 {

	public static void main(String[] args) {
		
		Thread1 t1= new Thread1("Ajinkya");
		t1.start();
		Thread1 t2= new Thread1("Swati");
        t2.start();
		System.out.println("Hi,There");
		
	}

}

class Thread1 extends Thread {
	private String name;
	public Thread1(String name) {
		this.name=name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i =0 ; i<10;i++) {
//			System.out.println(" Number" +i+" " +Thread.currentThread().getName());
			System.out.println(" Number" +i+" " +Thread.currentThread().getName());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
		
	}
	
}*/

// 2.	implement the runnable interface

public class Application1 {
	public static void main(String[] args) {
		System.out.println(" hi,there");
		System.out.println("starting thread 1");
	     Threads t1 = new Threads("Ajinkya");
	     Thread task1= new Thread(t1);
	     task1.start();
	     
	     System.out.println("starting thread 2");
	     Threads t2 = new Threads("Swati");
	     Thread task2= new Thread(t2);
	     task2.start();
	}
	
	

}

class Threads implements Runnable {

	private String name;
	public Threads(String name) {
	this.name= name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
	for (int i = 0; i < 10; i++) {
		System.out.println("Number " +i+ " " +Thread.currentThread().getName());
	}
		
	}
	
}
