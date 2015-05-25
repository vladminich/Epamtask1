package by.epam.vanofcoffee.run;

import java.util.Collections;

import by.epam.vanofcoffee.builder.Creator;
import by.epam.vanofcoffee.entity.*;
import by.epam.vanofcoffee.exception.LogicException;
import by.epam.vanofcoffee.manage.SortedByCapacity;
import by.epam.vanofcoffee.manage.SortedByPrice;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Runner {
	public final static Logger log = Logger.getLogger(Runner.class);
	static {
		new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
	}

	public static void main(String[] args) {
		Van obj = null;
		try {
			obj = Creator.createVan();
			log.info("List of products: \n");
			obj.showGoods();
			double keyForSearch = 25;
			log.info("\nList of product with price less then key =" + keyForSearch + "\n");
			obj.findGoodsByPrice(obj.getProductList(), keyForSearch);
			log.info("\nSorted by price:\n");
			Collections.sort(obj.getProductList(), new SortedByPrice());
			obj.showGoods();
			log.info("\nSorted by capacity:\n");
			Collections.sort(obj.getProductList(), new SortedByCapacity());
			obj.showGoods();

		} catch (LogicException e) {
			log.error("Invalid value", e);
		}
	}
}