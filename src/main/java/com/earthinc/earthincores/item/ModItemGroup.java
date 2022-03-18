package com.earthinc.earthincores.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup EARTHINCORES_GROUP = new ItemGroup("earthIncOresTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.MINING_CORE.get());
        }
    };
}
