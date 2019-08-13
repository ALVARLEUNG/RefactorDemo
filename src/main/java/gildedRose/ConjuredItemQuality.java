package gildedRose;

public class ConjuredItemQuality extends ItemQuality {
    @Override
    protected void updateQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 2;
        }
    }
}
