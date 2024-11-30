package top.ialdaiaxiariyay.ialdfufudoll.common.blocks;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.ialdaiaxiariyay.ialdfufudoll.common.createTabs;
import top.ialdaiaxiariyay.ialdfufudoll.ialdfufudoll;
import top.ialdaiaxiariyay.ialdfufudoll.common.blocks.customblocks.yohanemashiro;

import static top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries.REGISTRATE;

public class Addonblock {
    static {
        REGISTRATE.creativeModeTab(() -> createTabs.ITEM);
    }
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ialdfufudoll.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ialdfufudoll.MOD_ID);

    public static final RegistryObject<Block> yohanemashiro_block = BLOCKS.register("yohanemashiro", yohanemashiro::new);
    public static final RegistryObject<Item> yohanemashiro_item = ITEMS.register("yohanemashiro", () -> new BlockItem(yohanemashiro_block.get(), new Item.Properties()));
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}