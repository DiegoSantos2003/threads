package view;
import controller.imprimirthread;
public class view {
	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			Thread thread = new imprimirthread();
			thread.start();
		}
	}
}