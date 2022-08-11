package unit04_멤버변수_메서드;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	// 학의 정보를 보여주는 메서드 
	public void showStudentInfo() {
		System.out.println( studentID + "학번 학의 이름은 " + studentName + "이고, 주소는 "+ address + "입니다.");
	}
	
	// 학생의 이름을 가져오는 메서드 
	public String getStudentName() {
		return studentName;
	}
	
	// 학생의 이름을 지정해주는 메서드 
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
