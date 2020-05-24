package t2;

public abstract class Employee {
	protected int empID;
	protected String name;
	protected String id;
	protected String title;
	public Employee(String name, String id, int empID, String title) {
		this.name = name;
		this.id = id;
		this.empID = empID;
		this.title = title;
	}
	public Employee() {
		
	}
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public abstract int yearEarning();

	
}
