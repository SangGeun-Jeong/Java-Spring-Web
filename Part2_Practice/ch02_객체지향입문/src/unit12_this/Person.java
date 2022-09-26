package unit12_this;

public class Person {
	
	String name;
	int age;
	
	// default Construct
	public Person() {
		// 아래 생성된 생성자를 this로 호출.
		// this로 생성자 부를 때는 그 이전에 어떠한 생성도 안됨(최초생성이어야 함)
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
		// person 과 person2는 같은 생성자를 가리키므로 값이 같다.
		// unit12_this.Person@4fccd51b
		// unit12_this.Person@4fccd51b
		
	}
}
