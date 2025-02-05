package xxrexraptorxx.additionalstructures.config;

import net.minecraftforge.common.config.Config;
import xxrexraptorxx.additionalstructures.main.Reference;

@Config(modid = Reference.MODID, category = "structures", name = "Additional Structures - Structures")
public class ConfigStructures {


	@Config.Comment(value = "This value multiplies the spawnchance! E.g. spawnchance is 1000 and the config says 0.3   ==> 1000 x 0.3 = 300   '300' is now the new spawnchance.")
    @Config.RangeDouble(min = 0.1f, max = 10.0f)
	public static float generationModifier = 1.0f;
	
	@Config.Comment(value = "This are the chances of the structure types (higher value = rarer structure")
	@Config.RangeInt(min = 1)
    public static int spawnchanceBiggerCacti = 1000;
	
	@Config.RangeInt(min = 1)
    public static int spawnchanceLogs = 1000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSpawnAltars = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceBoats = 6000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceUndergroundBases = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceBushes = 2000;
	
	@Config.RangeInt(min = 1)
	public static int spawnchanceCamps = 1500;
	
	@Config.RangeInt(min = 1)
	public static int spawnchanceFallenTrees = 1500;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceDeadTrees = 1000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceDesertPillars = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceTombs = 3000;

	@Config.RangeInt(min = 1)
	public static int spawnchanceUndergroundDungeons = 3000;

	@Config.RangeInt(min = 1)
	public static int spawnchanceFarm = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceGrave = 4000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceIllagerHouses = 6000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceLavaFountain = 4000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceLogBundle = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceMayaTemple = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceMeteor = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceMineEntry = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceNetherPortals = 5000;

	@Config.RangeInt(min = 1)
	public static int spawnchanceNetherPillars = 3000;

	@Config.RangeInt(min = 1)
	public static int spawnchanceRuins = 4000;

	@Config.RangeInt(min = 1)
	public static int spawnchanceOasis = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchancePalms = 1000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceTemple = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchancePyramideDungeon = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceRocks = 1000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceTotems = 1500;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceScarecrow = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSnowmen = 1500;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSnowPiles = 1000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSphinx = 4000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSkulls = 2000;
	
	@Config.RangeInt(min = 1)
    public static int spawnchanceStonePillars = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceVillagerHouses = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceWallRuins = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceWheatBalls = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceWell = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceOthers = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSpecials = 30000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceBones = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceFossils = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceObsidianPillars = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceEndTowers = 3000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceEndCrystals = 2000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceEndBuildings = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchanceSpiderNests = 5000;
    
	@Config.RangeInt(min = 1)
	public static int spawnchancePyramides = 4000;
	
	@Config.RangeInt(min = 1)
	public static int spawnchanceNetherBuildings = 5000;
    
}
