package us.com.ohio;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.com.ohio.blocks.OhioBlocks;
import us.com.ohio.items.OhioGroupItems;
import us.com.ohio.items.OhioItems;

public class OhioMod implements ModInitializer {
	public static final String MOD_ID = "ohiomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		OhioGroupItems.registerItemGroups();

		OhioItems.registerItems();
		OhioBlocks.registerBlocks();
	}
}