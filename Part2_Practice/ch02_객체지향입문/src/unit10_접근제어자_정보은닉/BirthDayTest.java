package unit10_접근제어자_정보은닉;

public class BirthDayTest {
	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
	}
}
