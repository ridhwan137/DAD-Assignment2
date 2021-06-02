package controller;

import java.util.Scanner;

public class Synchronize {

	public void waitForInput() throws InterruptedException {
		synchronized(this) {
			wait();
		}
	}
	
	public void release() throws InterruptedException {
		Thread.sleep(1000);
		synchronized(this) {
			
			// In order to continue
			Scanner scan = new Scanner(System.in);
			System.out.println("Press to continue......");
			scan.nextLine();
			notify();
		}
	}
}
