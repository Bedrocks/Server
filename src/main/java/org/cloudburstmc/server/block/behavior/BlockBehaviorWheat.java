package org.cloudburstmc.server.block.behavior;

import org.cloudburstmc.server.block.Block;
import org.cloudburstmc.server.block.BlockTraits;
import org.cloudburstmc.server.item.behavior.Item;
import org.cloudburstmc.server.item.behavior.ItemIds;

public class BlockBehaviorWheat extends BlockBehaviorCrops {

    @Override
    public Item toItem(Block block) {
        return Item.get(ItemIds.WHEAT);
    }

    @Override
    public Item[] getDrops(Block block, Item hand) {
        if (block.getState().ensureTrait(BlockTraits.GROWTH) >= 0x07) {
            return new Item[]{
                    Item.get(ItemIds.WHEAT),
                    Item.get(ItemIds.WHEAT, 0, (int) (4f * Math.random()))
            };
        } else {
            return new Item[]{
                    Item.get(ItemIds.WHEAT)
            };
        }
    }
}
