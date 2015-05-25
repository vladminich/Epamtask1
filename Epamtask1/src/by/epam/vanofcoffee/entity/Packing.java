package by.epam.vanofcoffee.entity;

import by.epam.vanofcoffee.run.Runner;

public abstract class Packing {

	private double price;
	private double capacity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Packing other = (Packing) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public double checkValue(double n) {
		if (n < 0) {
			Runner.log.error("Invalid value (" + n + " ) of variable");
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
		capacity = checkValue(capacity);
		this.capacity = capacity;
	}

}
