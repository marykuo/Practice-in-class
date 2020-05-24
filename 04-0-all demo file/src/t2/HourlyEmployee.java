package t2;

public class HourlyEmployee extends Employee{

	private int totalHours;
	private int hourPay;
	
	public HourlyEmployee(String name, String id, int empID, String title, int totalHours, int hourPay) {
		super(name,id,empID,title);
		this.totalHours = totalHours;
		this.hourPay = hourPay;
	}

	public String toString() {
        String str = 
        		"Name: " +name+"\n"+
        		"ID: "+id+"\n"+
        		"EmpID: "+empID+"\n"+
        		"Title: "+title+"\n"+
        		"Hourly Employee working "+totalHours+" hours with the rate of "+hourPay+" dollars per hour.";
		return str;
	}

	@Override
	public int yearEarning() {
		return totalHours*hourPay;
	}
	
}

/*
Name: Joyce
ID: J376829345
EmpID: 1200
Title: Secretary
Hourly Employee working 2500 hours with the rate of 130 dollars per hour.
Year earning: 325000
*/