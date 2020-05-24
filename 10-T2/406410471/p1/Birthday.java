package p1;

public class Birthday {

	private String userID;
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	
	public Birthday(String userID) {
		this.userID=userID;
	}

	public Birthday(String userID, int year, int month, int day, int hour, int minute, int second) {
		this.userID=userID;
		this.year=year;
		this.month=month;
		this.day=day;
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		String Y = "",MM = "",D = "",H = "",M = "",S = "";
		if(year/1000 == 0){
			Y="0";
		}
		if(month/10 == 0){
			MM="0";
		}
		if(day/10 == 0){
			D="0";
		}
		if(hour/10 == 0){
			H="0";
		}
		if(minute/10 == 0){
			M="0";
		}
		if(second/10 == 0){
			S="0";
		}
		return " "+userID+", "+Y+year+"/"+MM+month+"/"+D+day+" "+H+hour+":"+M+minute+":"+S+second+" ";
	}
	
	
}
