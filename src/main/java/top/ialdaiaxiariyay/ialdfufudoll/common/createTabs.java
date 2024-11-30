package top.ialdaiaxiariyay.ialdfufudoll.common;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import top.ialdaiaxiariyay.ialdfufudoll.common.items.item;
import top.ialdaiaxiariyay.ialdfufudoll.ialdfufudoll;
import top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries;

public class createTabs {
       @SuppressWarnings("null")
       public static RegistryEntry<CreativeModeTab> ITEM = Registries.REGISTRATE.defaultCreativeTab(ialdfufudoll.MOD_ID,
                       builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(ialdfufudoll.MOD_ID, Registries.REGISTRATE))
                               .icon(item.NEW_WORLD::asStack)
                               .title(Component.literal("Iald fufudoll"))
                               .build())
               .register();

       public static void init() {

       }
}
