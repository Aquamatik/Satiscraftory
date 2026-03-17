package net.aqua.satiscraftory.item;

import net.aqua.satiscraftory.Satiscraftory;
import net.aqua.satiscraftory.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Satiscraftory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SATISCRAFTORY_TAB = CREATIVE_MODE_TABS.register("satiscraftory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.limestone.get()))
                    .title(Component.translatable("Satiscraftory"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.limestone.get());
                        output.accept(ModItems.caterium.get());
                        output.accept(ModItems.sulfur.get());
                        output.accept(ModItems.bauxite.get());
                        output.accept(ModItems.sam.get());
                        output.accept(ModItems.uranium.get());
                        output.accept(ModItems.caterium_ingot.get());
                        output.accept(ModItems.aluminum_ingot.get());
                        output.accept(ModItems.steel_ingot.get());
                        output.accept(ModItems.ficsite_ingot.get());
                        output.accept(ModItems.ficsite_trigon.get());
                        output.accept(ModItems.iron_plate.get());
                        output.accept(ModItems.iron_rod.get());
                        output.accept(ModItems.screws.get());
                        output.accept(ModItems.concrete.get());
                        output.accept(ModItems.reinforced_iron_plate.get());
                        output.accept(ModItems.wire.get());
                        output.accept(ModItems.quickwire.get());
                        output.accept(ModItems.cable.get());
                        output.accept(ModItems.copper_sheet.get());
                        output.accept(ModItems.copper_powder.get());
                        output.accept(ModItems.quartz_crystal.get());
                        output.accept(ModItems.silica.get());
                        output.accept(ModItems.crystal_oscillator.get());
                        output.accept(ModItems.steel_pipe.get());
                        output.accept(ModItems.steel_beam.get());
                        output.accept(ModItems.encased_industrial_beam.get());
                        output.accept(ModItems.rotor.get());
                        output.accept(ModItems.stator.get());
                        output.accept(ModItems.motor.get());
                        output.accept(ModItems.modular_frame.get());
                        output.accept(ModItems.heavy_modular_frame.get());
                        output.accept(ModItems.fused_modular_frame.get());
                        output.accept(ModItems.plastic.get());
                        output.accept(ModItems.rubber.get());
                        output.accept(ModItems.fabric.get());
                        output.accept(ModItems.polymer_resin.get());
                        output.accept(ModItems.circuit_board.get());
                        output.accept(ModItems.ai_limiter.get());
                        output.accept(ModItems.high_speed_connector.get());
                        output.accept(ModItems.aluminum_scrap.get());
                        output.accept(ModItems.alclad_aluminum_sheet.get());
                        output.accept(ModItems.aluminum_casing.get());
                        output.accept(ModItems.battery.get());
                        output.accept(ModItems.heat_sink.get());
                        output.accept(ModItems.cooling_system.get());
                        output.accept(ModItems.turbo_motor.get());
                        output.accept(ModItems.reanimated_sam.get());
                        output.accept(ModItems.sam_fluctuator.get());
                        output.accept(ModItems.computer.get());
                        output.accept(ModItems.supercomputer.get());
                        output.accept(ModItems.electromagnetic_control_rod.get());
                        output.accept(ModItems.radio_control_unit.get());
                        output.accept(ModItems.alien_protein.get());
                        output.accept(ModItems.alien_dna_capsule.get());
                        output.accept(ModItems.mycelia.get());
                        output.accept(ModItems.wood.get());
                        output.accept(ModItems.biomass.get());
                        output.accept(ModItems.solid_biofuel.get());
                        output.accept(ModItems.empty_canister.get());
                        output.accept(ModItems.empty_fluid_tank.get());
                        output.accept(ModItems.packaged_water.get());
                        output.accept(ModItems.packaged_oil.get());
                        output.accept(ModItems.packaged_heavy_oil_residue.get());
                        output.accept(ModItems.packaged_fuel.get());
                        output.accept(ModItems.packaged_alumina_solution.get());
                        output.accept(ModItems.packaged_sulfuric_acid.get());
                        output.accept(ModItems.packaged_nitric_acid.get());
                        output.accept(ModItems.packaged_nitrogen_gas.get());
                        output.accept(ModItems.time_crystal.get());
                        output.accept(ModItems.dark_matter_crystal.get());
                        output.accept(ModItems.singularity_cell.get());
                        output.accept(ModItems.pressure_conversion_cube.get());
                        output.accept(ModItems.superposition_oscillator.get());
                        output.accept(ModItems.neural_quantum_processor.get());
                        output.accept(ModItems.alien_power_matrix.get());
                        output.accept(ModItems.uranium_fuel_rod.get());
                        output.accept(ModItems.encased_uranium_cell.get());
                        output.accept(ModItems.non_fissile_uranium.get());
                        output.accept(ModItems.uranium_waste.get());
                        output.accept(ModItems.plutonium_fuel_rod.get());
                        output.accept(ModItems.encased_plutonium_cell.get());
                        output.accept(ModItems.plutonium_pellet.get());
                        output.accept(ModItems.plutonium_waste.get());
                        output.accept(ModItems.ficsonium_fuel_rod.get());
                        output.accept(ModItems.ficsonium.get());
                        output.accept(ModItems.smart_plating.get());
                        output.accept(ModItems.versatile_framework.get());
                        output.accept(ModItems.automated_wiring.get());
                        output.accept(ModItems.modular_engine.get());
                        output.accept(ModItems.adaptive_control_unit.get());
                        output.accept(ModItems.assembly_director_system.get());
                        output.accept(ModItems.magnetic_field_generator.get());
                        output.accept(ModItems.thermal_propulsion_rocket.get());
                        output.accept(ModItems.nuclear_pasta.get());
                        output.accept(ModItems.biochemical_sculptor.get());
                        output.accept(ModItems.ballistic_warp_drive.get());
                        output.accept(ModItems.ai_expansion_server.get());

                        output.accept(ModBlocks.limestone_ore.get());
                        output.accept(ModBlocks.caterium_ore.get());
                        output.accept(ModBlocks.sulfur_ore.get());
                        output.accept(ModBlocks.bauxite_ore.get());
                        output.accept(ModBlocks.sam_ore.get());
                        output.accept(ModBlocks.uranium_ore.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
