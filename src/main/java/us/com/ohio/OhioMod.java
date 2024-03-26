package us.com.ohio;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.com.ohio.items.OhioItems;

public class OhioMod implements ModInitializer {
	public static final String MOD_ID = "ohiomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!" + MOD_ID);

		OhioItems.registerItems();
	}
}