package by.epam.vanofcoffee.entity;

import java.util.*;

import by.epam.vanofcoffee.exception.LogicException;
import by.epam.vanofcoffee.run.Runner;

public class Van {

	private double capacity;
	private double moneyForPurchase;
	private List<GoodsCoffee> productList;

	public Van(double capacity, double moneyForPurchase, ArrayList<GoodsCoffee> productList) throws LogicException {
		this.capacity = capacity;
		this.moneyForPurchase = moneyForPurchase;
		this.productList = productList;
	}

	public Van() {
		super();
	}

	public void showGoods() {

		if (productList.isEmpty()) {
			Runner.log.info("There aren't no products in the van.");
			return;
		}
		Iterator<GoodsCoffee> it = productList.iterator();
		while (it.hasNext()) {
			Runner.log.info(it.next().toString());
		}

	}

	/**
	 * add object GoodsCoffee (amount - n) into object Van
	 * 
	 * @param item
	 * @param obj
	 * @param n
	 * @throws LogicException
	 */
	public void addGoodsCoffee(Coffee item, Packing obj, int n) throws LogicException {
		if (getMoneyForPurchase() < n * (obj.getPrice() + item.getPrice()) || getCapacity() < n * (obj.getCapacity() + item.getCapacity()))
			throw new LogicException("Excess of value of variable.");
		for (int i = 0; i < n; i++) {
			productList.add(new GoodsCoffee(item.getPrice() + obj.getPrice(), item.getCapacity() + obj.getCapacity(), item, obj));
			GoodsCoffee.amount++;
		}
		double h = this.getCapacity();
		setCapacity(h - n * (item.getCapacity() + obj.getCapacity()));
		h = this.getMoneyForPurchase();
		setMoneyForPurchase(h - n * (item.getPrice() + obj.getPrice()));

	}

	/**
	 * find object GoodsCoffe into object Van , value of key which less than input
	 * key
	 * 
	 * @param productList
	 * @throws LogicException
	 */
	public void findGoodsByPrice(List<GoodsCoffee> productList, double key) throws LogicException {

		if (productList.isEmpty()) {
			Runner.log.info("There aren't no products in the van.");
			return;
		}
		if (key < 0)
			throw new LogicException("Invalid input value.");
		boolean x = false;
		Iterator<GoodsCoffee> it = productList.iterator();
		GoodsCoffee item;
		while (it.hasNext()) {
			item = it.next();
			if (item.getPrice() <= key) {
				Runner.log.info(item.toString());
				x = true;
			}
		}
		if (!x)
			Runner.log.info("Item not found.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(moneyForPurchase);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
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
		Van other = (Van) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (Double.doubleToLongBits(moneyForPurchase) != Double.doubleToLongBits(other.moneyForPurchase))
			return false;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		return true;
	}

	public double checkValue(double n) {
		if (n < 0) {
			Runner.log.error("Invalid value ("+ n + " ) of variable");
			return 0;
		}
		return n;
	}

	@Override
	public String toString() {
		return "Van [capacity=" + capacity + ", moneyForPurchase=" + moneyForPurchase + ", productList=" + productList + "]";
	}

	public double getMoneyForPurchase() {
		return moneyForPurchase;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setMoneyForPurchase(double moneyForPurchase) {
		moneyForPurchase = checkValue(moneyForPurchase);
		this.moneyForPurchase = moneyForPurchase;
	}

	public List<GoodsCoffee> getProductList() {
		return productList;
	}

	public void setProductList(List<GoodsCoffee> productList) {//TODO check
		this.productList = productList;
	}

	public void setCapacity(double capacity) {
		capacity = checkValue(capacity);
		this.capacity = capacity;
	}
}
