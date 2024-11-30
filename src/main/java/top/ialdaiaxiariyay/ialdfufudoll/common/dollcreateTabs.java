package top.ialdaiaxiariyay.ialdfufudoll.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import top.ialdaiaxiariyay.ialdfufudoll.common.blocks.Addonblock;
import top.ialdaiaxiariyay.ialdfufudoll.ialdfufudoll;

public class dollcreateTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ialdfufudoll.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DOLL_CREATE_TABS = CREATIVE_MODE_TABS.register("doll_create_tabs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Addonblock.yohanemashiro_item.get()))
                    .title(Component.translatable("ialdfufudoll.doll_create_tabs"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(Addonblock.yohanemashiro_item.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
