package top.ialdaiaxiariyay.ialdfufudoll.api;

import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ialdgtmodels {
    public static NonNullBiConsumer<DataGenContext<Block, Block>, RegistrateBlockstateProvider> cubeAllModel(String name, ResourceLocation texture) {
        return (ctx, prov) -> {
            prov.simpleBlock((Block)ctx.getEntry(), prov.models().cubeAll(name, texture));
        };
    }
}
