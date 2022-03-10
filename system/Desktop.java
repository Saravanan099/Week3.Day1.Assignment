package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
	
		System.out.println("Desktop Size of the Computer");
	}
	public static void main(String[] args) {
	Desktop Desk = new Desktop();
	Desk.desktopSize();
	Desk.computerModel();
	}
}
