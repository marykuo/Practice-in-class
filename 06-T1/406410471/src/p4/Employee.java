package p4;

public abstract class Employee extends Person {

	int empID;
	String title;
	
	public Employee(String name, String id, int empID, String title) {
		super(name,id);
		this.empID=empID;
		this.title=title;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Employee() {
		super();
	}
	
	
}
