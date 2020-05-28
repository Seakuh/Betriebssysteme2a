package ctr;

public class MyThread extends Thread {

	private String name = "";
	private Speicherzelle speicher;

	public MyThread(String name, Speicherzelle speicher) {
		this.name = name;
		this.speicher = speicher;
	}

	@Override
	public void run() {
		System.out.println("Hello from MyThread");
		Speicherzelle speicher2 = new Speicherzelle();
		speicher.swapWert(speicher2);
	}

}
