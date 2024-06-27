package xxrexraptorxx.extragems.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.Nullable;

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
	public int getExpDrop(BlockState state, net.minecraft.world.level.LevelAccessor level, BlockPos pos, @Nullable BlockEntity blockEntity, @Nullable Entity breaker, ItemStack tool) {
		return UniformInt.of(3, 7).sample(level.getRandom());
	}

}