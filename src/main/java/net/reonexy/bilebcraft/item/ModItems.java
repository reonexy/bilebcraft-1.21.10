package net.reonexy.bilebcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reonexy.bilebcraft.BILEBCraft;

public class ModItems {

    public static Item PINK_GARNET;

    private static Item registerItem(String name, Item item) {

        return Registry.register(
                Registries.ITEM,
                Identifier.of(BILEBCraft.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        BILEBCraft.LOGGER.info("Registering Mod Items for " + BILEBCraft.MOD_ID);

        PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
        });
    }
}