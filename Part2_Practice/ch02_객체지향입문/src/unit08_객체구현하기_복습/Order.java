package unit08_객체구현하기_복습;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Order {
	String ordNumber;
	String ordPhoneNumber;
	String ordAddress;
	String ordDate;
	String ordTime;
	String ordMenuNum;
	String cusMenu;
	
	String menu1 = "001";
	String menu2 = "002";
	String menu3 = "003";
	
	public Order() {
		
	}
	
	public Order(String cusPhone, String cusAddress, String cusMenu) {
		this.ordPhoneNumber = cusPhone;
		this.ordAddress = cusAddress;
		this.cusMenu = cusMenu;
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdfDate = new SimpleDateFormat ("yyyyMMdd");
		SimpleDateFormat sdfTime = new SimpleDateFormat ("hhmmss");
		this.ordDate = sdfDate.format(timestamp);
		this.ordTime = sdfTime.format(timestamp);
		
		if (menu1.equals(cusMenu)) {
			this.ordMenuNum = "8000";
		} else if(menu2.equals(cusMenu)) {
			this.ordMenuNum = "9000";
		} else if (menu3.equals(cusMenu)) {
			this.ordMenuNum = "10000";
		} else {
			this.ordMenuNum = "메뉴가 잘못 선택 되었습니다.";
		}
		
		this.ordNumber = this.ordDate + cusMenu;
		
	}
	
	public void showOrder() {
		System.out.printf("주문 접수 번호 : %s \n주문 핸드폰 번호 : %s \n주문 집 주소 : %s \n주문 메뉴 : %s \n주문 날짜 : %s"
				+ "\n주문 시간 : %s \n메뉴 번호 : %s",
				ordNumber, ordPhoneNumber, ordAddress, ordMenuNum, ordDate, ordTime, cusMenu);
	}
	
}
