package by.epam.vanofcoffee.manage;

import java.util.Comparator;

import by.epam.vanofcoffee.entity.GoodsCoffee;

public class SortedByCapacity implements Comparator<GoodsCoffee> {

	public int compare(GoodsCoffee obj1, GoodsCoffee obj2) {

		double capacity1 = obj1.getCapacity();
		double capacity2 = obj2.getCapacity();

		if (capacity1 > capacity2) {
			return 1;
		} else if (capacity1 < capacity2) {
			return -1;
		} else {
			return 0;
		}
	}
}
