package us.com.ohio.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import us.com.ohio.OhioMod;
import us.com.ohio.blocks.OhioBlocks;

public class OhioGroupItems {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OhioMod.MOD_ID, "ruby"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(OhioItems.RUBY))
                    .entries(((displayContext, entries) -> {
                        entries.add(OhioItems.RUBY);
                        entries.add(OhioBlocks.RUBY_BLOCK);
                    }))
                    .build());

    public static void registerItemGroups() {
        OhioMod.LOGGER.info("Registering item groups for "+ OhioMod.MOD_ID);
    }

}
