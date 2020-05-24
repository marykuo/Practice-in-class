package t2;

public class SalariedEmployee extends Employee{

	private int salary;
	
	public SalariedEmployee(String name, String id, int empID, String title, int salary) {
		super(name,id,empID,title);
		this.salary = salary;
	}

	public SalariedEmployee() {
		super();
	}

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
        String str = 
        		"Name: " +name+"\n"+
        		"ID: "+id+"\n"+
        		"EmpID: "+empID+"\n"+
        		"Title: "+title+"\n"+
        		"Salaried Employee with salary "+salary+" per month.";
		return str;
	}

	@Override
	public int yearEarning() {
		return salary*12;
	}
	
	

}

/*
Name: John
ID: A123456789
EmpID: 1100
Title: Manager
Salaried Employee with salary 60000 per month. 
Year earning: 720000
*/