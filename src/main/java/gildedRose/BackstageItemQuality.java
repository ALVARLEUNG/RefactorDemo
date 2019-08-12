package gildedRose;

public class BackstageItemQuality extends ItemQuality {
    @Override
    protected void updateQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                handleItemQualityLessThan50(item);
            }
            if (item.sellIn < 6) {
                handleItemQualityLessThan50(item);
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
