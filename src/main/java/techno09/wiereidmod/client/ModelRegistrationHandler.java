package techno09.wiereidmod.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import techno09.wiereidmod.WiereidMod;
import techno09.wiereidmod.init.ModItems;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = WiereidMod.MODID)
public class ModelRegistrationHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.damascus_ingot, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
