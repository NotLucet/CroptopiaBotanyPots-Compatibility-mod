package com.yuras.croptopiabotany;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CroptopiaBotanyCompat.MODID)
public class CroptopiaBotanyCompat {
    public static final String MODID = "croptopiabotany";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CroptopiaBotanyCompat(IEventBus modEventBus) {
        LOGGER.info("Croptopia Botany Pots Compat loaded!");
    }
}

