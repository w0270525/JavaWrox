package ch3;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NJTax t = new NJTax(); //creating an instance
		t.grossIncome=50000;
		t.dependents=2;
		t.state="NJ";
		
		double yourTax = t.calcTax();//calculating tax
		double totalTax = t.adjustForStudents(yourTax);
		
		//printing the result
		System.out.println("Your tax is " + totalTax);
		
	}

}
