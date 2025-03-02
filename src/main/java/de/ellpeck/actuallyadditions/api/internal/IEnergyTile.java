/*
 * This file ("IEnergyTile.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.internal;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

/**
 * This is not supposed to be implemented.
 * Can be cast to TileEntity.
 */
public interface IEnergyTile {

    BlockPos getPosition();

    int getX();

    int getY();

    int getZ();

    //TODO: Rename to getWorld
    Level getWorldObject();

    void extractEnergy(int amount);

    int getEnergy();
}
