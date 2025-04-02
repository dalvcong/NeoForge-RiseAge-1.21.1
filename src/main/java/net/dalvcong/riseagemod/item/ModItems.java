package net.dalvcong.riseagemod.item;

import net.dalvcong.riseagemod.RiseAgeMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RiseAgeMod.MOD_ID);

    public static final DeferredItem<Item> FIRSTITEM = ITEMS.register("firstitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
