package Abgastest.testpackage;

public class Motor {
	private int[] drehzahl;
	private double effizienz;
	
	void CO2Aussto�(){
		for (int j=0; j<5; j++)
		{
			System.out.printf("CO2-Aussto�: %f", ((drehzahl[j] * effizienz) / 10)); 
		}
		
	}
	
	void setDrehzahl(int[] Geschwindigkeit) // gehen von ganzahligen Geschwindigkeiten aus
	{
		for (int i = 0; i < 5; i++)
		{
			drehzahl[i] = Geschwindigkeit[i] * 10;
			System.out.printf("Geschwindigkeit : %d\n, Drehzahl: %d\n", Geschwindigkeit[i], drehzahl[i]);
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
