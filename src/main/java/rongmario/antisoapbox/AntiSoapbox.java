package rongmario.antisoapbox;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

@Mod("antisoapbox")
public class AntiSoapbox {

    public static final Logger LOGGER = LogManager.getLogger();

    private static final String QUARK = "quark";

    public AntiSoapbox() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        if (ModList.get().isLoaded(QUARK)) {
            Field field = Class.forName("vazkii.quark.base.client.BLMHandler").getDeclaredField("didTheThing");
            field.setAccessible(true);
            field.setBoolean(null, true);
            LOGGER.info(QUARK + "'s soapbox is no more.");
        }
    }

}
