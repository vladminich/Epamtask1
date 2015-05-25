package by.epam.vanofcoffee.entity;

public class PaperPacking extends Packing {

	private String color;

	public PaperPacking(double price, double capacity, String color) {

		this.color = color;
		super.setPrice(price);
		super.setCapacity(capacity);

	}

	public PaperPacking() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		PaperPacking other = (PaperPacking) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaperPacking [Price - " + getPrice() + ", capacity - " + getCapacity() + "color=" + getColor() + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
