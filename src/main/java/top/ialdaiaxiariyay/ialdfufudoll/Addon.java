package top.ialdaiaxiariyay.ialdfufudoll;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;
import top.ialdaiaxiariyay.ialdfufudoll.api.registries.Registries;
import top.ialdaiaxiariyay.ialdfufudoll.common.blocks.block;
import top.ialdaiaxiariyay.ialdfufudoll.common.items.item;

import java.util.function.Consumer;

@GTAddon
public class Addon implements IGTAddon {

    private static Consumer<FinishedRecipe> provider;

    @Override
    public GTRegistrate getRegistrate() {
        return Registries.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
        item.init();
        block.init();
    }

    @Override
    public String addonModId() {
        return ialdfufudoll.MOD_ID;
    }

    @Override
    public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
        IGTAddon.super.collectMaterialCasings(event);
    }

 //   @Override
  //  public void registerSounds() {
  //      Recipes.init();
  //  }

   // @Override
   // public void addRecipes(Consumer<FinishedRecipe> provider) {
       // AddRecipes.init(provider);
    }