package unit08_복습정답자료;

public class Order {
	
	// Date나 Calender 객체를 사용할 줄 알면 시간이나 날짜에 대한 값은 해당 객체 사용.
	// 여기서 숫자에 해당되는 자료형을 String으로 표현한 건 0으로 시작 될 가능성이 있는 숫자에 해당합니다.
	
	public String orderNumber;
	public String customerPhone;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public int price;
	public String menuId;
	
	public void showOrderDetail() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번 : " + orderNumber);
		System.out.println("주문 집 주소 : " + orderNumber);
		System.out.println("주문 날짜 : " + orderNumber);
		System.out.println("주문 시간 : " + orderNumber);
		System.out.println("주문 가격 : " + orderNumber);
		System.out.println("메뉴 번호 : " + orderNumber);
	}
}
