package unit08_객체구현하기_복습;

public class Customer {
	String nickName;
	String address;
	int money;
	String phoneNumber;
	String likeMenuNum = "001";
	
	public Customer () {
		
	}
	
	public Customer (String nickName, String address, int money, String phoneNumber) {
		this.nickName = nickName;
		this.address = address;
		this.money = money;
		this.phoneNumber = phoneNumber;
	}
	
	public void showCustomerInfo() {
		System.out.printf("%s에 사는 %s고객님의 핸드폰 번호는 %s 입니다. \n",address,nickName,phoneNumber);
	}
	
}
