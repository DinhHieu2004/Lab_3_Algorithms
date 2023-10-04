package ApplicationOfSearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
	private OrderItem[] iTems;

	public Order(OrderItem[] items) {
		this.iTems = items;
	}

	public double cost() {
		double totalPrice = 0;
		for (int i = 0; i < iTems.length; i++) {
			totalPrice += iTems[i].getP().getPrice();
		}
		return totalPrice;
	}

	// using binary search approach
	public boolean contains(Product p) {
		Arrays.sort(iTems);
		int left = 0;
		int right = this.iTems.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			int x = Integer.parseInt(this.iTems[mid].getP().getId());
			int y = Integer.parseInt(p.getId());
			System.out.println(x + " " + y + " " + mid);
			if (this.iTems[mid].getP().equals(p)) {
				return true;

			} else if (x > y) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return false;

	}

	// get all products based on the given type using
	// linear search
	public Product[] filter(String type) {
		ArrayList<Product> arrList = new ArrayList<>();
		for (int i = 0; i < this.iTems.length; i++) {
			if(this.iTems[i].getP().getType().equals(type)) {
				arrList.add(iTems[i].getP());
			}
		}
		Product[] result = arrList.toArray(new Product[0] );
		display(result);
		return result;
	}
	
	public static void display(Product[] listP) {
		for(int i =0;i<listP.length;i++) {
			System.out.println(listP[i]+" ");
		}
	}

}
