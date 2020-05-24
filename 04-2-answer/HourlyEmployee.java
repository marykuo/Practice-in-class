package T2;

public class HourlyEmployee extends Employee {
	protected int totalHours;
	protected int hourlyPay;
	public HourlyEmployee(String name, String ID, int empID, String title, int totalHours, int hourlyPay) {
		super(empID,name,ID,title);
		this.totalHours=totalHours;
		this.hourlyPay=hourlyPay;
	}

	public int yearEarning(){
		return totalHours*hourlyPay;
	}
	
	public String toString() {
		return "Name: " + name + "\n" +
				"ID: " + ID + "\n" +
				"EmpID: "+ empID + "\n" +
				"Title: " + title + "\n" +
				"Hourly Employee working " + totalHours + " hours with the rate of " + hourlyPay + " dollars per hour.";
	}
	
}
