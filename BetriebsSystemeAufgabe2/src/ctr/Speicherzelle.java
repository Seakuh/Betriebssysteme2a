package ctr;

class Speicherzelle {

	private int wert;

	static Speicherzelle s1 = new Speicherzelle(10);
	static Speicherzelle s2 = new Speicherzelle(20);

	public Speicherzelle(int i) {
		wert = i;
	}

	public Speicherzelle() {	
	}
	public synchronized void setWert(int w) {
		wert = w;
	}

	public synchronized int getWert() {
		return wert;

	}

	public synchronized void swapWert(Speicherzelle s) {

		System.out.println(Thread.currentThread().getName() + "  in SwapWert");

		int h = s.getWert();

		try {
			System.out.println("test sleep");
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s.setWert(wert);
		setWert(h);
	}
}