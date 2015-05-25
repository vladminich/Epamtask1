package by.epam.vanofcoffee.entity;

public class GroundCoffee extends Coffee {

    private String countryOfGrowing;

    public GroundCoffee(String nameOfSort, String producer, double price,
	    double capacity, String countryOfGrowing) {

	this.countryOfGrowing = countryOfGrowing;
	super.setNameOfSort(nameOfSort);
	super.setProducer(producer);
	super.setPrice(price);
	super.setCapacity(capacity);

    }

    public GroundCoffee() {
	super();
    }

    @Override
    public String toString() {
	return "GroundCoffee [Name: " + getNameOfSort() + ", producer: "
		+ getProducer() + ", price: " + getPrice() + ", capacity: "
		+ getCapacity() + ", countryOfGrowing: "
		+ getCountryOfGrowing() + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime
		* result
		+ ((countryOfGrowing == null) ? 0 : countryOfGrowing.hashCode());
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
	GroundCoffee other = (GroundCoffee) obj;
	if (countryOfGrowing == null) {
	    if (other.countryOfGrowing != null)
		return false;
	} else if (!countryOfGrowing.equals(other.countryOfGrowing))
	    return false;
	return true;
    }

    public String getCountryOfGrowing() {
	return countryOfGrowing;
    }

    public void setCountryOfGrowing(String countryOfGrowing) {
	this.countryOfGrowing = countryOfGrowing;
    }

}
