package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class BlockAmethyst extends Block {

	public BlockAmethyst() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.AMETHYST)
				.mapColor(MapColor.COLOR_PURPLE)
				.instrument(NoteBlockInstrument.BIT)
		);
	}


	/** TEST
	private static MaterialColor getColor (String registryName) {
		if(registryName.contains("amethyst")) {
			return MaterialColor.COLOR_PURPLE;

		} else if(registryName.contains("ruby")) {
			return MaterialColor.COLOR_RED;

		} else if(registryName.contains("sapphire")) {
			return MaterialColor.COLOR_BLUE;

		} else if (registryName.contains("topaz")) {
			return MaterialColor.COLOR_YELLOW;

		} else if (registryName.contains("crystal")) {
			return MaterialColor.QUARTZ;

		} else {
			System.err.println("No material color can be selected. No matching registry name!");
			return MaterialColor.STONE;
		}
	}**/

}