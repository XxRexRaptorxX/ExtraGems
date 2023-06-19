package xxrexraptorxx.extragems.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;


public class BlockTopaz extends Block {

	public BlockTopaz() {
		super(BlockBehaviour.Properties.of()
				.requiresCorrectToolForDrops()
				.strength(4.0F, 8.0F)
				.sound(SoundType.AMETHYST)
				.mapColor(MapColor.COLOR_YELLOW)
				.instrument(NoteBlockInstrument.BIT)
		);
	}
}