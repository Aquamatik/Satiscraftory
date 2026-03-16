package net.aqua.satiscraftory.item;

import net.aqua.satiscraftory.Satiscraftory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Satiscraftory.MOD_ID);

    public static final RegistryObject<Item> Limestone = Items.register("limestone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Caterium = Items.register("caterium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Sulfur = Items.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Bauxite = Items.register("bauxite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAM = Items.register("sam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Uranium = Items.register("uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> caterium_ingot = Items.register("caterium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> aluminum_ingot = Items.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> steel_ingot = Items.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ficsite_ingot = Items.register("ficsite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ficsite_trigon = Items.register("ficsite_trigon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> iron_plate = Items.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> iron_rod = Items.register("iron_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> screws = Items.register("screws",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> concrete = Items.register("concrete",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> reinforced_iron_plate = Items.register("reinforced_iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> wire = Items.register("wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> quickwire = Items.register("quickwire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> cable = Items.register("cable",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> copper_sheet = Items.register("copper_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> quartz_crystal = Items.register("quartz_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> silica = Items.register("silica",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> crystal_oscillator = Items.register("crystal_oscillator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> steel_pipe = Items.register("steel_pipe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> steel_beam = Items.register("steel_beam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> encased_industrial_beam = Items.register("encased_industrial_beam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> rotor = Items.register("rotor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> stator = Items.register("stator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> motor = Items.register("motor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> modular_frame = Items.register("modular_frame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> heavy_modular_frame = Items.register("heavy_modular_frame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> fused_modular_frame = Items.register("fused_modular_frame",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> plastic = Items.register("plastic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> rubber = Items.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> fabric = Items.register("fabric",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> polymer_resin = Items.register("polymer_resin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> circuit_board = Items.register("circuit_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AI_limiter = Items.register("ai_limiter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> high_speed_connector = Items.register("high-speed_connector",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> aluminum_scrap = Items.register("aluminum_scrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> alclad_aluminum_sheet = Items.register("alclad_aluminum_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> aluminum_casing = Items.register("aluminum_casing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> battery = Items.register("battery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> heat_sink = Items.register("heat_sink",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> cooling_system = Items.register("cooling_system",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> turbo_motor = Items.register("turbo_motor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> reanimated_sam = Items.register("reanimated_sam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> sam_fluctuator = Items.register("sam_fluctuator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> computer = Items.register("computer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> supercomputer = Items.register("supercomputer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> electromagnetic_control_rod = Items.register("electromagnetic_control_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> radio_control_unit = Items.register("radio_control_unit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> alien_protein = Items.register("alien_protein",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> alien_dna_capsule = Items.register("alien_dna_capsule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> mycelia = Items.register("mycelia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> wood = Items.register("wood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> biomass = Items.register("biomass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> solid_biofuel = Items.register("solid_biofuel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> empty_canister = Items.register("empty_canister",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> empty_fluid_tank = Items.register("empty_fluid_tank",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_water = Items.register("packaged_water",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_oil = Items.register("packaged_oil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_heavy_oil_residue = Items.register("packaged_heavy_oil_residue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_fuel = Items.register("packaged_fuel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_alumina_solution = Items.register("packaged_alumina_solution",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_sulfuric_acid = Items.register("packaged_sulfuric_acid",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_nitric_acid = Items.register("packaged_nitric_acid",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> packaged_nitrogen_gas = Items.register("packaged_nitrogen_gas",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> time_crystal = Items.register("time_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> dark_matter_crystal = Items.register("dark_matter_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> singularity_cell = Items.register("singularity_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pressure_conversion_cube = Items.register("pressure_conversion_cube",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> superposition_oscillator = Items.register("superposition_oscillator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> neural_quantum_processor = Items.register("neural-quantum_processor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> alien_power_matrix = Items.register("alien_power_matrix",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uranium_fuel_rod = Items.register("uranium_fuel_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> encased_uranium_cell = Items.register("encased_uranium_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> non_fissile_uranium = Items.register("non-fissile_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> uranium_waste = Items.register("uranium_waste",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> plutonium_fuel_rod = Items.register("plutonium_fuel_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> encased_plutonium_cell = Items.register("encased_plutonium_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> plutonium_pellet = Items.register("plutonium_pellet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> plutonium_waste = Items.register("plutonium_waste",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ficsonium_fuel_rod = Items.register("ficsonium_fuel_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ficsonium = Items.register("ficsonium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> smart_plating = Items.register("smart_plating",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> versatile_framework = Items.register("versatile_framework",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> automated_wiring = Items.register("automated_wiring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> modular_engine = Items.register("modular_engine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> adaptive_control_unit = Items.register("adaptive_control_unit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> assembly_director_system = Items.register("assembly_director_system",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> magnetic_field_generator = Items.register("magnetic_field_generator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> thermal_propulsion_rocket = Items.register("thermal_propulsion_rocket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> nuclear_pasta = Items.register("nuclear_pasta",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> biochemical_sculptor = Items.register("biochemical_sculptor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ballistic_warp_drive = Items.register("ballistic_warp_drive",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ai_expansion_server = Items.register("ai_expansion_server",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
