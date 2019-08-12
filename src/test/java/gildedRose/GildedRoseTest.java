package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_item_quality_1_and_sellIn_0_given_item_has_quality_2_and_sellIn_1() {
        Item item = new Item("Rose", 1, 2);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(1, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void should_return_item_quality_0_and_sellIn_0_given_item_has_quality_0_and_sellIn_1() {
        Item item = new Item("Rose", 1, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void should_return_item_quality_1_and_sellIn_1_given_item_has_quality_1_and_sellIn_1_name_SulurasHandOfRagnaros() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 1);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(1, item.quality);
        assertEquals(1, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_0_given_item_has_quality_49_and_sellIn_1_name_AgedBrie() {
        Item item = new Item("Aged Brie", 1, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void should_return_item_quality_51_and_sellIn_0_given_item_has_quality_51_and_sellIn_1_name_AgedBrie() {
        Item item = new Item("Aged Brie", 1, 51);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(51, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_4_given_item_has_quality_48_and_sellIn_5_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_4_given_item_has_quality_47_and_sellIn_5_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_4_given_item_has_quality_49_and_sellIn_5_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_9_given_item_has_quality_49_and_sellIn_10_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_9_given_item_has_quality_48_and_sellIn_10_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_9_given_item_has_quality_47_and_sellIn_10_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 47);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(49, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_negative_2_given_item_has_quality_50_and_sellIn_negative_1_name_Aged_Brie() {
        Item item = new Item("Aged Brie", -1, 50);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_negative_2_given_item_has_quality_49_and_sellIn_negative_1_name_Aged_Brie() {
        Item item = new Item("Aged Brie", -1, 49);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_negative_2_given_item_has_quality_48_and_sellIn_negative_1_name_Aged_Brie() {
        Item item = new Item("Aged Brie", -1, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    public void should_return_item_quality_0_and_sellIn_negative_2_given_item_has_quality_48_and_sellIn_negative_1_name_BackstagePassesToATAFKAL80ETCConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    public void should_return_item_quality_0_and_sellIn_negative_2_given_item_has_quality_0_and_sellIn_negative_1_name_Rose() {
        Item item = new Item("Rose", -1, 0);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_negative_2_given_item_has_quality_48_and_sellIn_negative_1_name_SulfurasHandOfRagnaros() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(48, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void should_return_item_quality_50_and_sellIn_negative_2_given_item_has_quality_48_and_sellIn_negative_1_name_Rose() {
        Item item = new Item("Rose", -1, 48);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();

        assertEquals(46, item.quality);
        assertEquals(-2, item.sellIn);
    }



}
