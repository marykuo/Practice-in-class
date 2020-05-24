package T2;

public class SalariedEmployee extends Employee {
	private int Salary;
	public SalariedEmployee(String name, String ID, int empID, String title, int Salary) {
		super(empID,name,ID,title);
		this.Salary=Salary;
	}
	
	public int yearEarning(){
		return Salary*12;
	}

	public SalariedEmployee() {
		super();
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	
	public String toString() {
		return "Name: " + name + "\n" +
				"ID: " + ID + "\n" +
				"EmpID: "+ empID + "\n" +
				"Title: " + title + "\n" +
				"Salaried Employee with salary " + Salary + " per month.";
	}

}
