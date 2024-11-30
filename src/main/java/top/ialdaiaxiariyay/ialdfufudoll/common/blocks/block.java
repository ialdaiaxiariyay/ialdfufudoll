package top.ialdaiaxiariyay.ialdfufudoll.common.blocks;

import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import top.ialdaiaxiariyay.ialdfufudoll.api.ialdgtmodels;
import top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries;
import top.ialdaiaxiariyay.ialdfufudoll.common.createTabs;
import top.ialdaiaxiariyay.ialdfufudoll.ialdfufudoll;
import java.util.function.Supplier;
import static top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries.REGISTRATE;

public class block {
    static {
        Registries.REGISTRATE.creativeModeTab(() -> createTabs.ITEM);
    }
    public static void init() {}
    public static BlockEntry<Block> createCasingBlock(String name, ResourceLocation texture) {
        return createCasingBlock(name, Block::new, texture, () -> Blocks.IRON_BLOCK,
                () -> RenderType::cutoutMipped);
    }
    @SuppressWarnings("all")
    public static BlockEntry<Block> createCasingBlock(String name,
        NonNullFunction<BlockBehaviour.Properties, Block> blockSupplier,
        ResourceLocation texture,
        NonNullSupplier<? extends Block> properties,
        Supplier<Supplier<RenderType>> type) {
        return REGISTRATE.block(name, blockSupplier)
                .initialProperties(properties)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
                .addLayer(type)
                .blockstate(ialdgtmodels.cubeAllModel(name, texture))
                .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
                .item(BlockItem::new)
                .build()
                .register();
    }
    @SuppressWarnings("all")
    public static final BlockEntry<Block> TSTS = createCasingBlock
            ("test", ialdfufudoll.id(""));

}