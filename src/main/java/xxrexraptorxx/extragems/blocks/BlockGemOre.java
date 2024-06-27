package xxrexraptorxx.extragems.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.concurrent.ThreadLocalRandom;


public class BlockGemOre extends Block {

	public BlockGemOre() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(3.0F, 5.0F)
				.sound(SoundType.STONE)
				.mapColor(MapColor.STONE)
				.instrument(NoteBlockInstrument.BASEDRUM)
		);

	}


	@Override
	public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos) {
		return 3 + randomSource.nextInt(4);
	}

}