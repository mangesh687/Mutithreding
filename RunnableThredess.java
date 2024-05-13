package com.mutithreding;
class Process3 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("process 3 is working "+i);
		}
		
	}
}
class Process4 extends Thread{
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println("process 4 is working "+i);
		}
	}
}

public class RunnableThredess {
	public static void main(String[] args) {
		Process3 p1=new Process3();
		Process4 p2=new Process4();
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p2);
		t1.start();
		t2.start();
	}

}
