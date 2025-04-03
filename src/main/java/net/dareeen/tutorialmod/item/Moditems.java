package net.dareeen.tutorialmod.item;

import net.dareeen.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item PINK_GARNET = registeritem("pink_garnet", new Item(new Item.Settings()));  //Adds Items to Game
    public static final Item RAW_PINK_GARNET = registeritem("raw_pink_garnet", new Item(new Item.Settings()));

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModitems() {
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);    //Adds Items to CInventory
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
    }
}
