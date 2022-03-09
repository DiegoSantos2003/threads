package controller;
public class imprimirthread extends Thread {
	public void run() {
		System.out.println("Thread TID: " + this.getId());
	}
}