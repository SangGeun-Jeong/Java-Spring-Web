package unit04_멤버변수_메서드;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// 학생 클래스는 하나이고, 학생은 여러명 
		// 이렇게 생성되는 클래스가 인스턴스.
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim); // 객체가 할당된 주소를 디스플레이.
		System.out.println(studentLee);
	}
}
