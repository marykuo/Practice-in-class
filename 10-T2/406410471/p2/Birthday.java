package p2;

public class Birthday extends Time{

	private String userID;
	
	public Birthday(String userID) {
		super();
		this.userID=userID;
	}

	public Birthday(String userID, int year, int month, int day, int hour, int minute, int second) {
		super(year, month, day, hour, minute, second);
		this.userID=userID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		String Y = "",MM = "",D = "",H = "",M = "",S = "";
		if(getYear()/1000 == 0){
			Y="0";
		}
		if(getMonth()/10 == 0){
			MM="0";
		}
		if(getDay()/10 == 0){
			D="0";
		}
		if(getHour()/10 == 0){
			H="0";
		}
		if(getMinute()/10 == 0){
			M="0";
		}
		if(getSecond()/10 == 0){
			S="0";
		}
		return " "+userID+", "+Y+getYear()+"/"+MM+getMonth()+"/"+D+getDay()+" "+H+getHour()+":"+M+getMinute()+":"+S+getSecond()+" ";
	}
	

	
}
