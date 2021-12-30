package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;


public class BlockRuby extends Block {

	public BlockRuby() {
		super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.STONE)
		);
	}

}