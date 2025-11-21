package net.reonexy.bilebcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.reonexy.bilebcraft.BILEBCraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.reonexy.bilebcraft.BILEBCraft;
import net.reonexy.bilebcraft.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BILEBCraft.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());


    public static void registerItemGroups() {
        BILEBCraft.LOGGER.info("Registering Item Groups for " + BILEBCraft.MOD_ID);
    }
}