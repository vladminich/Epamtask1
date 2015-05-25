package by.epam.vanofcoffee.entity;

public class GrainCoffee extends Coffee {

    private String typeOfRoasting;

    public GrainCoffee(String nameOfSort, String producer, double price,
	    double capacity, String typeOfRoasting) {
	this.typeOfRoasting = typeOfRoasting;
	super.setNameOfSort(nameOfSort);
	super.setProducer(producer);
	super.setPrice(price);
	super.setCapacity(capacity);
    }

    public GrainCoffee() {
	super();
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((typeOfRoasting == null) ? 0 : typeOfRoasting.hashCode());
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
	GrainCoffee other = (GrainCoffee) obj;
	if (typeOfRoasting == null) {
	    if (other.typeOfRoasting != null)
		return false;
	} else if (!typeOfRoasting.equals(other.typeOfRoasting))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "GrainCoffee [Name: " + getNameOfSort() + ", producer: "
		+ getProducer() + ", price: " + getPrice() + ", capacity: "
		+ getCapacity() + "typeOfRoasting: " + getTypeOfRoasting()
		+ "]";
    }

    public String getTypeOfRoasting() {
	return typeOfRoasting;
    }

    public void setTypeOfRoasting(String typeOfRoasting) {
	this.typeOfRoasting = typeOfRoasting;
    }

}
