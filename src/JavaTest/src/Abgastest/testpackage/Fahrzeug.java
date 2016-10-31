package Abgastest.testpackage;


public class Fahrzeug implements Teststand {
	
	private Color farbe;
	private Hersteller hersteller;
	private Modell modell;
	
	public Color getFarbe() {
		return farbe;
	}
	public void setFarbe(Color f) {
		farbe = f;
	}
	public Hersteller getHersteller() {
		return hersteller;
	}
	public void setHersteller(Hersteller h) {
		hersteller = h;
	}
	public Modell getModell() {
		return modell;
	}
	public void setModell(Modell m) {
		modell = m;
	}
	
}
