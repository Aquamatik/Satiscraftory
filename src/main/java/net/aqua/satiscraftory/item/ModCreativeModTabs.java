package net.aqua.satiscraftory.item;

import net.aqua.satiscraftory.Satiscraftory;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Satiscraftory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SATISCRAFTORY_TAB = CREATIVE_MODE_TABS.register("satiscraftory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Limestone.get()))
                    .title(Component.translatable("Satiscraftory"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Limestone.get());
                        output.accept(ModItems.Caterium.get());
                        output.accept(ModItems.Sulfur.get());
                        output.accept(ModItems.Bauxite.get());
                        output.accept(ModItems.SAM.get());
                        output.accept(ModItems.Uranium.get());
                        output.accept(ModItems.caterium_ingot.get());
                        output.accept(ModItems.aluminum_ingot.get());
                        output.accept(ModItems.steel_ingot.get());
                        output.accept(ModItems.ficsite_ingot.get());
                        output.accept(ModItems.ficsite_trigon.get());
                        output.accept(ModItems.iron_plate.get());
                        output.accept(ModItems.iron_rod.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
