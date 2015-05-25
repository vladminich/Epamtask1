package by.epam.vanofcoffee.entity;

import by.epam.vanofcoffee.run.Runner;

public abstract class Coffee {

	private String nameOfSort;
	private String producer;
	private double price;
	private double capacity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nameOfSort == null) ? 0 : nameOfSort.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
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
		Coffee other = (Coffee) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (nameOfSort == null) {
			if (other.nameOfSort != null)
				return false;
		} else if (!nameOfSort.equals(other.nameOfSort))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
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

	public String getNameOfSort() {
		return nameOfSort;
	}

	public void setNameOfSort(String nameOfSort) {
		this.nameOfSort = nameOfSort;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
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
