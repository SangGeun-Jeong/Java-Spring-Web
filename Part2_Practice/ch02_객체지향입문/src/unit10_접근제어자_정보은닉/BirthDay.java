package unit10_접근제어자_정보은닉;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // default값 >> false
	
	public int getDay() {
		return day;
	}
	
	// source -> generate getter and setter
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( month < 1 || month > 12) {
			isValid = false;
		} else {			
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	// set은 제공하지 않음. -> Read Only
	public boolean getIsValid() {
		return isValid;
	}
	
	
}
