/*
 * This file ("IDisplayStandItem.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.misc;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

public interface IDisplayStandItem {

    boolean update(ItemStack stack, BlockEntity tile, int elapsedTicks);

    int getUsePerTick(ItemStack stack, BlockEntity tile, int elapsedTicks);
}
