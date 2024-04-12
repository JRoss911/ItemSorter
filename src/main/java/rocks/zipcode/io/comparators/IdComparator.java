package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator {
    Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
    Item item1 = new Item();
    Item item2 = new Item();

    Integer comparisonValue;

    public IdComparator() {
        comparisonValue = idComparator.compare(item1, item2);
    }
}

