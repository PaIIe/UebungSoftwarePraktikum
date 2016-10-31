package Abgastest.testpackage;

public interface Teststand {
	
	public static void performCO2Test(Fahrzeug auto)
	{
		int[] speed = new int[]{20, 50, 70, 100, 120}; // Geschwindigkeiten Testwerte für Motor
		Motor motor = new Motor();
		motor.setDrehzahl(speed);
		motor.CO2Ausstoß();
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Perform CO2-Test");
		Fahrzeug auto1 = new Fahrzeug();
		auto1.setFarbe(Color.RED);
		auto1.setHersteller(Hersteller.IW);
		auto1.setModell(Modell.TENNIS);
		Fahrzeug auto2 = new Fahrzeug();
		auto2.setFarbe(Color.GREEN);
		auto2.setHersteller(Hersteller.SMW);
		auto2.setModell(Modell.M6);
		Fahrzeug auto3 = new Fahrzeug();
		auto3.setFarbe(Color.BLUE);
		auto3.setHersteller(Hersteller.IW);
		auto3.setModell(Modell.SMARTTENNIS);
		performCO2Test(auto1);
		performCO2Test(auto2);
		performCO2Test(auto3);
		
	}
}
