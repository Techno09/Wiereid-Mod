package techno09.wiereidmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WiereidMod.MODID, name = WiereidMod.NAME, version = WiereidMod.VERSION, acceptedMinecraftVersions = WiereidMod.MC_VERSION)
public class WiereidMod {

    public static final String MODID = "wiereidmod";
    public static final String NAME = "Wiereid Mod";
    public static final String VERSION = "1.0.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(WiereidMod.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(WiereidMod.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}

