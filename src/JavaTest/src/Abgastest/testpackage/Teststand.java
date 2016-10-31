package Abgastest.testpackage;

public interface Teststand {
	
	public static void performCO2Test(Fahrzeug auto)
	{
		int[] speed = new int[]{20, 50, 70, 100, 120}; // Geschwindigkeiten Testwerte f¸r Motor
		Motor motor = new Motor();
		motor.setDrehzahl(speed);
		if (auto.getModell() == Modell.M6);
		{
			motor.setEff(0.7);
			motor.CO2Ausstoﬂ();
		}
			
		if (auto.getModell() == Modell.TENNIS);
		{
			motor.setEff(0.3);
			motor.CO2Ausstoﬂ();
		}
			
		if (auto.getModell() == Modell.SMARTTENNIS)
		{
			motor.setEff(0.9);
			motor.CO2Ausstoﬂ();
		}
			
		
		
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
		System.out.printf("\nTennis: \n");
		performCO2Test(auto1);
		System.out.printf("\nM6: \n");
		performCO2Test(auto2);
		System.out.printf("\nSmartTennis \n");
		performCO2Test(auto3);
		
	}
}
