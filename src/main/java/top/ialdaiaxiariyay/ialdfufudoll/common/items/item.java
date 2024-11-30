package top.ialdaiaxiariyay.ialdfufudoll.common.items;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import top.ialdaiaxiariyay.ialdfufudoll.common.createTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.ialdaiaxiariyay.ialdfufudoll.ialdfufudoll;

import static top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries.*;

public class item {
    static {
        REGISTRATE.creativeModeTab(() -> createTabs.ITEM);
    }
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ialdfufudoll.MOD_ID);

    public static final ItemEntry<Item> NEW_WORLD = REGISTRATE.item("new_world", Item::new)
            .lang("New World")
            .register();

    public static void init() {
    }
}
