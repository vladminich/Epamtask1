package by.epam.vanofcoffee.manage;

import java.util.Comparator;

import by.epam.vanofcoffee.entity.GoodsCoffee;

public class SortedByPrice implements Comparator<GoodsCoffee> {

	public int compare(GoodsCoffee obj1, GoodsCoffee obj2) {

		double price1 = obj1.getPrice();
		double price2 = obj2.getPrice();

		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}
}
