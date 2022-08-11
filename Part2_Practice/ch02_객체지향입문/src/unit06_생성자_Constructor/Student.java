package unit06_생성자_Constructor;

public class Student {
	// 멤버 변수 
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// default 생성자.(생성자가 하나도 없을 때 만들어진다.)
	// 경우에 따라서 디폴트 생성자가 없는 경우도 있음(필수요소들을 받아야 할때.)
	public Student() {
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		// System.out.println("student 생성");
		
		// 객체가 생성될 때 변수 값 초기화.
		// 변수 이름을 같게 해줘야 가시성이 높아짐.
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		// 지역 변수
		// int i;
		
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
