package gildedRose;

public class GildedRose {


    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (int i = 0; i < this.items.length; i++) {
           items[i].updateQuality();
        }
    }
}
