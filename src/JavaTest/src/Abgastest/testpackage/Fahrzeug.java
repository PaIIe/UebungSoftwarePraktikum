package Abgastest.testpackage;


public class Fahrzeug implements Teststand {
	
	public enum color {
		RED, GREEN, BLUE
	} 

	public enum hersteller {
		IW, SMW
	}

	public enum modell {
		TENNIS, M6, SMARTTENNIS 
	}
	
	private color Farbe;
	private hersteller Hersteller;
	private modell Modell;
	
	public color getFarbe() {
		return Farbe;
	}
	public void setFarbe(color farbe) {
		Farbe = farbe;
	}
	public hersteller getHersteller() {
		return Hersteller;
	}
	public void setHersteller(hersteller hersteller) {
		Hersteller = hersteller;
	}
	public modell getModell() {
		return Modell;
	}
	public void setModell(modell modell) {
		Modell = modell;
	}
	
}
