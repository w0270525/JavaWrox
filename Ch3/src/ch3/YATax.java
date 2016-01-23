package ch3;

public class YATax extends Tax{

	//three argument constructor.
	YATax(double gi, String st, int dep){
		this.grossIncome=gi;
		this.state=st;
		this.dependents=dep;
	}
	
	static double dollarToEuro(double dollar){
		return dollar *1.25;
		
		
	}
}
