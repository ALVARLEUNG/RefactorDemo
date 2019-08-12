package gildedRose;

public class Item {

    private final String AGED_BRIE = "Aged Brie";
    private final String BPTATC = "Backstage passes to a TAFKAL80ETC concert";
    private final String SHOR = "Sulfuras, Hand of Ragnaros";

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        switch (name) {
            case AGED_BRIE:
                new AgedItemQuality().updateQuality(this);
                break;
            case BPTATC:
                new BackstageItemQuality().updateQuality(this);
                break;
            case SHOR:
                break;
            default:
                new NormalItemQuality().updateQuality(this);
                break;
        }
    }
}
