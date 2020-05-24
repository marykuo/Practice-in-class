package T2;

public abstract class Employee {
	protected int empID;
	protected String name;
	protected String ID;
	protected String title;
	
	public Employee(int empID, String name, String ID, String title) {
		this.empID=empID;
		this.name=name;
		this.ID=ID;
		this.title=title;
	}
	//存有員工ID(empID,整數)，姓名(name,字串)，身分證(id,字串)，職稱(title,字串)

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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract int yearEarning();
	
}
