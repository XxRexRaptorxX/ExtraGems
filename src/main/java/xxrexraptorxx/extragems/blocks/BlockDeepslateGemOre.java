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


public class BlockDeepslateGemOre extends Block {

	public BlockDeepslateGemOre() {
		super(Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.5F, 3.0F)
				.sound(SoundType.DEEPSLATE)
				.mapColor(MapColor.DEEPSLATE)
				.instrument(NoteBlockInstrument.BASEDRUM)
		);

	}

	@Override
	public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos) {
		return 4 + randomSource.nextInt(4);
	}

}