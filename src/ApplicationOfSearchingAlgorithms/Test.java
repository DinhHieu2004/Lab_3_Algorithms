package ApplicationOfSearchingAlgorithms;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product("Gao","11",10.0,"loai1");
		Product p2 = new Product("nep","10",14.0,"loai2");
		Product p3 = new Product("bap","12",9.0,"loai1");
		Product p4 = new Product("dau","8",17.0,"loai2");
		Product p5 = new Product("ot","15",6.0,"loai1");
		Product p6 = new Product("nep","10",14.0,"loai2");
		
		OrderItem o1 = new OrderItem(p1, 10);
		OrderItem o2 = new OrderItem(p2, 13);
		OrderItem o3 = new OrderItem(p3, 12);
		OrderItem o4 = new OrderItem(p4, 11);
		
		OrderItem[] arr = {o1,o2,o3,o4};
		
		Order oder = new Order(arr);
		System.out.println(oder.contains(p1));
		//oder.contains(p5);
		oder.filter("loai1");
		
	}
}
