package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import xxrexraptorxx.extragems.main.References;


public class BlockAmethyst extends Block {

	public BlockAmethyst() {
		super(Properties.of(Material.METAL)
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.STONE)
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