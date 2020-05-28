package ctr;

public class TestSpeicherZelle {
	
	public static void main(String[] args) {
		Speicherzelle zelle1 = new Speicherzelle();
		
		MyThread t1 = new MyThread("T1",zelle1);
		MyThread t2 = new MyThread("T2",zelle1);
		
		t1.start();
		t2.start();
		
	}

}
