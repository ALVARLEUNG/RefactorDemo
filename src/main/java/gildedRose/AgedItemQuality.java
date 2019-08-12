package gildedRose;

public class AgedItemQuality extends ItemQuality {

    @Override
    protected void updateQuality(Item item) {
            handleItemQualityLessThan50(item);
            item.sellIn = item.sellIn - 1;
            if (item.sellIn < 0) {
                handleItemQualityLessThan50(item);
            }
    }
}
