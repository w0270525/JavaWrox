package ch3;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	
	Tax(){
		this.grossIncome=0;
		this.state="NY";
		this.dependents=0;
	}
	
	Tax(double gi, String st, int dep){
		this.grossIncome=gi;
		this.state=st;
		this.dependents=dep;
	}
	
	public double calcTax()
	{
		double stateTax=0;
		if(grossIncome <30000) {
			stateTax = grossIncome * 0.05;
		}
		else {
			stateTax=grossIncome*0.06;
		}
		return stateTax;
	}

	
}
