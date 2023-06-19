package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class BlockRuby extends Block {

	public BlockRuby() {
		super(BlockBehaviour.Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.AMETHYST)
				.mapColor(MapColor.COLOR_RED)
				.instrument(NoteBlockInstrument.BIT)
		);
	}

}