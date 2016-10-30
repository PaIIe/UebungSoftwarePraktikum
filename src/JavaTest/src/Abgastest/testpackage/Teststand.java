package Abgastest.testpackage;

public interface Teststand {
	
	public enum color {
		RED, GREEN, BLUE
	} 

	public enum hersteller {
		IW, SMW
	}

	public enum modell {
		TENNIS, M6, SMARTTENNIS 
	}
	public static void performCO2Test(Fahrzeug auto)
	{
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Perform CO2-Test");
		Fahrzeug auto1 = new Fahrzeug();
		auto1.setFarbe(RED);
		auto1.setHersteller(IW);
		auto1.setModell(Tennis);
		Fahrzeug auto2 = new Fahrzeug();
		auto2.setFarbe(GREEN);
		auto2.setHersteller(SMW);
		auto2.setModell(M6);
		performCO2Test(auto1);
		performCO2Test(auto2);
		
	}
}
