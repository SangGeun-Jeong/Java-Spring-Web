package unit08_객체구현하기_복습;

public class LeeGaNe {
	public static void main(String[] args) {
		
		Customer customer = new Customer("Toproot", "풍영로101번안길", 300000, "01098765431");
		customer.showCustomerInfo();
		
		Order order = new Order(customer.phoneNumber, customer.address, customer.likeMenuNum);
		order.showOrder();
		
	}
}
