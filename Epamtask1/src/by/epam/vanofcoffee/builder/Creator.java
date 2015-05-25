package by.epam.vanofcoffee.builder;

import java.util.ArrayList;

import by.epam.vanofcoffee.entity.*;
import by.epam.vanofcoffee.enumeration.TypeOfMaterial;
import by.epam.vanofcoffee.exception.LogicException;

public class Creator {
	public static Van createVan() throws LogicException {
		Coffee sort1 = new GroundCoffee("Heaven", "Africa", 25, 5, "Africa");
		Coffee sort4 = new GroundCoffee("Picaso", "Italia", 43, 9, "Spain");
		Coffee sort2 = new GrainCoffee("Tea flavor", "Russia", 10., 5., "Greece");
		Coffee sort5 = new GrainCoffee("Tortose", "Germany", 21., 7., "Peru");
		Coffee sort3 = new InstantCoffee("Eldorado", "Peru", 40, 8, 150);
		Coffee sort6 = new InstantCoffee("Ficus", "Brazil", 31, 11, 270);
		Packing box1 = new PaperPacking(3., 2., "Blue");
		Packing box2 = new BankPacking(5., 3., TypeOfMaterial.METAL);
		Van van = new Van(2000, 2000, new ArrayList<GoodsCoffee>());
		van.addGoodsCoffee(sort3, box1, 2);
		van.addGoodsCoffee(sort1, box1, 1);
		van.addGoodsCoffee(sort6, box2, 3);
		van.addGoodsCoffee(sort4, box1, 4);
		van.addGoodsCoffee(sort5, box1, 1);
		van.addGoodsCoffee(sort2, box2, 2);
		return van;
	}
}

// public Coffee getGrainCoffee() {
// return new GrainCoffee();
// }
//
// public Coffee getGroundCoffee() {
// return new GroundCoffee();
// }
//
// public Coffee getInstantCoffee() {
// return new InstantCoffee();
// }
//
// public Packing getBankPackking() {
// return new BankPacking();
// }
//
// public Packing getPaperPackking() {
// return new BankPacking();
// }
//
// public GoodsCoffee getGoodsCoffee() {
// return new GoodsCoffee();
// }
//
// public Van getVan() {
// return new Van();
// }
// }
