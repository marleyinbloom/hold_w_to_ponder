package io.itch.marleyinbloom.hold_w;

import com.simibubi.create.infrastructure.ponder.AllCreatePonderTags;

import io.itch.marleyinbloom.hold_w.VanillaScenes.TransmissionScenes;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class AllVanillaScenes {

	public static void register(PonderSceneRegistrationHelper<ResourceLocation> helper) {
		PonderSceneRegistrationHelper<Item> HELPER = helper.withKeyFunction(BuiltInRegistries.ITEM::getKey);

		HELPER.addStoryBoard(Items.REDSTONE, "redstone/dust_transmission", TransmissionScenes::dustTransmission, AllCreatePonderTags.KINETIC_RELAYS);
        
    }
}
