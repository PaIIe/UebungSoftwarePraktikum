package Abgastest.testpackage;

public class Motor {
	private int[] drehzahl;
	private double effizienz;
	
	void CO2Ausstoﬂ(boolean smart){
		
			for (int j=0; j<5; j++)
			{
				if (smart == true){
					SmartTennis smartTennis = new SmartTennis();
					smartTennis.manipulateCO2Ausstoﬂ((drehzahl[j] * (1 - effizienz)) / 10 * 6 / 10); 
				}
				if (smart != true){
					System.out.printf("CO2-Ausstoﬂ: %.2f g/km\n", ((drehzahl[j] * (1 - effizienz)) / 10));
				}
			}
			
	}
	
	void setDrehzahl(int[] Geschwindigkeit) // gehen von ganzahligen Geschwindigkeiten aus
	{
		drehzahl = new int[5];
		try{
			for (int i = 0; i < 5; i++)
			{
				drehzahl[i] = Geschwindigkeit[i] * 10;
				System.out.printf("Geschwindigkeit : %d km/h, Drehzahl: %d 1/min\n", Geschwindigkeit[i], drehzahl[i]);
			}
		}
		/*DEBUG*/
		catch(NullPointerException e){
			throw new IllegalStateException("Speed has a Null porperty", e);
		}
		
	}
	
	void setEff(double eff)
	{
		effizienz = eff;
	}
	
	double getEff()
	{
		return effizienz;
	}
}