package by.epam.vanofcoffee.entity;

public class InstantCoffee extends Coffee {

	private double kilocalorie;

	public InstantCoffee(String nameOfSort, String producer, double price, double capacity, double kilocalorie) {

		this.kilocalorie = kilocalorie;
		super.setNameOfSort(nameOfSort);
		super.setProducer(producer);
		super.setPrice(price);
		super.setCapacity(capacity);
	}

	public InstantCoffee() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(kilocalorie);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InstantCoffee other = (InstantCoffee) obj;
		if (Double.doubleToLongBits(kilocalorie) != Double.doubleToLongBits(other.kilocalorie))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InstantCoffee [Name: " + getNameOfSort() + ", producer: " + getProducer() + ", price: " + getPrice() + ", capacity: " + getCapacity()
				+ ", kilocalorie: " + getKilocalorie() + "]";
	}

	public double getKilocalorie() {
		return kilocalorie;
	}

	public void setKilocalorie(double kilocalorie) {
		kilocalorie = checkValue(kilocalorie);
		this.kilocalorie = kilocalorie;
	}

}
