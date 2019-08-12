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

}
