package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;


public class BlockCrystal extends Block {

	public BlockCrystal() {
		super(Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY)
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.STONE)
		);
	}

}
