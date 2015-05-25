package by.epam.vanofcoffee.entity;

import by.epam.vanofcoffee.enumeration.TypeOfMaterial;

public class BankPacking extends Packing {

    private TypeOfMaterial typeOfMaterial;

    public BankPacking(double price, double capacity, TypeOfMaterial material) {

	this.typeOfMaterial = material;
	super.setPrice(price);
	super.setCapacity(capacity);
    }

    public BankPacking() {
	super();
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((typeOfMaterial == null) ? 0 : typeOfMaterial.hashCode());
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
	BankPacking other = (BankPacking) obj;
	if (typeOfMaterial == null) {
	    if (other.typeOfMaterial != null)
		return false;
	} else if (!typeOfMaterial.equals(other.typeOfMaterial))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "BankPacking [Price - " + getPrice() + ", capacity - "
		+ getCapacity() + "typeOfMaterial=" + getTypeOfmaterial() + "]";
    }

    public TypeOfMaterial getTypeOfmaterial() {
	return typeOfMaterial;
    }

    public void setTypeOfmaterial(TypeOfMaterial typeOfmaterial) {
	this.typeOfMaterial = typeOfmaterial;
    }

}
