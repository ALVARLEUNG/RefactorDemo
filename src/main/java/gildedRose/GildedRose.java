package gildedRose;

public class GildedRose {
    private final String AGED_BRIE = "Aged Brie";
    private final String BPTATC = "Backstage passes to a TAFKAL80ETC concert";
    private final String SHOR = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (int i = 0; i < this.items.length; i++) {
            switch (items[i].name) {
                case AGED_BRIE:
                    agedUpdate(items[i]);
                    break;
                case BPTATC:
                    backstageUpdate(items[i]);
                    break;
                case SHOR:
                    break;
                default:
                    normalUpdate(items[i]);
                    break;
            }
        }
    }

    public void normalUpdate(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    public void agedUpdate(Item item) {
        handleItemQualityLessThan50(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            handleItemQualityLessThan50(item);
        }
    }

    public void backstageUpdate(Item item) {
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


    private void handleItemQualityLessThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
