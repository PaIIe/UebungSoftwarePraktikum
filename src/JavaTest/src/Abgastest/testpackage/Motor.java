package Abgastest.testpackage;

public class Motor {
	private int drehzahl;
	private double effizienz;
	
	double CO2Ausstoﬂ(){
		return ((drehzahl * effizienz) / 10); 
	}
	void setDrehzahl(int Geschwindigkeit) // gehen von ganzahligen Geschwindigkeiten aus
	{
		drehzahl = Geschwindigkeit * 10;
	}
	int getDrehzahl()
	{
		return drehzahl;
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
