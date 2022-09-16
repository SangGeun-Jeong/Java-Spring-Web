package unit08_객체구현하기_복습;

public class Person {
	int height;
	int weight;
	int age;
	String sex;
	String name;
	
	public Person() {
		
	}
	
	public Person(int height, int weight, int age, String sex, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	
	public void showCustomerInfo() {
		System.out.printf("키가 %d 이고 몸무게가 %d 킬로인 %s이 있습니다. 이름은 %s 이고 나이는 %d 세 입니다.", height, weight, sex, name, age);
	}
	
}
