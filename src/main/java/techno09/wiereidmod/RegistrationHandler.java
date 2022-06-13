package techno09.wiereidmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = WiereidMod.MODID)
public class RegistrationHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(WiereidMod.MODID, "first_item").setTranslationKey(WiereidMod.MODID + "." + "first_item").setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }

}
