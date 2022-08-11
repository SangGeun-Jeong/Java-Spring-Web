package unit06_생성자_Constructor;

public class StudentTest {
	// 서비스를 제공하는 Client 모듈 
	public static void main(String[] args) {
		// default 생성자 
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		// 초기화 기능이 있는 생성자.
		Student studentKim = new Student(12345, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}
}
