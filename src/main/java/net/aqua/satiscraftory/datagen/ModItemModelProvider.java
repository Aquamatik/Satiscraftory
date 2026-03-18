package net.aqua.satiscraftory.datagen;

import net.aqua.satiscraftory.Satiscraftory;
import net.aqua.satiscraftory.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Satiscraftory.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        simpleItem(ModItems.adaptive_control_unit);
        simpleItem(ModItems.ai_limiter);
        simpleItem(ModItems.alclad_aluminum_sheet);
        simpleItem(ModItems.alien_protein);
        simpleItem(ModItems.ai_expansion_server);
        simpleItem(ModItems.alien_dna_capsule);
        simpleItem(ModItems.alien_power_matrix);
        simpleItem(ModItems.aluminum_casing);
        simpleItem(ModItems.aluminum_ingot);
        simpleItem(ModItems.aluminum_scrap);
        simpleItem(ModItems.assembly_director_system);
        simpleItem(ModItems.automated_wiring);
        simpleItem(ModItems.battery);
        simpleItem(ModItems.bauxite);
        simpleItem(ModItems.biomass);
        simpleItem(ModItems.ballistic_warp_drive);
        simpleItem(ModItems.biochemical_sculptor);
        simpleItem(ModItems.cable);
        simpleItem(ModItems.caterium);
        simpleItem(ModItems.computer);
        simpleItem(ModItems.caterium_ingot);
        simpleItem(ModItems.circuit_board);
        simpleItem(ModItems.concrete);
        simpleItem(ModItems.cooling_system);
        simpleItem(ModItems.copper_powder);
        simpleItem(ModItems.copper_sheet);
        simpleItem(ModItems.crystal_oscillator);
        simpleItem(ModItems.dark_matter_crystal);
        simpleItem(ModItems.electromagnetic_control_rod);
        simpleItem(ModItems.empty_canister);
        simpleItem(ModItems.empty_fluid_tank);
        simpleItem(ModItems.encased_industrial_beam);
        simpleItem(ModItems.encased_plutonium_cell);
        simpleItem(ModItems.encased_uranium_cell);
        simpleItem(ModItems.fabric);
        simpleItem(ModItems.ficsite_ingot);
        simpleItem(ModItems.ficsonium);
        simpleItem(ModItems.ficsite_trigon);
        simpleItem(ModItems.ficsonium_fuel_rod);
        simpleItem(ModItems.fused_modular_frame);
        simpleItem(ModItems.heat_sink);
        simpleItem(ModItems.heavy_modular_frame);
        simpleItem(ModItems.high_speed_connector);
        simpleItem(ModItems.iron_plate);
        simpleItem(ModItems.iron_rod);
        simpleItem(ModItems.limestone);
        simpleItem(ModItems.magnetic_field_generator);
        simpleItem(ModItems.modular_engine);
        simpleItem(ModItems.motor);
        simpleItem(ModItems.mycelia);
        simpleItem(ModItems.modular_frame);
        simpleItem(ModItems.neural_quantum_processor);
        simpleItem(ModItems.nuclear_pasta);
        simpleItem(ModItems.non_fissile_uranium);
        simpleItem(ModItems.packaged_alumina_solution);
        simpleItem(ModItems.packaged_fuel);
        simpleItem(ModItems.packaged_oil);
        simpleItem(ModItems.packaged_heavy_oil_residue);
        simpleItem(ModItems.packaged_nitric_acid);
        simpleItem(ModItems.packaged_nitrogen_gas);
        simpleItem(ModItems.packaged_sulfuric_acid);
        simpleItem(ModItems.packaged_water);
        simpleItem(ModItems.plastic);
        simpleItem(ModItems.plutonium_fuel_rod);
        simpleItem(ModItems.plutonium_pellet);
        simpleItem(ModItems.plutonium_waste);
        simpleItem(ModItems.polymer_resin);
        simpleItem(ModItems.pressure_conversion_cube);
        simpleItem(ModItems.quartz_crystal);
        simpleItem(ModItems.quickwire);
        simpleItem(ModItems.radio_control_unit);
        simpleItem(ModItems.reanimated_sam);
        simpleItem(ModItems.rotor);
        simpleItem(ModItems.rubber);
        simpleItem(ModItems.reinforced_iron_plate);
        simpleItem(ModItems.sam);
        simpleItem(ModItems.screws);
        simpleItem(ModItems.silica);
        simpleItem(ModItems.sam_fluctuator);
        simpleItem(ModItems.stator);
        simpleItem(ModItems.singularity_cell);
        simpleItem(ModItems.smart_plating);
        simpleItem(ModItems.solid_biofuel);
        simpleItem(ModItems.steel_beam);
        simpleItem(ModItems.steel_ingot);
        simpleItem(ModItems.steel_pipe);
        simpleItem(ModItems.sulfur);
        simpleItem(ModItems.supercomputer);
        simpleItem(ModItems.superposition_oscillator);
        simpleItem(ModItems.thermal_propulsion_rocket);
        simpleItem(ModItems.time_crystal);
        simpleItem(ModItems.turbo_motor);
        simpleItem(ModItems.uranium);
        simpleItem(ModItems.uranium_waste);
        simpleItem(ModItems.uranium_fuel_rod);
        simpleItem(ModItems.versatile_framework);
        simpleItem(ModItems.wire);
        simpleItem(ModItems.wood);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Satiscraftory.MOD_ID, "item/" + item.getId().getPath()));
    }
}