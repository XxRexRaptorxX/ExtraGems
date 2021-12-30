package xxrexraptorxx.extragems.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.concurrent.ThreadLocalRandom;


public class BlockDeepslateGemOre extends Block {

	public BlockDeepslateGemOre() {
		super(Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
				.requiresCorrectToolForDrops()
				.strength(4.5F, 3.0F)
				.sound(SoundType.DEEPSLATE)
		);

	}

	@Override
	public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortune, int silktouch) {
		int random = ThreadLocalRandom.current().nextInt(4, 8 + 1);
		return silktouch == 0 ? random : 0;

	}

}