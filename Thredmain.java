package com.mutithreding;

class Process1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("process 1 is working "+i);
		}
		
	}
}
class Process2 extends Thread{
	public void run() {
		for(int i=0;i<=15;i++) {
			System.out.println("process 2 is working "+i);
		}
	}
}


public class Thredmain {
	public static void main(String[] args) {
		Process1 p1=new Process1();
		Process2 p2=new Process2();
		p1.start();
		p2.start();
		
	}

}
