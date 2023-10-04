package ApplicationOfSearchingAlgorithms;

public class OrderItem implements Comparable<OrderItem>{
	private Product p;
	private int quality;
	public OrderItem(Product p, int quality) {
		this.p = p;
		this.quality = quality;
	}
	public Product getP() {
		return p;
	}
	
	@Override
	public int compareTo(OrderItem o) {
		
		return this.p.compareTo(o.p);
	}
	

}
