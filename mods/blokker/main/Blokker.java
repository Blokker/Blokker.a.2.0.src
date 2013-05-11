package mods.blokker.main;

import mods.blokker.stairs.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Blokker.modid, name = "Blokker by Polygong", version = "Pre-Alpha v2.1.2_110513")

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

	public class Blokker
	{
	
	@SidedProxy(clientSide = "mods.blokker.client.ClientProxy", serverSide = "mods.blokker.main.CommonProxy")
    public static CommonProxy proxy;
	
	public static final String modid = "Blokker";
	
	@Instance("Polygong_Blokker")
    public static Blokker instance;
   
	
	public static EnumToolMaterial Mithril = EnumHelper.addToolMaterial("Mithril", 1, 2475, 12.0F, 6, 10);
    public static EnumToolMaterial MithrilPick = EnumHelper.addToolMaterial("MithrilPick", 3, 2475, 16.0F, 4, 10);
    public static EnumToolMaterial MithrilShov = EnumHelper.addToolMaterial("MithrilShove", 0, 2475, 12.0F, 4, 10);
   

	public static CreativeTabs tabBlokkerBlocks = new CreativeTabBlokkerBlocks(CreativeTabs.getNextID(), "tabBlokkerBlocks");
    public static CreativeTabs tabBlokkerDecoration = new CreativeTabBlokkerDecoration(CreativeTabs.getNextID(), "tabBlokkerDecoration");
    public static CreativeTabs tabBlokkerStuff = new CreativeTabBlokkerStuff(CreativeTabs.getNextID(), "tabBlokkerStuff");

    
    public static Block MithrilOre;
    public static Block BoneOre;
	public static Block BlokkerRockBlocks;
	public static Block BlokkerFrameWorkBlocks;
	public static Block BlokkerGhostBlocks;
	public static Block Blocksteelberries;
	public static Block BlokkerCoal;
	public static Block GlowBlokker;
	public static Block Ornament;
	public static Block CorrugatedSheetdark;
	public static Block CorrugatedSheetlight;
	public static Block Reet;
    public static Block HeadStonefence;
    public static Block Stonebrickfence;
    public static Block mossyStonebrickfence;
    public static Block Cobblestonefence;
    public static Block mossyCobblestonefence;
    public static Block Dirtwallfence;
    public static Block Dirtbrickfence;
    public static Block Dirtbrickfinefence;
    public static Block Woodoakfence;
    public static Block Woodbirchfence;
    public static Block Woodjunglefence;
    public static Block Woodsprucefence;
    public static Block Woodblackfence;
    public static Block Woodgreenfence;
    public static Block fadedWreckfence;
    public static Block coloredWreckfence;
    public static Block BlokkerWoolBlocks;
    public static Block BlokkerWoodBlocks;

    /**
    public static BlockHalfSlab BlokkerSingleSlab;
    public static BlockHalfSlab BlokkerDoubleSlab;
    */
    
    public static Block HeadStoneStair;
    public static Block DirtwallStair;
    public static Block DirtbrickStair;
    public static Block DirtbrickfineStair;
    public static Block RoofStair;
    public static Block ReetStair;
    public static Block oakParquetStair;
    public static Block birchParquetStair;
    public static Block jungleParquetStair;
    public static Block spruceParquetStair;
    public static Block blackPlankStair;
    public static Block greenPlankStair;
    public static Block fadedWreckStair;
    public static Block coloredWreckStair;
    public static Block CorrugatedSheetdarkStair;
    public static Block CorrugatedSheetlightStair;
    public static Block BrickMossyStair;
    public static Block MossyStair;
    public static Block cleanstoneStair;
    public static Block dirtStair;
    public static Block sandStair;
    public static Block gravelStair;
    public static Block glassStair;
    public static Block blockSnowStair;
    public static Block BlockCoalStair;
    public static Block iceStair;
    public static Block blockSteelStair;
    public static Block blockGoldStair;
    public static Block blockRedstoneStair;
    public static Block blockDiamondStair;
    public static Block blockEmeraldStair;
    public static Block obsidianStair;
    
   
	public static Item Mithrilflake;
	public static Item ingotMithril;
    public static Item Mithrilvermit;
    public static Item Diamondform;
    public static Item Steelberries;
	public static Item CoalBrick;
	public static Item Battleaxe;
    public static Item MithrilPickaxe;
    public static Item Mithrilshovel;
    public static Item Fireball;
    public static Item jetpack;
    public static Item grenade;
    public static Item BlokkerColorstringItem;

	
   
    @cpw.mods.fml.common.Mod.PreInit
    public void PreInit(FMLPreInitializationEvent event)
    {
            System.out.println("Loading Blokker!");
           
            Configuration config = new Configuration(event.getSuggestedConfigurationFile());
            config.load();
           
            config.save(); 
    }
    
	@Init
	public void load(FMLInitializationEvent event)
	{
		
		MithrilOre = new MithrilOre(2850, Material.rock).setUnlocalizedName("blokker:mithrilore").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(MithrilOre, modid + (MithrilOre.getUnlocalizedName()));

				LanguageRegistry.addName(MithrilOre, "Mithril Ore");
		
		BoneOre = new BoneOre(2851, Material.rock).setUnlocalizedName("blokker:boneore").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BoneOre, modid + (BoneOre.getUnlocalizedName()));

				LanguageRegistry.addName(new ItemStack(BoneOre, 1, 0), "Bone Ore");
		
		BlokkerRockBlocks = new BlokkerRockBlocks(2860, Material.rock).setUnlocalizedName("Rocks_").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BlokkerRockBlocks, ItemBlokkerRockBlocks.class, modid + (BlokkerRockBlocks.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 0), "Headstone");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 1), "Dirtwall");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 2), "Dirtbrick");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 3), "Dirtbrick fine");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 4), "darkblue smooth Bricks");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 5), "darkred smooth Bricks");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 6), "red smooth Bricks");
				LanguageRegistry.addName(new ItemStack(BlokkerRockBlocks, 1, 7), "Roof");
				
		BlokkerFrameWorkBlocks = new BlokkerFrameWorkBlocks(2861, Material.rock).setUnlocalizedName("FrameWork_").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BlokkerFrameWorkBlocks, ItemBlokkerFrameWorkBlocks.class, modid + (BlokkerFrameWorkBlocks.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 0), "X Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 1), "L Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 2), "R Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 3), "P Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 4), "M Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 5), "H Framework");
				LanguageRegistry.addName(new ItemStack(BlokkerFrameWorkBlocks, 1, 6), "O Framework");

		BlokkerGhostBlocks = new BlokkerGhostBlocks(2862, Material.air).setUnlocalizedName("Ghost_").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BlokkerGhostBlocks, ItemBlokkerGhostBlocks.class, modid + (BlokkerGhostBlocks.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 0), "Ghost Brick");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 1), "Ghost Cleanstone");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 2), "Ghost Cobblestone");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 3), "Ghost Dirt");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 4), "Ghost Sandstone");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 5), "Ghost Bricksstone");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 6), "Ghost Brickstone mossy");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 7), "Ghost Cobblestone mossy");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 8), "Ghost Quartz");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 9), "Ghost Oak Wood");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 10), "Ghost Birch Wood");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 11), "Ghost Spruce Wood");
				LanguageRegistry.addName(new ItemStack(BlokkerGhostBlocks, 1, 12), "Ghost Jungle Wood");

		BlokkerWoolBlocks = new BlokkerWoolBlocks(2863, Material.cloth).setUnlocalizedName("Wool_").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundClothFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BlokkerWoolBlocks, ItemBlokkerWool.class, modid + (BlokkerWoolBlocks.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 0), "white Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 1), "orange Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 2), "magenta Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 3), "light blue Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 4), "yellow Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 5), "light green Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 6), "rosa Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 7), "dark grey Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 8), "light gray Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 9), "cyan Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 10), "purple Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 11), "dark blue Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 12), "brown Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 13), "dark green Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 14), "red Wool");
				LanguageRegistry.addName(new ItemStack(BlokkerWoolBlocks, 1, 15), "blackWool");
				
		BlokkerWoodBlocks = new BlokkerWoodBlocks(2864, Material.rock).setUnlocalizedName("Wood_").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);

				GameRegistry.registerBlock(BlokkerWoodBlocks, ItemWoodBlocks.class, modid + (BlokkerWoodBlocks.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 0), "Oak Parquet");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 1), "Birch Parquet");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 2), "Spruce Parquet");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 3), "Jungel Parquet");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 4), "black Planks");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 5), "green Planks");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 6), "faded Wreck");
				LanguageRegistry.addName(new ItemStack(BlokkerWoodBlocks, 1, 7), "colored Wreck");
				
		BlokkerCoal = new BlokkerCoal(2865, Material.rock).setUnlocalizedName("Blokker:blockCoal").setResistance(4.0F).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);
				
				GameRegistry.registerBlock(BlokkerCoal, modid + (BlokkerCoal.getUnlocalizedName()));
				
				LanguageRegistry.addName(BlokkerCoal, "Blokker Coal");
        		
		Blocksteelberries = (new Blocksteelberries(2866));
				
				GameRegistry.registerBlock(Blocksteelberries, modid + (Blocksteelberries.getUnlocalizedName()));
				
				LanguageRegistry.addName(Blocksteelberries, "Steelberries Bush");
        
		HeadStonefence = new BlockFence(2950, "Blokker:Rocks_0", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("HeadStonefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(HeadStonefence, "HeadStonefence");
				LanguageRegistry.addName(HeadStonefence, "HeadStone Fence");
				
		Stonebrickfence = new BlockFence(2951, "Blokker:Ghost_5", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Stonebrickfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Stonebrickfence, "Stonebrickfence");
				LanguageRegistry.addName(Stonebrickfence, "Stonebrick Fence");
				
		mossyStonebrickfence = new BlockFence(2952, "Blokker:Ghost_6", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("mossyStonebrickfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(mossyStonebrickfence, "mossyStonebrickfence");
				LanguageRegistry.addName(mossyStonebrickfence, "Stonebrick mossy Fence");
				
		Cobblestonefence = new BlockFence(2953, "Blokker:Ghost_2", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Cobblestonefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Cobblestonefence, "Cobblestonefence");
				LanguageRegistry.addName(Cobblestonefence, "Cobblestone Fence");
				
		mossyCobblestonefence = new BlockFence(2954, "Blokker:Ghost_7", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("mossyCobblestonefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(mossyCobblestonefence, "mossyCobblestonefence");
				LanguageRegistry.addName(mossyCobblestonefence, "Cobblestone mossy Fence");
				
		Dirtwallfence = new BlockFence(2955, "Blokker:Rocks_1", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Dirtwallfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Dirtwallfence, "Dirtwallfence");
				LanguageRegistry.addName(Dirtwallfence, "Dirtwall Fence");
				
		Dirtbrickfence = new BlockFence(2956, "Blokker:Rocks_2", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Dirtbrickfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Dirtbrickfence, "Dirtbrickfence");
				LanguageRegistry.addName(Dirtbrickfence, "Dirtbrick Fence");
				
		Dirtbrickfinefence = new BlockFence(2957, "Blokker:Rocks_3", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Dirtbrickfinefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Dirtbrickfinefence, "Dirtbrickfinefence");
				LanguageRegistry.addName(Dirtbrickfinefence, "Dirtbrickfine Fence");
				
		Woodoakfence = new BlockFence(2958, "Blokker:Ghost_9", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodoakfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodoakfence, "Woodoakfence");
				LanguageRegistry.addName(Woodoakfence, "Woodoak Fence");
				
		Woodbirchfence = new BlockFence(2959, "Blokker:Ghost_10", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodbirchfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodbirchfence, "Woodbirchfence");
				LanguageRegistry.addName(Woodbirchfence, "Woodbirch Fence");
				
		Woodjunglefence = new BlockFence(2960, "Blokker:Ghost_11", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodjunglefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodjunglefence, "Woodjunglefence");
				LanguageRegistry.addName(Woodjunglefence, "Woodjungle Fence");
				
		Woodsprucefence = new BlockFence(2961, "Blokker:Ghost_12", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodsprucefence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodsprucefence, "Woodsprucefence");
				LanguageRegistry.addName(Woodsprucefence, "Woodspruce Fence");
				
		Woodblackfence = new BlockFence(2962, "Blokker:Wood_4", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodblackfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodblackfence, "Woodblackfence");
				LanguageRegistry.addName(Woodblackfence, "Woodblack Fence");
				
		Woodgreenfence = new BlockFence(2963, "Blokker:Wood_5", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("Woodgreenfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(Woodgreenfence, "Woodgreenfence");
				LanguageRegistry.addName(Woodgreenfence, "Woodgreen Fence");
				
		fadedWreckfence = new BlockFence(2964, "Blokker:Wood_6", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("fadedWreckfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(fadedWreckfence, "fadedWreckfence");
				LanguageRegistry.addName(fadedWreckfence, "fadedWreck Fence");
				
		coloredWreckfence = new BlockFence(2965, "Blokker:Wood_7", Material.wood).setHardness(0.3F).setResistance(5F).setLightValue(0.0F).setUnlocalizedName("coloredWreckfence").setCreativeTab(Blokker.tabBlokkerDecoration);
				GameRegistry.registerBlock(coloredWreckfence, "coloredWreckfence");
				LanguageRegistry.addName(coloredWreckfence, "coloredWreck Fence");
		
		GlowBlokker = (new GlowBlokker(2966, Material.glass)).setHardness(0.3F).setLightValue(1.0F).setUnlocalizedName("Glow Blokker").setCreativeTab(Blokker.tabBlokkerDecoration);
				
				GameRegistry.registerBlock(GlowBlokker, "GlowBlokker");
						
				LanguageRegistry.addName(GlowBlokker,"Glow Blokker");    
          
		CorrugatedSheetdark = new BlockCorrugatedSheetdark(2967, Material.iron).setUnlocalizedName("Blokker:Steel_0").setHardness(2.5F).setResistance(11F).setStepSound(Block.soundMetalFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);
				 
				GameRegistry.registerBlock(CorrugatedSheetdark, "CorrugatedSheetdark");
				
				LanguageRegistry.addName(CorrugatedSheetdark, "dark Corrugated Sheet");  
                 
		CorrugatedSheetlight = new BlockCorrugatedSheetlight(2968, Material.iron).setUnlocalizedName("Blokker:Steel_1").setHardness(2.5F).setResistance(11F).setStepSound(Block.soundMetalFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);
				 
				GameRegistry.registerBlock(CorrugatedSheetlight, "CorrugatedSheetlight");
				
				LanguageRegistry.addName(CorrugatedSheetlight, "light Corrugated Sheet");  
                 
		Ornament = new BlockOrnament(2969, Material.iron).setUnlocalizedName("ornament").setHardness(2.5F).setResistance(11F).setStepSound(Block.soundMetalFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);
				 
				 GameRegistry.registerBlock(Ornament, "Ornament");
				 
				 LanguageRegistry.addName(Ornament, "Ornament");  
                 
		Reet = new BlockReet(2970, Material.leaves).setUnlocalizedName("reet").setHardness(0.2F).setResistance(1F).setStepSound(Block.soundGrassFootstep).setCreativeTab(Blokker.tabBlokkerBlocks);
				
				 GameRegistry.registerBlock(Reet, "Reet");
				 
				 LanguageRegistry.addName(Reet, "Reet");
		 
				 
		/**		 
				 
		BlokkerDoubleSlab = (BlockHalfSlab)(new HalfBlockWoodSlab(3045, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundStoneFootstep);
					
				GameRegistry.registerBlock(BlokkerDoubleSlab, "BlokkerDoubleSlab");			
				LanguageRegistry.addName(BlokkerDoubleSlab, "Blokker DoubleSlab");	
				
		BlokkerSingleSlab = (BlockHalfSlab)(new HalfBlockWoodSlab(3046, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Single Step").setCreativeTab(Blokker.tabBlokkerBlocks);
				        		
				GameRegistry.registerBlock(BlokkerSingleSlab, "BlokkerSingleSlab");
				LanguageRegistry.instance().addStringLocalization(((HalfBlockWoodSlab)BlokkerSingleSlab).getFullSlabName(0)+".name", " SingleSlab");
		*/
			
				 
		HeadStoneStair = new HeadStoneStair(3100, Blokker.BlokkerRockBlocks, 0 ).setUnlocalizedName("HeadStone Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
                 		 
				 GameRegistry.registerBlock(HeadStoneStair, "HeadStone Stair");
                 
				 LanguageRegistry.addName(HeadStoneStair, "HeadStone Stair");
				 
		DirtwallStair = new DirtwallStair(3101, Blokker.BlokkerRockBlocks, 1 ).setUnlocalizedName("Dirtwall Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(DirtwallStair, "DirtwallStair");
                 
				 LanguageRegistry.addName(DirtwallStair, "Dirtwall Stair");
				 
		DirtbrickStair = new DirtbrickStair(3102, Blokker.BlokkerRockBlocks, 2).setUnlocalizedName("Dirtbrick Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(DirtbrickStair, "DirtbrickStair");
                 
				 LanguageRegistry.addName(DirtbrickStair, "Dirtbrick Stair");
				 
		DirtbrickfineStair = new DirtbrickfineStair(3103, Blokker.BlokkerRockBlocks, 3).setUnlocalizedName("Dirtbrickfine Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(DirtbrickfineStair, "DirtbrickfineStair");
                 
				 LanguageRegistry.addName(DirtbrickfineStair, "Dirtbrickfine Stair");
				 
		RoofStair = new RoofStair(3104, Blokker.BlokkerRockBlocks, 7).setUnlocalizedName("Roof Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(RoofStair, "RoofStair");
                 
				 LanguageRegistry.addName(RoofStair, "Roof Stair");
			 
		ReetStair = new ReetStair(3105, Block.leaves, 0).setUnlocalizedName("Reet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(ReetStair, "ReetStair");
                 
				 LanguageRegistry.addName(ReetStair, "Reet Stair");
					 
		oakParquetStair = new oakParquetStair(3106, Blokker.BlokkerWoodBlocks, 0).setUnlocalizedName("oak Parquet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(oakParquetStair, "WoodoakStair");
                 
				 LanguageRegistry.addName(oakParquetStair, "Oak Wood Stair");
				 
		birchParquetStair = new birchParquetStair(3107, Blokker.BlokkerWoodBlocks, 1).setUnlocalizedName("birch Parquet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(birchParquetStair, "WoodbirchStair Stair");
                 
				 LanguageRegistry.addName(birchParquetStair, "Birch Wood Stair");
				 
		jungleParquetStair = new jungleParquetStair(3108, Blokker.BlokkerWoodBlocks, 2).setUnlocalizedName("jungle Parquet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(jungleParquetStair, "WoodjungleStair");
                 
				 LanguageRegistry.addName(jungleParquetStair, "Jungle Wood Stair");
				 
		spruceParquetStair = new spruceParquetStair(3109, Blokker.BlokkerWoodBlocks, 3).setUnlocalizedName("spruce Parquet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(spruceParquetStair, "WoodspruceStair");
                 
				 LanguageRegistry.addName(spruceParquetStair, "spruce Wood Stair");
				 
		blackPlankStair = new blackPlankStair(3110, Blokker.BlokkerWoodBlocks, 4).setUnlocalizedName("black Plank Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blackPlankStair, "WoodblackStair");
                 
				 LanguageRegistry.addName(blackPlankStair, "black Wood Stair");
				 
		greenPlankStair = new greenPlankStair(3111, Blokker.BlokkerWoodBlocks, 5).setUnlocalizedName("green Plank Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(greenPlankStair, "WoodgreenStair");
                 
				 LanguageRegistry.addName(greenPlankStair, "green Wood Stair");
				 
		fadedWreckStair = new fadedWreckStair(3112, Blokker.BlokkerWoodBlocks, 6).setUnlocalizedName("faded Wreck Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(fadedWreckStair, "fadedWreckStair");
                 
				 LanguageRegistry.addName(fadedWreckStair, "fadedWreck Stair");
				 
		coloredWreckStair = new coloredWreckStair(3113, Blokker.BlokkerWoodBlocks, 7).setUnlocalizedName("colored Wreck Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(coloredWreckStair, "coloredWreckStair");
                 
				 LanguageRegistry.addName(coloredWreckStair, "colored Wreck Stair");
				 
		CorrugatedSheetdarkStair = new CorrugatedSheetdarkStair(3114, Blokker.CorrugatedSheetdark, 0).setUnlocalizedName("dark Corrugated Sheet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(CorrugatedSheetdarkStair, "CorrugatedSheetdarkStair Stair");
                 
				 LanguageRegistry.addName(CorrugatedSheetdarkStair, "dark Corrugated Sheet Stair");
				 
		CorrugatedSheetlightStair = new CorrugatedSheetlightStair(3115, Blokker.CorrugatedSheetlight, 0).setUnlocalizedName("light Corrugated Sheet Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(CorrugatedSheetlightStair, "CorrugatedSheetlightStair");
                 
				 LanguageRegistry.addName(CorrugatedSheetlightStair, "light Corrugated Sheet Stair");
				 
		BrickMossyStair = new BrickMossyStair(3116, Block.stoneBrick, 1).setUnlocalizedName("mossy Brickstone Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(BrickMossyStair, "BrickMossyStair");
                 
				 LanguageRegistry.addName(BrickMossyStair, "mossy Brickstone Stair");
				 
		MossyStair = new MossyStair(3117, Block.cobblestoneMossy, 0).setUnlocalizedName("mossy Cobblestone Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(MossyStair, "MossyStair");
                 
				 LanguageRegistry.addName(MossyStair, "mossy Cobblestone Stair");
				 
		cleanstoneStair = new CorrugatedSheetlightStair(3118, Block.stone, 0).setUnlocalizedName("Cleanstone Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(cleanstoneStair, "cleanstoneStair");
                 
				 LanguageRegistry.addName(cleanstoneStair, "Cleanstone Stair");
				 
		dirtStair = new dirtStair(3119, Block.dirt, 0).setUnlocalizedName("Dirt Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(dirtStair, "dirtStair");
                 
				 LanguageRegistry.addName(dirtStair, "Dirt Stair");
				 
		sandStair = new sandStair(3120, Block.sand, 0).setUnlocalizedName("Sand Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(sandStair, "sandStair");
                 
				 LanguageRegistry.addName(sandStair, "Sand Stair");
				 
		gravelStair = new gravelStair(3121, Block.gravel, 0).setUnlocalizedName("Gravel Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(gravelStair, "gravelStair");
                 
				 LanguageRegistry.addName(gravelStair, "Gravel Stair");
				 
		glassStair = new glassStair(3122, Block.glass, 0).setUnlocalizedName("Glass Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(glassStair, "glassStair");
                 
				 LanguageRegistry.addName(glassStair, "Glass Stair");
				 
		blockSnowStair = new blockSnowStair(3123, Block.blockSnow, 0).setUnlocalizedName("Snow Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockSnowStair, "blockSnowStair");
                 
				 LanguageRegistry.addName(blockSnowStair, "Snow Stair");
				 
		BlockCoalStair = new BlockCoalStair(3124, Blokker.BlokkerCoal, 0).setUnlocalizedName("Coal Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(BlockCoalStair, "BlockCoalStair");
                 
				 LanguageRegistry.addName(BlockCoalStair, "Coal Stair");
				 
		iceStair = new iceStair(3125, Block.ice, 0).setUnlocalizedName("Ice Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(iceStair, "iceStair");
                 
				 LanguageRegistry.addName(iceStair, "Ice Stair");
				 
		blockSteelStair = new blockSteelStair(3126, Block.blockIron, 0).setUnlocalizedName("Steel Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockSteelStair, "blockSteelStair");
                 
				 LanguageRegistry.addName(blockSteelStair, "Steel Stair");
		
		blockGoldStair = new blockGoldStair(3127, Block.blockGold, 0).setUnlocalizedName("Gold Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockGoldStair, "blockGoldStair");
                 
				 LanguageRegistry.addName(blockGoldStair, "Gold Stair");
				 
		blockRedstoneStair = new blockRedstoneStair(3128, Block.blockRedstone, 0).setUnlocalizedName("Redstone Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockRedstoneStair, "blockRedstoneStair");
                 
				 LanguageRegistry.addName(blockRedstoneStair, "Redstone Stair");
				 
		blockDiamondStair = new blockDiamondStair(3129, Block.blockDiamond, 0).setUnlocalizedName("Diamond Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockDiamondStair, "blockDiamondStair");
                 
				 LanguageRegistry.addName(blockDiamondStair, "Diamond Stair");
				 
		blockEmeraldStair = new CorrugatedSheetlightStair(3130, Block.blockEmerald, 0).setUnlocalizedName("Emerald Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(blockEmeraldStair, "blockEmeraldStair");
                 
				 LanguageRegistry.addName(blockEmeraldStair, "Emerald Stair");
				 
		obsidianStair = new obsidianStair(3131, Block.obsidian, 0).setUnlocalizedName("Obsidian Stair").setCreativeTab(Blokker.tabBlokkerBlocks);
         		 
				 GameRegistry.registerBlock(obsidianStair, "obsidianStair");
                 
				 LanguageRegistry.addName(obsidianStair, "Obsidian Stair");
				 
				 
				 
		Mithrilflake = new ItemBlokker(3500).setUnlocalizedName("Mithrilflake");

				LanguageRegistry.addName(Mithrilflake, "Mithrilflake");
		
		Mithrilvermit = new Mithrilvermit(3501).setUnlocalizedName("Mithrilvermit");
	               
				LanguageRegistry.addName(Mithrilvermit, "Mithrilvermit");
				
		ingotMithril = new ingotMithril(3502).setUnlocalizedName("Mithrilingot");
                
				LanguageRegistry.addName(ingotMithril, "MithrilBarren"); 
		
		CoalBrick = new ItemBlokker(3503).setUnlocalizedName("CoalBrick");

				LanguageRegistry.addName(CoalBrick, "CoalBrick"); 
				
		Diamondform = new Diamondform(3504).setUnlocalizedName("Diamondform");
	             
				LanguageRegistry.addName(Diamondform, "Diamondform");
				
		Steelberries = new ItemSeedFood(3505, 4, 0.6F, Blokker.Blocksteelberries.blockID, Block.tilledField.blockID).setUnlocalizedName("Blokker:steelberries").setCreativeTab(Blokker.tabBlokkerDecoration);
				
				LanguageRegistry.addName(Steelberries, "Steel Berries");
				
		Battleaxe = new Battleaxe(3600, Mithril).setUnlocalizedName("Kriegsaxt").setCreativeTab(CreativeTabs.tabCombat).setFull3D().setMaxStackSize(1);
                
				LanguageRegistry.addName(Battleaxe, "Battleaxe");
		
		MithrilPickaxe = new MithrilPickaxe(3601, MithrilPick).setUnlocalizedName("Mithril Pickaxe").setCreativeTab(CreativeTabs.tabTools).setFull3D().setMaxStackSize(1);
               
				LanguageRegistry.addName(MithrilPickaxe, "Mithrilpickaxe");
		
		Mithrilshovel = new Mithrilshovel(3602, MithrilShov).setUnlocalizedName("Mithril Spaten").setCreativeTab(CreativeTabs.tabTools).setFull3D().setMaxStackSize(1);
                
				LanguageRegistry.addName(Mithrilshovel, "Mithrilshovel");
		
		Fireball = new Fireball(3700).setUnlocalizedName("Fireball");
                
				LanguageRegistry.addName(Fireball, "Fireball");
		
		jetpack = new ItemJetpack(3701).setUnlocalizedName("jetpack").setCreativeTab(CreativeTabs.tabTools);
                
				LanguageRegistry.addName(jetpack, "Jetpack");  
		
		grenade = new ItemGrenade(3702).setUnlocalizedName("granade").setCreativeTab(CreativeTabs.tabTools);
               
				LanguageRegistry.addName(grenade, "Granate");
                
		BlokkerColorstringItem = new BlokkerColorstringItem(3800).setUnlocalizedName("colorstring").setCreativeTab(Blokker.tabBlokkerDecoration);

				GameRegistry.registerItem(BlokkerColorstringItem, modid + (BlokkerColorstringItem.getUnlocalizedName().substring(5)));

				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 0), "white Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 1), "orange Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 2), "magenta Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 3), "light blue Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 4), "yellow Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 5), "light green Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 6), "rosa Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 7), "dark grey Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 8), "light gray Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 9), "cyan Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 10), "purple Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 11), "dark blue Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 12), "brown Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 13), "dark green Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 14), "red Colorstring");
				LanguageRegistry.addName(new ItemStack(BlokkerColorstringItem, 1, 15), "black Colorstring");		
				
				
				
				
				
				
				proxy.registerRenderThings();
				
				BlokkerCrafting.addRecipes();
				
				GameRegistry.registerWorldGenerator(new WorldGeneratorBlokker());
                
				MinecraftForge.addGrassSeed(new ItemStack(Item.potato), 1); 
				
                MinecraftForge.addGrassSeed(new ItemStack(Item.pumpkinSeeds), 1);
                
                MinecraftForge.addGrassSeed(new ItemStack(Item.melonSeeds), 1);
                
                MinecraftForge.addGrassSeed(new ItemStack(Item.carrot), 1);
                
                MinecraftForge.addGrassSeed(new ItemStack(Blokker.Steelberries), 1);
               
                GameRegistry.registerFuelHandler(new BlokkerFuelHandler());
                
                MinecraftForge.setToolClass(Battleaxe, "axe", 1);
                
                MinecraftForge.setToolClass(MithrilPickaxe, "pickaxe", 4);
                
                MinecraftForge.setBlockHarvestLevel(MithrilOre, "pickaxe", 4);
	}
	
	/**
	@cpw.mods.fml.common.Mod.PostInit
    public void PostInit(FMLPostInitializationEvent event)
    {
            Item.itemsList[BlokkerSingleSlab.blockID] = (new ItemSlab(BlokkerSingleSlab.blockID - 256, (BlockHalfSlab)BlokkerSingleSlab, (BlockHalfSlab)BlokkerDoubleSlab, false));
    }
	*/
}