package by.epam.vanofcoffee.entity;

import by.epam.vanofcoffee.run.Runner;

/**
 * @author Vladislav Minich
 *
 */
public class GoodsCoffee {

	public static int amount;
	private double price;
	private double capacity;
	private Coffee typeOfCoffee;
	private Packing typeOfPacking;

	public GoodsCoffee(double price, double capacity, Coffee typeOfCoffee, Packing typeOfPacking) {
		this.price = price;
		this.capacity = capacity;
		this.typeOfCoffee = typeOfCoffee;
		this.typeOfPacking = typeOfPacking;
	}

	public GoodsCoffee() {
		super();
	}

	@Override
	public String toString() {
		return "GoodsCoffee [price = " + price + ", capacity = " + capacity + ", name = " + typeOfCoffee.getNameOfSort() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeOfCoffee == null) ? 0 : typeOfCoffee.hashCode());
		result = prime * result + ((typeOfPacking == null) ? 0 : typeOfPacking.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodsCoffee other = (GoodsCoffee) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (typeOfCoffee == null) {
			if (other.typeOfCoffee != null)
				return false;
		} else if (!typeOfCoffee.equals(other.typeOfCoffee))
			return false;
		if (typeOfPacking == null) {
			if (other.typeOfPacking != null)
				return false;
		} else if (!typeOfPacking.equals(other.typeOfPacking))
			return false;
		return true;
	}

	public double checkValue(double n) {
		if (n < 0) {
			Runner.log.error("Invalid value of variable.");
			return 0;
		}
		return n;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		price = checkValue(price);
		this.price = price;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		capacity = checkValue(price);
		this.capacity = capacity;
	}

	public Coffee getTypeOfCoffee() {
		return typeOfCoffee;
	}

	public void setTypeOfCoffee(Coffee typeOfCoffee) {
		this.typeOfCoffee = typeOfCoffee;
	}

	public Packing getTypeOfPacking() {
		return typeOfPacking;
	}

	public void setTypeOfPacking(Packing typeOfPacking) {
		this.typeOfPacking = typeOfPacking;
	}
}
