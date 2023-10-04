package ApplicationOfSearchingAlgorithms;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private String id;
	private Double price;
	private String type;

	public Product(String name, String id, double price, String type) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public String getType() {
		return type;
	}
	@Override
	public int compareTo(Product o) {

		return this.id.compareToIgnoreCase(o.id);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + ", type=" + type + "]";
	}
	

}
