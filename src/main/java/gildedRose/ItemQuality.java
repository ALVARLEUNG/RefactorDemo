package gildedRose;

public abstract class ItemQuality {

    protected abstract void updateQuality(Item item);

    protected void handleItemQualityLessThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
