package top.ialdaiaxiariyay.ialdfufudoll;

import com.glodblock.github.extendedae.common.EAERegistryHandler;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.config.ConfigHolder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.ialdaiaxiariyay.ialdfufudoll.common.blocks.Addonblock;
import top.ialdaiaxiariyay.ialdfufudoll.common.dollcreateTabs;


@Mod(ialdfufudoll.MOD_ID)
public class ialdfufudoll
{
    public static final String
            MOD_ID = "ialdfufudoll",
            NAME = "Iald GTCore";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    public static MaterialRegistry MATERIAL_REGISTRY;

    @SuppressWarnings("removal")
    public ialdfufudoll() {
        ialdfufudoll.init();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Addonblock.register(modEventBus);
        dollcreateTabs.register(modEventBus);
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        bus.addGenericListener(MachineDefinition.class, this::registerMachines);
    }

    public static void init() {
        ConfigHolder.init(); // Forcefully init GT config because fabric doesn't allow dependents to load after dependencies

        //SADatagen.init();

    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    @SubscribeEvent
    public void registerMaterialRegistry(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(ialdfufudoll.MOD_ID);
    }
    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
       // top.ialdaiaxiariyay.ialdgtcore.common.data.SAMachines.init();
    }

}
